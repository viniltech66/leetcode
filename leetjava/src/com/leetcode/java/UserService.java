package com.leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<String> users = new ArrayList<>();

    // Issue 1: Hardcoded credentials (security issue)
    private String dbUser = "admin";
    private String dbPassword = "password123";

    // Issue 2: Inefficient method, repeatedly loops through list
    public boolean userExists(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(username)) {
                return true;
            }

        return false;
    }

    // Issue 3: Not thread-safe, no synchronization for shared list
    public void addUser(String username) {
        if (!userExists(username)) {
            users.add(username);
        }
    }

    // Issue 4: Bad practice - catching generic Exception
    public void processUser(String username) {
        try {
            System.out.println("Processing user: " + username);
            Thread.sleep(1000); // Blocking call in main thread
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Issue 5: No input validation
    public void deleteUser(String username) {
        users.remove(username);
    }
}
