package time;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    void getTime(){
        System.out.println("Current time");
        System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()));
    }
    void nextSecond(){
        System.out.println("Next second");
        System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()+1));
    }
    void previousSecond(){
        System.out.println("Previous second");
        System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()-1));
    }
}
