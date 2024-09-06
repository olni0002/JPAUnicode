package com.example.JPAUnicode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;      
import jakarta.persistence.Id;


@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int unicode;
    private char bogstav;
    private String description;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getUnicode() {
        return unicode;
    }
    
    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }
    
    public char getBogstav() {
        return bogstav;
    }
    
    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
