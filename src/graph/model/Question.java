package graph.model;

import java.util.Date;

/**
 * Created by developer on 30/10/2016.
 */
public class Question {
    private long id;
    private String title;
    private String question;
    private Date date;
    public Question(long id, String title, String question, Date date) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
