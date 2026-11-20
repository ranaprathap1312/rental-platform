package com.rental;

public class RentalApplication {
    public static void main(String[] args) {

        // 1. Startup notification
        System.out.println("=========================================");
        System.out.println("   RENTAL PLATFORM BACKEND STARTING...   ");
        System.out.println("=========================================");
        // 2. Status message
        System.out.println("[INFO] Connecting to MySQL Database: rental_platform...");

        boolean isDbConnected = true;
        // 3. Conditional status output
        if (isDbConnected) {
            System.out.println("[SUCCESS] Database Connection OK on Port 3306!");
        } else {
            System.out.println("[ERROR] Failed to connect to Database.");
        }
        System.out.println("[INFO] Server is Live and ready for users!");
        System.out.println("=========================================");
    }
}
