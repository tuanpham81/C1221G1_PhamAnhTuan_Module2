package ss4_lop_va_doi_tuong.bai_tap.stop_watch;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 5000; i++) {
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+ "millis");

    }
}
