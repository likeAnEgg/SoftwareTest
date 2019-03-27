package Lab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import javax.swing.filechooser.FileSystemView;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@RunWith(Parameterized.class)
public class gitTest {
	//private boolean started;
	private WebDriver driver=null;
	private WebDriverWait wait = null;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String lsid;
	private String lsname;
	private String lsgit;
	
	public gitTest(Object num,String x,String y,String z){
		this.lsid=x;
		this.lsname=y;
		this.lsgit=z;
	}
	

	@Before
	  public void setUp() throws Exception {
		  String driverPath = System.getProperty("user.dir") + "/src/Lab2/geckodriver.exe";
		  System.setProperty("webdriver.gecko.driver", driverPath);
		  driver = new FirefoxDriver();
		  baseUrl = "http://121.193.130.195:8800/login";
		  //driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		  //driver.manage().timeouts().setScriptTimeout(300, TimeUnit.SECONDS);
		  //driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		  wait = new WebDriverWait(driver, 59);
		  //
	
	  }
	
	@Test
	public void testIt() throws Exception {	
		Thread.sleep(3000);
		try{
		driver.get(baseUrl);
		}
		catch(Exception e){System.out.println("SLOW GET");Thread.sleep(5000);}
		finally{
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("id")));
	    driver.findElement(By.name("id")).clear();
	    driver.findElement(By.name("id")).sendKeys(lsid);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(lsid.substring(4));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_login")));
	    WebElement lg=driver.findElement(By.id("btn_login"));
	    lg.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("student-id")));
	    String wsid = driver.findElement(By.id("student-id")).getText();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("student-name")));
	    String wsname = driver.findElement(By.id("student-name")).getText();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("student-git")));
	    String wsgit = driver.findElement(By.id("student-git")).getText();	    
	    assertEquals(lsid,wsid);
	    assertEquals(lsname,wsname);
	    assertEquals(lsgit, wsgit);
	    try{
	    	driver.quit();
	    }catch(Exception e){System.out.println("SLOW QUIT");Thread.sleep(3000);}
	    finally{Thread.sleep(2000);}
		}
	    /*
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }*/
	    
	  }
	
	@Parameters
	public static Collection<Object[]> getDate(){
		
		return Arrays.asList(new Object[][]{
			{"1","3016218051","�˽�","https://github.com/popboykingdjko"},
			{"2","3016218052","��С�","https://github.com/xiaoxuaoj"},
			{"3","3016218053","����ˮ","https://github.com/nbdfls"},
		 	{"4","3016218054","����Ⱥ","https://github.com/hyqzz1"},
			{"5","3016218055","������",""},
			{"6","3016218056","���","https://github.com/FBIbaby"},
			{"7","3016218057","���","https://github.com/riginAI/test"},
			{"8","3016218058","�","https://github.com/likai3016218058"},
			{"9","3016218059","���ǿ�","https://github.com/forAragaki/Software-Testing.git"},
			{"10","3016218060","������","https://github.com/liuchongwei1998"},
			{"11","3016218061","����ɭ","https://github.com/liuyuesen"},
			{"12","3016218062","¥��","https://github.com/loulin206"},
			{"13","3016218063","������","https://github.com/acan777"},
			{"14","3016218064","ʯ���","https://github.com/Winbeeone/Hello-GitHub"},
			{"15","3016218065","����","https://github.com/tangsongTJU"},
			{"16","3016218066","���Ӻ�","https://github.com/LITTLEEEEE/st.git"},
			{"17","3016218067","����","https://github.com/WangChen0902"},
			{"18","3016218068","����","https://github.com/skye0207"},
			{"19","3016218069","����","https://github.com/wanglei201810/HHH.git"},
			{"20","3016218070","�Ľ���",""},
			{"21","3016218072","����Ÿ","https://github.com/Panda216"},
			{"22","3016218073","������","https://github.com/AQITF/software-testing-course"},
			{"23","3016218075","����Զ","https://github.com/Tyrusmacv"},
			{"24","3016218076","�Ŵ�","https://github.com/Tyrusmacv"},
			{"25","3016218077","�ſ���","https://github.com/DanielKZhang"},
			{"26","3016218078","�����","https://gitee.com/zqfgly"},
			{"27","3016230028","����ϼ","https://github.com/XiaZiXia"},
			{"28","3016204130","����",""},
			{"29","3016218079","������",""},
			{"30","3016218080","������","https://github.com/cyytju"},
			{"31","3016218081","�½�",""},
			{"32","3016218083","���B","https://github.com/HaoFuTju"},
			{"33","3016218084","����ܲ","https://github.com/Ziyiiii"},
			{"34","3016218085","������","https://github.com/guopeiming"},
			{"35","3016218086","�����",""},
			{"36","3016218087","������","https://github.com/brightknight177"},
			{"37","3016218088","��־��","https://github.com/zhijielee"},
			{"38","3016218089","������","https://github.com/guguguzi"},
			{"39","3016218090","������","https://github.com/EchoLiuYinan"},
			{"40","3016218091","¬�","https://github.com/iiTachi/"},
			{"41","3016218092","����",""},
			{"42","3016218093","ŷ�����","https://github.com/SouperO"},
			{"43","3016218094","������","https://github.com/qyhxxx"},
			{"44","3016218096","������","https://github.com/SunCubeIsMyID"},
			{"45","3016218097","������","https://github.com/passerw"},
			{"46","3016218098","����","https://github.com/old-yellow"},
			{"47","3016218099","��һ��","https://github.com/yibowang98"},
			{"48","3016218100","κ��","https://github.com/Landy0524"},
			{"49","3016218101","������","https://github.com/nkaccounting"},
			{"50","3016218102","�ų���","https://github.com/PlatinumYi"},
			{"51","3016218103","�ſ�","https://github.com/zk990202"},
			{"52","3016218104","��ε��","https://github.com/Zwh0508"},
			{"53","3016218105","��ӱ��","https://github.com/newyingyi"},
			{"54","3016218106","�Լ��","https://github.com/uareagay"},
			{"55","3016218107","����","https://github.com/LeilaniZ"},
			{"56","3016204310","�����","https://github.com/hshsilver/softwaretest"},
			{"57","3016207516","�����",""},
			{"58","3016218108","����","https://github.com/Barbra0613"},
			{"59","3016218109","��ŵ","https://github.com/Nicole1772"},
			{"60","3016218110","��ɭ��","https://github.com/csl784513390"},
			{"61","3016218111","���Ӻ�","https://github.com/czhxbz"},
			{"62","3016218112","�޸�","https://github.com/whyNotwh"},
			{"63","3016218113","������","https://github.com/tjugwt"},
			{"64","3016218114","��̹","https://github.com/tjugwt"},
			{"65","3016218115","����","https://github.com/BoHuyyy"},
			{"66","3016218116","������","https://github.com/mangoSteve"},
			{"67","3016218117","�����","https://github.com/mangoSteve"},
			{"68","3016218118","����ʢ","https://github.com/AndrewJYS"},
			{"69","3016218119","������","https://github.com/liphcpp"},
			{"70","3016218120","���Ÿ�","https://github.com/tju-lzg"},
			{"71","3016218121","��Ȼ","https://github.com/Nfboys"},
			{"72","3016218122","������","https://github.com/tcklll/software-testing.git"},
			{"73","3016218123","�����","https://github.com/MHYpony"},
			{"74","3016218124","�Ϸ���","https://github.com/FANBoMeng3016218124/swTest.git"},
			{"75","3016218125","������","https://github.com/tjwhm"},
			{"76","3016218126","������","https://github.com/hnwyx/software-testing"},
			{"77","3016218127","������","https://github.com/wwwwangyiting"},
			{"78","3016218128","Фҵ��","https://github.com/HNSHongTian/SoftwareTesting"},
			{"79","3016218129","���躭","https://github.com/linghanxu-tju/software_testing.git"},
			{"80","3016218130","����","https://github.com/YWlancer"},
			{"81","3016218131","�ż���","https://github.com/oikawamomo/software_test"},
			{"82","3016218133","�Խ�","https://github.com/ZJ921"},
			{"83","3016218134","������","https://github.com/zzzyyyrrr"},
			{"84","3016218135","����","https://github.com/tjudoubi"},
			{"85","3014218120","����","https://github.com/SoSoSorry"},
			{"86","3016218136","���κ϶�����ľ��","https://github.com/users/azzr997/projects/1"},
			{"87","3016218137","���ַ�","https://github.com/SryTo/SoftwareTesting.git"},
			{"88","3016218138","����","https://github.com/STHARUKI"},
			{"89","3016218139","���","https://github.com/skadoodleR"},
			{"90","3016218140","��𩻪","https://github.com/Potmon/STT2016.git"},
			{"91","3016218141","�����","https://github.com/everlastingstars"},
			{"92","3016218142","��ɯ���ᡤ����������","https://github.com/Lothric19"},
			{"93","3016218143","�����","https://github.com/bxsj/"},
			{"94","3016218144","�����","https://github.com/0-Avalon-0"},
			{"95","3016218145","������","https://github.com/mssjliwenxu"},
			{"96","3016218146","������","https://github.com/MaoMaoChina"},
			{"97","3016218147","������","https://github.com/LiuChunY"},
			{"98","3016218148","����","https://github.com/liuzhidemaomao"},
			{"99","3016218149","¦����","https://github.com/Lou11300306?tab=projects"},
			{"100","3016218150","����","https://github.com/Horsepower8888"},
			{"101","3016218151","�˷���","https://github.com/Skypfx/softwareTesting"},
			{"102","3016218152","ʯ����","https://github.com/colindying"},
			{"103","3016218153","ʷ����","https://github.com/htmmd27"},
			{"104","3016218154","ʷ��","https://github.com/tjuspAIC/Software-Testing"},
			{"105","3016218155","����","https://github.com/Vincent-Sun"},
			{"106","3016218156","̷����","https://github.com/980801"},
			{"107","3016218157","����","https://github.com/ChenHsing"},
			{"108","3016218158","����","https://github.com/yangmeng19980420"},
			{"109","3016218159","�Ż���","https://github.com/Ives66"},
			{"110","3016218160","�Ż�","https://github.com/zhuang12/SoftwareTest.git"},
			{"111","3016218161","������","https://github.com/michellezyw"},
			{"112","3016218162","��ݼ��","https://github.com/Cyphexl"},
			{"113","3016218163","����ع","https://github.com/lazygirlyu/homework"},
			{"114","3016218164","ף����","https://github.com/GZhuJJ/SoftwareTestingCourse "},
			{"115","3016207275","���","https://github.com/Lzhaohui"},
			{"116","3016214077","������","https://github.com/ZhaoMingYang-tju"},
			{"117","3016218165","���ι�������������","https://github.com/azhar241892"},
			{"118","3016218166","�����","https://github.com/husuhusuhusu"},
			{"119","3016218167","������","https://github.com/DemonTimor"},
			{"120","3016218168","����","https://github.com/JoHnHC"},
			{"121","3016218169","���","https://github.com/ritian-hh"},
			{"122","3016218170","�ƶ�÷","https://github.com/hdm926"},
			{"123","3016218171","������","https://github.com/AWenXiong"},
			{"124","3016218172","������","https://github.com/SSFDLware/software-testing"},
			{"125","3016218173","������","https://github.com/yangyi66"},
			{"126","3016218174","���ĺ�","https://gitee.com/tju_hei/software_test.git"},
			{"127","3016218175","����","https://github.com/liuyang806"},
			{"128","3016218176","Ī����","mcyatom@gmail.com"},
			{"129","3016218177","������","https://github.com/ElegantQiu"},
			{"130","3016218178","������","https://github.com/sqq7777"},
			{"131","3016218179","������","https://github.com/suimingben"},
			{"132","3016218180","������","https://github.com/sqis777?tab=repositories"},
			{"133","3016218181","���","https://culturepanda.github.io/SoftwareTesting/"},
			{"134","3016218182","��־��","https://github.com/YourBrotherTT/softwareTesting.git"},
			{"135","3016218183","����","https://github.com/guuuuji/Software-test.git"},
			{"136","3016218184","л����","https://github.com/fallentree"},
			{"137","3016218186","Ҷ����","https://github.com/MarcusNerva"},
			{"138","3016218187","�������������������","https://github.com/ilgarrr"},
			{"139","3016218188","������","https://github.com/githaub/homework.git"},
			{"140","3016218189","������","https://github.com/llmgpty/tjuscsst.git"},
			{"141","3016218190","������","https://github.com/ZhonglinZ"},
			{"142","3016218191","ף��Ԫ","https://github.com/ZHUKAIYUAN0/test"},
			{"143","3016218192","�����","https://github.com/jianxin-YL"}, 
		});	
		
	}
	
	  


}
