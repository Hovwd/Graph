package graph.model;

import java.util.Date;

/**
 * Created by developer on 30/10/2016.
 */
public class Comment {
    private long id;
    private String comment;
    private Date date;

    public Comment(long id, String comment, Date date) {
        this.id = id;
        this.comment = comment;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
