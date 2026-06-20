public class Quiz3 {
    // 使用 volatile 保证线程间的可见性
    private static volatile boolean running = true;

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            while (running) {
                System.out.println("t1");
                try { Thread.sleep(100); } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(500); } catch (Exception e) {} // 运行一会儿再停止t1
            running = false; 
            System.out.println("t2通知t1停止");
        });

        t1.start();
        t2.start();
    }
}