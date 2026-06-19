import java.util.Scanner;

// notice: char in Java:
// scanner.next().charAt(0)	读取字符串后取第一个字符
// scanner.nextLine().charAt(0)	读取整行后取第一个字符

public class GuessNumberMulti {
    public void guess(int target) {
        /********** Begin *********/
        Scanner sc = new Scanner(System.in);
        char agn;
        do{
            int cnt = 0;
            System.out.println("猜数字游戏（1~100）");
            while(true){
                int num = sc.nextInt();
                cnt += 1;
                if(num > target){
                    System.out.println("太大了！");
                }
                else if(num < target){
                    System.out.println("太小了！");
                }
                else{
                    System.out.println("猜对了！共猜了 " + cnt + " 次");
                    break;
                }
            }
            System.out.print("是否再来一局？(y/n)：");
            agn = sc.next().charAt(0);                  
        }while(agn == 'Y' || agn == 'y');

        System.out.println("游戏结束。");
        sc.close();
        /********** End **********/
    }
}
