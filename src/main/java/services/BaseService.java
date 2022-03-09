package services;

import com.crowdar.api.rest.MethodsService;

/*
In this service we asociate some variables data to a thread with Threadlocal class
*/

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_WORKSPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_TIME_ENTRY = new ThreadLocal<String>();
    public static final ThreadLocal<String> BASE_URL = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_USER = new ThreadLocal<String>();

}