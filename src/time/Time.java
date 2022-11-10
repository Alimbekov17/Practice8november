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
        if (getHour() < 10 && getMinute() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()));
        } else if (getHour() < 10 && getMinute() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + (getSecond()));
        } else if (getHour() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + "0" + (getSecond()));
        } else if (getMinute() < 10 && getSecond() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()));
        } else if (getHour() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + (getSecond()));
        } else if (getMinute() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + (getSecond()));
        } else if (getSecond() < 10){
            System.out.println(getHour() + ":" + getMinute() + ":" + "0" + (getSecond()));
        } else {
            System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()));
        }
    }
    void nextSecond(){
        System.out.println("Next second");
        if (getHour() < 10 && getMinute() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()+1));
        } else if (getHour() < 10 && getMinute() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + (getSecond()+1));
        } else if (getHour() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + "0" + (getSecond()+1));
        } else if (getMinute() < 10 && getSecond() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()+1));
        } else if (getHour() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + (getSecond()+1));
        } else if (getMinute() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + (getSecond()+1));
        } else if (getSecond() < 10){
            System.out.println(getHour() + ":" + getMinute() + ":" + "0" + (getSecond()+1));
        } else {
            System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()+1));
        }
    }
    void previousSecond(){
        System.out.println("Previous second");
        if (getHour() < 10 && getMinute() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()-1));
        } else if (getHour() < 10 && getMinute() < 10){
            System.out.println("0" + getHour() + ":" + "0" + getMinute() + ":" + (getSecond()-1));
        } else if (getHour() < 10 && getSecond() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + "0" + (getSecond()-1));
        } else if (getMinute() < 10 && getSecond() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + "0" + (getSecond()-1));
        } else if (getHour() < 10){
            System.out.println("0" + getHour() + ":" + getMinute() + ":" + (getSecond()-1));
        } else if (getMinute() < 10){
            System.out.println(getHour() + ":" + "0" + getMinute() + ":" + (getSecond()-1));
        } else if (getSecond() < 10){
            System.out.println(getHour() + ":" + getMinute() + ":" + "0" + (getSecond()-1));
        } else {
            System.out.println(getHour() + ":" + getMinute() + ":" + (getSecond()-1));
        }
    }
}
