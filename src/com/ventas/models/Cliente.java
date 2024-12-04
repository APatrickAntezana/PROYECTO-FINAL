package com.ventas.models;
/**
 Clase Cliente que representa a un cliente en el sistema de ventas.
 Esta clase contiene los atributos necesarios para representar un cliente, como su
 nombre, correo y teléfono, y proporciona los métodos para acceder y modificar estos atributos.
 La clase también incluye un método para mostrar la información del cliente en formato de cadena de texto.
        */

public class Cliente {
    //Identificador único del cliente.
    private int idCliente;
    //Nombre completo del cliente
    private String nombre;
    //Correo Completo del cliente
    private String correo;
    //Telefono del cliente
    private String telefono;

    public Cliente(int idCliente, String nombre, String correo, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{idCliente=" + idCliente + ", nombre='" + nombre + "', correo='" + correo + "', telefono='" + telefono + "'}";
    }
}
