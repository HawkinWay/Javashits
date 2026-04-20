// Scanner属于输入流，用于读取用户在控制台输入的数据

// 导入类
import java.util.Scanner;

public class InputDemo{
	public static void main(String[] arg){
		// 创建对象，关联标准输入（控制台）
		Scanner sc = new Scanner(System.in);

		// 读取不同类型的输入
		System.out.print("请输入整数：");
		int num = sc.nextInt();	//读取整数
		
		System.out.print("请输入小数：");
		double d = sc.nextDouble();	// 读取小数

		System.out.print("请输入字符串：");
		String str = sc.next();	//读取字符串（以空格/回车分隔）
		
		// 关闭Scanner，释放资源
		sc.close();

		// 输出验证读取结果
		System.out.println("你输入的整数:" + num);
		System.out.println("你输入的小数:" + d);
		System.out.println("你输入的字符串:" + str);

	}
}
