package com.dshevchenkoo.timesheet.domain;

import javax.persistence.*;

@Entity
public class TeachingGroup {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String groupNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public TeachingGroup() {
        this.groupNumber = "";
    }

    public TeachingGroup(String groupNumber, User user)
    {
        this.author = user;
        this.groupNumber = groupNumber;
    }

    public String getAuthorName(){
        return author != null ? author.getUsername() : "<none>";
    }

    public void setGroupNumber(String groupNumber){
        this.groupNumber = groupNumber;
    }
    public String getGroupNumber(){
        return groupNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
