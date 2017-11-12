package com.example.win81version2.demoapp;

/**
 * Created by Win ic_8.ic_1 Version ic_2 on ic_8/ic_11/2017.
 */

public class Face {
    private int idImage;
    private String NameImage;


    public Face( int idImage, String NameImage){
        this.idImage = idImage;
        this.NameImage  = NameImage;
    }
    public int getIdImage(){
        return idImage;
    }
    public String getNameImage(){
        return  NameImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public void setNameImage(String nameImage) {
        NameImage = nameImage;
    }
}
