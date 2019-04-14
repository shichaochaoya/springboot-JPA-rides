package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Document
public class Comment {

    @Id
    private String id;
    private String comment;
    private Integer star;
    private Date createDate = new Date();
    private Map<String ,String> tags = new HashMap<>();

    public Comment(String id, String comment, Map<String, String> tags,Integer star) {
        this.star = star;
        this.id = id;
        this.comment = comment;
        this.tags = tags;
    }

    public Comment(String id, String comment, Date createDate,Integer star) {
        this.star = star;
        this.id = id;
        this.comment = comment;
        this.createDate = createDate;
    }

    public Comment(String id, String comment, Date createDate, Map<String, String> tags,Integer star) {
        this.star = star;
        this.id = id;
        this.comment = comment;
        this.createDate = createDate;
        this.tags = tags;
    }

    public Comment(String id, String comment,Integer star) {
        this.star = star;
        this.id = id;
        this.comment = comment;
    }

    public Comment() {
    }


    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }
}
