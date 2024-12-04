package com.ventas.services;

import com.ventas.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    private List<Producto> productos = new ArrayList<>();

    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> listarProductos() {
        return productos;
    }

    public Producto buscarProductoPorId(int idProducto) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null; // Si no se encuentra, retornamos null
    }
}
