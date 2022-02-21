package ss4_lop_va_doi_tuong.bai_tap.stop_watch;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }
}
