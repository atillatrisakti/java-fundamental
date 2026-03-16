package com.juaracoding.learnjava.oop;

public class Auth {

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("password123")) {
            return true; 
        } else {
            return false;
        }
    }


    public boolean register(String username, String password, String nik) {
        if (nik.length() != 16) {
            throw new IllegalArgumentException("NIK harus 16 digit");
        } else if (username.length() < 5) {
            throw new IllegalArgumentException("Username harus minimal 5 karakter");
        } else if (password.length() < 8) {
            throw new IllegalArgumentException("Password harus minimal 8 karakter");
        } else {
            return true; 
        }
    }
}
