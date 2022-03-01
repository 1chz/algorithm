package practice;

import java.util.logging.Logger;

public class Deadlock {
    private static final Logger logger = Logger.getLogger(Deadlock.class.getName());

    public static void main(String[] args) {
        Integer lock1 = 1;
        Integer lock2 = 2;

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                logger.info("t1 got lock1. now going to try to get a lock2");
                synchronized (lock2) {
                    logger.info("t1 got lock2");
                }
                logger.info("If this message is printed, it means that t1 has acquired lock2");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                logger.info("t2 got lock2. now going to try to get a lock1");
                synchronized (lock1) {
                    logger.info("t2 got lock1");
                }
                logger.info("If this message is printed, it means that t2 has acquired lock1");
            }
        });

        t1.start();
        t2.start();
    }
}
