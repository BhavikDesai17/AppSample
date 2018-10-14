package com.example.bhavik.appsample.modal;

public class User {
    private int id;
    private int phone;
    //private String username;
    private String name;
    private String email1;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }

    /*public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail1() {
        return email1;
    }
    public void setEmail(String email){
        this.email1=email1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
