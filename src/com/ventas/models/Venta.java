package com.ventas.models;

public class Venta {
    private int idVenta;
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private double total;

    public Venta(int idVenta, Cliente cliente, Producto producto, int cantidad) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = producto.getPrecio() * cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta{idVenta=" + idVenta + ", cliente=" + cliente.getNombre() + ", producto=" + producto.getNombre() +
                ", cantidad=" + cantidad + ", total=" + total + "}";
    }
}
