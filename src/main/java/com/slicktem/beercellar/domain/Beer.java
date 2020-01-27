package com.slicktem.beercellar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="beers")
public class Beer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition="TEXT")
    private String summary;

    private String avatarLink;

    private Float alcoholPercentage;

    private Float score;

    @OneToMany
    private List<BeerComment> comments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public Float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(Float alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public List<BeerComment> getComments() {
        return comments;
    }

    public void setComments(List<BeerComment> comments) {
        this.comments = comments;
    }
}
