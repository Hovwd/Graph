package graph.model;

import java.util.Date;

/**
 * Created by developer on 30/10/2016.
 */
public class Job {
    private  final long id;
    private String title;
    private String location;
    private String respons;
    private String requruirment;
    private Date openDate;
    private Date deadLine;
    public Job(long id, String title, String location, String respons, String requruirment, Date openDate, Date deadLine) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.respons = respons;
        this.requruirment = requruirment;
        this.openDate = openDate;
        this.deadLine = deadLine;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getRespons() {
        return respons;
    }

    public void setRequruirment(String requruirment) {
        this.requruirment = requruirment;
    }

    public String getRequruirment() {
        return requruirment;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getDeadLine() {
        return deadLine;
    }
}
