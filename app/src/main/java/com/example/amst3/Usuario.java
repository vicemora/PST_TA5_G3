package com.example.amst3;

public class Usuario {

    private String username;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;

    public Usuario(String username, String nombre,String apellido, String correo, String celular){

        this.username=username;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.celular=celular;

    }

    public String getApellido() {
        return apellido;
    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }
}
