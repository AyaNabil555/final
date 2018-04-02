package com.example.sara.tripplanner;

/**
 * Created by sara on 22/03/18.
 */

public class Trip {

   private   String name;
   private   String date;
   private   String time;
   private   String note;
   private   String placeFrom;
   private   String placeTo;


    public Trip() {
    }

    public Trip( String name,String date,String time,String note,String placeFrom,String placeTo) {
        this.name = name;
        this.date=date;
        this.date=time;
        this.note=note;
        this.placeFrom=placeFrom;
        this.placeTo=placeTo;

    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

//
//    public int getPhotoid() {
//        return  photoid;
//    }
//
//    public void setPhotoid(int photoid) {
//        this.photoid = photoid;
//    }
//

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }



}
