package model;

import javax.persistence.*;

/**
 * Created by Rafał on 2017-05-27.
 */
@Entity
@Table(name = "BlueTest")
public class Record {



    // temporary variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nrTrade;
    private String system;
    private String fromTime;
    private String toTime;
    private int income;
    private String scale;
    private boolean active;


    public Record(int id, String nrTrade, String system, String fromTime, String toTime, int income, String scale, boolean active) {
        this.id = id;
        this.nrTrade = nrTrade;
        this.system = system;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.income = income;
        this.scale = scale;
        this.active = active;
    }

    public Record( String nrTrade, String system, String fromTime, String toTime, int income, String scale, boolean active) {
        this.nrTrade = nrTrade;
        this.system = system;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.income = income;
        this.scale = scale;
        this.active = active;
    }


    public Record() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrTrade() {
        return nrTrade;
    }

    public void setNrTrade(String nrTrade) {
        this.nrTrade = nrTrade;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Umowa{" +
                "id=" + id +
                ", nrTrade='" + nrTrade + '\'' +
                ", system='" + system + '\'' +
                ", fromTime='" + fromTime + '\'' +
                ", toTime='" + toTime + '\'' +
                ", income=" + income +
                ", scale='" + scale + '\'' +
                ", active=" + active +
                '}';
    }
}
