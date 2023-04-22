package order.Do;

import java.util.Date;

public class Oredr extends High_speed_rail{

    private String sfz;

    private String id;

    private float Money;

    private  Date creatOredrTime;

    public Oredr(String id, String name, Date starTime, Date endTime, String[] arr, String seatNum, String sfz, String id1, float money, Date creatOredrTime) {
        super(id, name, starTime, endTime, arr, seatNum);
        this.sfz = sfz;
        this.id = id1;
        Money = money;
        this.creatOredrTime = creatOredrTime;
    }

    public Oredr(String id, String name, Date starTime, Date endTime, String[] arr, String seatNum) {
        super(id, name, starTime, endTime, arr, seatNum);
    }

    @Override
    public String toString() {
        return "Oredr{" +
                "sfz='" + sfz + '\'' +
                ", id='" + id + '\'' +
                ", Money=" + Money +
                ", creatOredrTime=" + creatOredrTime +
                '}';
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public float getMoney() {
        return Money;
    }

    public void setMoney(float money) {
        Money = money;
    }

    public Date getCreatOredrTime() {
        return creatOredrTime;
    }

    public void setCreatOredrTime(Date creatOredrTime) {
        this.creatOredrTime = creatOredrTime;
    }
}
