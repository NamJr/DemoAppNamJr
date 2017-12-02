package com.example.win81version2.demoapp;

/**
 * Created by Win 8.1 Version 2 on 28/11/2017.
 */

public class SendRadio {
    private String name,phone,content;

    public SendRadio() {
    }

    public SendRadio(String name, String phone, String content) {
        this.name = name;
        this.phone = phone;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
