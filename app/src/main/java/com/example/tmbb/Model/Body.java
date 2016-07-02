package com.example.tmbb.Model;

/**
 * Created by dailtonrabelo on 10/22/15.
 */
public class Body implements java.io.Serializable {
    public String date;
   public String body;

    public Body(String date, String body) {
        this.date = date;
        this.body = body;
    }

    public String toString() {
        return body + "     " + date;
    }


}
