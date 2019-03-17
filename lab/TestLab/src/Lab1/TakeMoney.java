package Lab1;

public class TakeMoney {
	//1*50,1*20,2*5,3*1
	public int[] notes={50,20,5,5,1,1,1};
	public int[] state=new int[128];
	public TakeMoney(){
		//二进制数字上的各位倒序表示各张纸币是否使用，1代表使用，0代表不使用
		//例如1000001表示使用一张50元和一张1元
		for(int i=0;i<128;i++){
			this.state[i]=0;
			int t=i;
			for(int j=0;j<7;j++){
				int n=t%2;
				this.state[i]=this.state[i]+n*notes[j];
				t=t>>1;
			}		
		}
	
	}
	
	public int getResult(int x){//匹配x,成功匹配返回对应状态值,即数组下标,否则返回-1
		for(int i=0;i<128;i++){
		if(state[i]==x)return i;				
		}
		return -1;	
	}
	
	public boolean getBool(int x){//通过调用getResult返回匹配成功与否的信息
		int result=getResult(x);
		if(result==-1)return false;
		else return true;
	}
	/*
	public int[] seeResult(int x){
		int result=getResult(x);
		if(result==-1)return null;
		int[] ret=new int[7];
		int r=result;
		for(int i=0;i<7;i++){
			ret[i]=r%2;
			r=r>>1;
		}
		return ret;
	}
	*/
}
