package Lab1;

public class TakeMoney {
	//1*50,1*20,2*5,3*1
	public int[] notes={50,20,5,5,1,1,1};
	public int[] state=new int[128];
	public TakeMoney(){
		//�����������ϵĸ�λ�����ʾ����ֽ���Ƿ�ʹ�ã�1����ʹ�ã�0����ʹ��
		//����1000001��ʾʹ��һ��50Ԫ��һ��1Ԫ
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
	
	public int getResult(int x){//ƥ��x,�ɹ�ƥ�䷵�ض�Ӧ״ֵ̬,�������±�,���򷵻�-1
		for(int i=0;i<128;i++){
		if(state[i]==x)return i;				
		}
		return -1;	
	}
	
	public boolean getBool(int x){//ͨ������getResult����ƥ��ɹ�������Ϣ
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
