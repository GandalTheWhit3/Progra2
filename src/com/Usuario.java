package com;

import java.util.Scanner;

public class Usuario {

    static int numeroTurno = 0;

    private String nombre;
    private String apellido;
    private String cedula;
    private String servicio;
    private int turnoAsignado;

    public void ingresarDatos(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void generarTurno(String servicio) {
        this.servicio = servicio;
        numeroTurno++;
        turnoAsignado = numeroTurno;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Servicio: " + servicio);
        System.out.println("Numero de turno: " + turnoAsignado);
        System.out.println("Turno asignado: A" + turnoAsignado);

        if (servicio.equalsIgnoreCase("Caja")
                || servicio.equalsIgnoreCase("Pagos")) {
            System.out.println("Modulo asignado: 1");
        } else if (servicio.equalsIgnoreCase("Atencion al cliente")) {
            System.out.println("Modulo asignado: 2");
        } else {
            System.out.println("Modulo asignado: 3");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nom = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String ape = scanner.nextLine();

        System.out.print("Ingrese su cedula: ");
        String ced = scanner.nextLine();

        System.out.print("Que servicio desea? (Caja, Pagos, Atencion al cliente, General): ");
        String serv = scanner.nextLine();

        Usuario usuario1 = new Usuario();

        usuario1.ingresarDatos(nom, ape, ced);
        usuario1.generarTurno(serv);
        usuario1.mostrarDatos();

        scanner.close();
    }
}