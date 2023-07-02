package com.example.week4mad;

public class myObject {
    private int myImageID;
    private String myText;

    public myObject(int myImageID, String myText) {
        this.myImageID = myImageID;
        this.myText = myText;

    }
    public myObject(){

    }

    public int getMyImageID() {
        return myImageID;
    }

    public void setMyImageID(int myImageID) {
        this.myImageID = myImageID;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

}