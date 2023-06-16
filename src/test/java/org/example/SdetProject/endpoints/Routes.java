package org.example.SdetProject.endpoints;


public class Routes {

    /* Publica para usarla en todo el proyecto y estatica para poder usarla creando un objeto rutas
     */
    public static String baseUrl = "https://petstore.swagger.io/v2";

    //Modelo del usuario

    public static String post_User =  baseUrl + "/user";
    public static String get_User = baseUrl + "/user/{username}";
    public static String put_User = baseUrl + "/user/{username}";
    public static String delete_User = baseUrl + "/user/{username}";

}
