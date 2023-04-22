package order.Do;

import java.util.Arrays;
import java.util.Date;

public class High_speed_rail {
    private String id;
    private String name;
    private Date starTime;
    private Date endTime;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "High_speed_rail{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", starTime=" + starTime +
                ", endTime=" + endTime +
                ", arr=" + Arrays.toString(arr) +
                ", seatNum='" + seatNum + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public High_speed_rail(String id, String name, Date starTime, Date endTime, String[] arr, String seatNum) {
        this.id = id;
        this.name = name;
        this.starTime = starTime;
        this.endTime = endTime;
        this.arr = arr;
        this.seatNum = seatNum;
    }

    private String[] arr;//站点
    private String seatNum;//座位号
}
