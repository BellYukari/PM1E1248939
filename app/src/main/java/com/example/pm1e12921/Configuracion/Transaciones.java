package com.example.pm1e12921.Configuracion;

public class Transaciones {

    // Nombre de la base de datos
    public static final String DBName = "PM1E1";

    // Creación de la tabla en la base de datos
    public static final String Tablapersonas = "personas";

    // Creación de los campos de la base de datos
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String telefono = "telefono";
    public static final String nota = "nota";
    public static final String uri_imagen = "uri_imagen";

    // DDL CREATE
    public static final String CreateTablePersonas = "CREATE TABLE " + Tablapersonas + "(" +
            " id  INTEGER PRIMARY KEY AUTOINCREMENT ,  pais  TEXT, nombre  TEXT,  telefono  INTEGER, nota TEXT, uri_imagen TEXT)"; // Añadir la columna uri_imagen

    // DDL DROP
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS " + Tablapersonas;

    // DML
    public static final String SelectAllPersonas = "SELECT * FROM " + Tablapersonas;

    public static final String SelectUriImagen = "SELECT " + uri_imagen + " FROM " + Tablapersonas;

}