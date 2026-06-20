package Review;

import java.io.*;

public class Quiz4 {
    public static void main(String[] args) throws Exception {
        // 1. 写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("broadcast.txt"));
        bw.write("天气预报："); bw.newLine();
        bw.write("北京晴"); bw.newLine();
        bw.write("上海多云，有小雨"); bw.newLine();
        bw.write("广州晴，有时多云");
        bw.close();

        // 2. 读取文件
        BufferedReader br = new BufferedReader(new FileReader("broadcast.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}