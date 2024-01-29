package fr.solacroup.myfirstapplication.domain;

import java.util.Date;

public class Task {
    private Date date;
    private String title;

    private Category category;

    private Priority priority;

    private Boolean done;

    public Task(Date date, String title, Category category, Priority priority, Boolean done, Date start_date, Date end_date) {
        this.date = date;
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.done = done;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    private Date start_date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    private Date end_date;


}
