package com.example.AlabsTest;

import java.sql.Date;
import java.sql.Timestamp;

public class Item {
    private Long id;

    private Timestamp created_at;
    private Timestamp updated_at;
    private Date deadline_date;

    private Short is_deleted;

    private String name;

    private Integer count;

    public Item(Date deadline_date, String name, Integer count) {
        this.deadline_date = deadline_date;
        this.name = name;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Date getDeadline_date() {
        return deadline_date;
    }

    public void setDeadline_date(Date deadline_date) {
        this.deadline_date = deadline_date;
    }

    public Short getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Short is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
