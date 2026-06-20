public class Quiz2 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> System.out.println("T1执行"));
        Thread t2 = new Thread(() -> System.out.println("T2执行"));
        Thread t3 = new Thread(() -> System.out.println("T3执行"));

        t1.start();
        t1.join(); // 等待T1结束
        
        t2.start();
        t2.join(); // 等待T2结束
        
        t3.start(); // 启动T3
    }
}