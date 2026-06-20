public class Quiz1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName());
                try { Thread.sleep(300); } catch (Exception e) {}
            }
        };
        new Thread(r, "线程A").start();
        new Thread(r, "线程B").start();
    }
}