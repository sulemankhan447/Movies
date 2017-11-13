package com.suleman.movies;

/**
 * Created by sulle on 14/11/17.
 */

public class Contact {
    private int image_id;
    private String movieName,movieGenre;
    Contact(int image_id,String movieName,String movieGenre)
    {
        this.setImage_id(image_id);
        this.setMovieName(movieName);
        this.setMovieGenre(movieGenre);

    }
    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
