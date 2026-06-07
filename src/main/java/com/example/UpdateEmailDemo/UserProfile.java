package com.example.UpdateEmailDemo;

public class UserProfile {
        private int userId;
        private String phoneNumber;
        private String address;

    public UserProfile(String phoneNumber, int userId, String address) {
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("User ID: " + userId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("------------------------");
    }
}
