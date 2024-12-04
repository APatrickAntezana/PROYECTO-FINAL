package com.ventas.app;

import com.ventas.models.Cliente;
import com.ventas.models.Producto;
import com.ventas.models.Venta;
import com.ventas.services.GestorClientes;
import com.ventas.services.GestorProductos;
import com.ventas.services.GestorVentas;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        GestorProductos gestorProductos = new GestorProductos();
        GestorClientes gestorClientes = new GestorClientes();
        GestorVentas gestorVentas = new GestorVentas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Producto");
            System.out.println("2. Registrar Cliente");
            System.out.println("3. Registrar Venta");
            System.out.println("4. Listar Productos");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Ventas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del producto: ");
                    int idProd = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese nombre del producto: ");
                    String nombreProd = scanner.nextLine();
                    System.out.print("Ingrese precio del producto: ");
                    double precioProd = scanner.nextDouble();
                    System.out.print("Ingrese stock del producto: ");
                    int stockProd = scanner.nextInt();
                    gestorProductos.registrarProducto(new Producto(idProd, nombreProd, precioProd, stockProd));
                    break;
                case 2:
                    System.out.print("Ingrese ID del cliente: ");
                    int idCli = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese nombre completo del cliente: ");
                    String nombreCli = scanner.nextLine();
                    System.out.print("Ingrese correo del cliente: ");
                    String correoCli = scanner.nextLine();
                    System.out.print("Ingrese teléfono del cliente: ");
                    String telCli = scanner.nextLine();
                    gestorClientes.registrarCliente(new Cliente(idCli, nombreCli, correoCli, telCli));
                    break;
                case 3:
                    System.out.print("Ingrese ID de la venta: ");
                    int idVenta = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Ingrese ID del cliente: ");
                    int idClienteVenta = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    Cliente cliente = gestorClientes.buscarClientePorId(idClienteVenta);

                    System.out.print("Ingrese ID del producto: ");
                    int idProductoVenta = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    Producto producto = gestorProductos.buscarProductoPorId(idProductoVenta);

                    System.out.print("Ingrese cantidad de productos: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    if (producto != null && cliente != null && producto.getStock() >= cantidad) {
                        // Crear la venta y registrar
                        Venta venta = new Venta(idVenta, cliente, producto, cantidad);
                        gestorVentas.registrarVenta(venta);
                        // Actualizar el stock del producto
                        producto.setStock(producto.getStock() - cantidad);
                        System.out.println("Venta registrada con éxito.");
                    } else {
                        System.out.println("No se pudo realizar la venta. Verifique los datos.");
                    }
                    break;
                case 4:
                    gestorProductos.listarProductos().forEach(System.out::println);
                    break;
                case 5:
                    gestorClientes.listarClientes().forEach(System.out::println);
                    break;
                case 6:
                    gestorVentas.listarVentas().forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
