package com.example.UpdateEmailDemo;

public class UpdateEmail  {

    public void updatedEmail() {
        String oldEmail = "ahmed@example.com";

        String newEmail = "ali@example.com";

        boolean isUpdated = false;

        System.out.println("Original Email: " + oldEmail);

        if (!oldEmail.equalsIgnoreCase(newEmail)) {
            oldEmail = newEmail;
            isUpdated = true;

            System.out.println("Email updated successfully.");
        } else {
            isUpdated =  false;
            System.out.println("No update required. Email address is already current.");
        }

        System.out.println("Updated Email: " + oldEmail);
        System.out.println("Update Status: " + isUpdated);
    }
}
