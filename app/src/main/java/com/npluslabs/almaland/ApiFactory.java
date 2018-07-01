package com.npluslabs.almaland;

public class ApiFactory {
    private static final String baseUrl              = "http://almaland.net/api/";

    public static String getLoginUrl() {
        return loginUrl;
    }

    private static final String loginUrl             = baseUrl + "login";
}
