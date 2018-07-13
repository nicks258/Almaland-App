package com.npluslabs.almaland;

public class ApiFactory {
    private static final String baseUrl  = "http://almaland.net/api/";
    private static final String loginUrl            = baseUrl + "login";
    private static final String registrationsUrl    = baseUrl + "registeration";
    private static final String viewProfileUrl      = baseUrl + "view_profile";
    private static final String addReunion          = baseUrl + "add_reunion";
    private static final String getMyReunion        = baseUrl + "get_myReunion";
    private static final String getOtherReunion     = baseUrl + "get_otherReunion";
    private static final String deleteReunion       = baseUrl + "delete_reunion";
    private static final String joinReunion         = baseUrl + "join_reunion";
    private static final String addEvent            = baseUrl + "add_event";
    private static final String getMyEvent          = baseUrl + "get_myEvent";
    private static final String getOtherEvent       = baseUrl + "get_otherEvent";
    private static final String deleteEvent         = baseUrl + "delete_event";
    private static final String joinEvent           = baseUrl + "join_event";
    private static final String eventDetail         = baseUrl + "event_detail";
    private static final String addInternship       = baseUrl + "add_internship";
    private static final String getMyInternship     = baseUrl + "get_myInternship";
    private static final String getOtherInternship  = baseUrl + "get_otherInternship";
    private static final String deleteInternship    = baseUrl + "delete_internship";
    private static final String applyIntern         = baseUrl + "apply_intern";

    public static String getLoginUrl() {
        return loginUrl;
    }

    public static String getRegistrationsUrl() {
        return registrationsUrl;
    }

    public static String getViewProfileUrl() {
        return viewProfileUrl;
    }

    public static String getAddReunion() {
        return addReunion;
    }

    public static String getGetMyReunion() {
        return getMyReunion;
    }

    public static String getGetOtherReunion() {
        return getOtherReunion;
    }

    public static String getDeleteReunion() {
        return deleteReunion;
    }

    public static String getJoinReunion() {
        return joinReunion;
    }

    public static String getAddEvent() {
        return addEvent;
    }

    public static String getGetMyEvent() {
        return getMyEvent;
    }

    public static String getGetOtherEvent() {
        return getOtherEvent;
    }

    public static String getDeleteEvent() {
        return deleteEvent;
    }

    public static String getJoinEvent() {
        return joinEvent;
    }

    public static String getEventDetail() {
        return eventDetail;
    }

    public static String getAddInternship() {
        return addInternship;
    }

    public static String getGetMyInternship() {
        return getMyInternship;
    }

    public static String getGetOtherInternship() {
        return getOtherInternship;
    }

    public static String getDeleteInternship() {
        return deleteInternship;
    }

    public static String getApplyIntern() {
        return applyIntern;
    }

}
