import java.util.Scanner;

public class Grade {

    // 方法 1：输入成绩
    public static void inputScores(int[] scores, int n, Scanner sc) {
        /********** Begin *********/
        for(int i = 0; i < n; i++){
            System.out.print("请输入第 " + (i + 1) +" 个学生的成绩：");
            int score = sc.nextInt();
            scores[i] = score;
        }
        
        /********** End **********/
    }

    // 方法 2：计算平均值
    public static double calculateAverage(int[] scores, int n) {
        /********** Begin *********/
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scores[i];
        }
        double averange = sum / n;
        return averange;

        /********** End **********/
    }

    // 方法 3：计算最大值
    public static int findMax(int[] scores, int n) {
        int maxVal  = scores[0];
        /********** Begin *********/
        for(int i = 0; i < n; i++){
            if(scores[i] > maxVal){
                maxVal = scores[i];
            }
        }
        /********** End **********/
        return maxVal;
    }

    public static void main(String[] args) {
        /********** Begin *********/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("请输入学生人数：");
        int n = sc.nextInt();
        int[] scores = new int[100];
        inputScores(scores, n, sc);
        
        double avg = calculateAverage(scores, n);
        
        int max = findMax(scores, n);

        System.out.println("平均成绩：" + avg);
        System.out.print("最高成绩：" + max);
        /********** End **********/
    }
}