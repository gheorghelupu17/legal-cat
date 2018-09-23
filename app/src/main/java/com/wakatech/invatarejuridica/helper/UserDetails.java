package com.wakatech.invatarejuridica.helper;

public class UserDetails {

    private static String name = "";
    private static String email = "";
    private static String school = "";
    private static int id;

    public static String getEmail() {
        return email;
    }

    public static String getName() {
        return name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setName(String name) {
        UserDetails.name = name;
    }

    public static void setEmail(String email) {
        UserDetails.email = email;
    }

    public static void setSchool(String school) {
        UserDetails.school = school;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserDetails.id = id;
    }
}
