package com.movie_homework;

import java.util.Date;

/**
 * Created by chrisaanerud on 4/13/17.
 */
public class Movie {
    private String title;
    private Date date;
    private double length;
    private String language;
    private String rating;
    private String country;
    private double budget;
    private double gross;
    private String released;


    public Movie(String title, Date date, double length, String language, String rating, String country, double budget, double gross, String released) {
        this.title = title;
        this.date = date;
        this.length = length;
        this.language = language;
        this.rating = rating;
        this.country = country;
        this.budget = budget;
        this.gross = gross;
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }
}