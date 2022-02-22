package ss4_lop_va_doi_tuong.bai_tap.stop_watch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {  // = public void setStartTime
        this.startTime = System.currentTimeMillis();
    }

    public void stop() { // = public void setEndTime
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }
}
