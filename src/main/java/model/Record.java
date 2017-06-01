package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Entity for model.record
 * The product must have a name.
 * The rest of the data is not necessary for the existence of the agreement
 * and can be edited later.
 * By default, the contract is not active on the database side
 *
 * @author Rafal Staszel
 */
@Entity
public class Record {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nrTrade;
    @NotEmpty
    private String system;
    private String fromTime;
    private String toTime;
    private int income;
    private String scale;
    private boolean active;

    public Record(int id) {
        this.id = id;
    }

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

    public Record(String nrTrade, String system, String fromTime, String toTime, int income, String scale, boolean active) {
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
}
