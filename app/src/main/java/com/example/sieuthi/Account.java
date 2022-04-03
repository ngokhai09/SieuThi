package com.example.sieuthi;

public class Account {
    static public String Username = "";
    static public String Password = "";
    static public boolean Status = false;
    static public String PhoneNumber = "";

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
}
