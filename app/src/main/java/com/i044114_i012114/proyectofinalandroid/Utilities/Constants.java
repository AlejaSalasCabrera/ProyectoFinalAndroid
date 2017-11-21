package com.i044114_i012114.proyectofinalandroid.Utilities;

/**
 * Created by ACER on 13/11/2017.
 */

public class Constants {

    public static final String TABLA_NAME_USERS = "users";
    public static final String TABLA_FIELD_ID = "id";
    public static final String TABLA_FIELD_NAME = "name";
    public static final String TABLA_FIELD_CEDULA = "cedula";
    public static final String TABLA_FIELD_PASSWORD = "password";
    public static final String CREATE_TABLE_USERS =
            "CREATE TABLE "+ TABLA_NAME_USERS+" ("+
                    TABLA_FIELD_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    TABLA_FIELD_NAME+" TEXT, "+
                    TABLA_FIELD_CEDULA+" TEXT, "+
                    TABLA_FIELD_PASSWORD+" TEXT) " ;


}

