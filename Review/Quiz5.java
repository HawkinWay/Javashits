package Review;

import java.io.*;

public class Quiz5 {
    public static void main(String[] args) throws Exception {
        // 1. 写入数据
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dest.txt"));
        dos.writeInt(101);
        dos.writeLong(123456L);
        dos.writeFloat(3.14159f);
        dos.close();

        // 2. 读取数据 (顺序必须和写入一致)
        DataInputStream dis = new DataInputStream(new FileInputStream("dest.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        dis.close();
    }
}