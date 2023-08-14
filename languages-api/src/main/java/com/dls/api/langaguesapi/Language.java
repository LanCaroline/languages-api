package com.dls.api.langaguesapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "mainLanguages")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;


    public Language(){}

    public Language(String title, String image, int ranking){
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }

    public int getRanking(){
        return ranking;
    }
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
}
