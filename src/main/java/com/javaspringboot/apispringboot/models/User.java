package com.javaspringboot.apispringboot.models;




public class User{
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String cel;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
        
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getCel() {
        return cel;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCel(String cel) {
        this.cel = cel;
    }

}