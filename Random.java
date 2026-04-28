import java.util.Random;

public class RandomBasic{
	// 无参构造，创建Random对象
	Random rand = new Random();
	
	// 调用方法生成随机数
	// nextInt(100):生成0~99的证书； +1后范围时1~100
	int randomNum = rand.nextInt(100) + 1;
	System.out.println("1~100的随机整数: " + randomNum);
}
