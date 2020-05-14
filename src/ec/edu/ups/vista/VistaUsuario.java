/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author paul_
 */
public class VistaUsuario {

    private Scanner entrada;

    public VistaUsuario() {
        entrada = new Scanner(System.in);
    }

    public Usuario registrarUsuario() {

        entrada = new Scanner(System.in);
        System.out.println("Ingrese la cedula del usuario");
        String cedula = entrada.next();

        System.out.println("Ingrese el nombre del usuario");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del usuario");
        String apellido = entrada.next();

        System.out.println("Ingrese el correo del usuario");
        String correo = entrada.next();

        System.out.println("Ingrese la contrasena del usuario");
        String contrania = entrada.next();

        return new Usuario(cedula, nombre, apellido, correo, contrania);

    }

    public Usuario actualizarUsuario() {

        entrada = new Scanner(System.in);

        System.out.println("Ingrese la nueva cedula del estudiante");
        String cedula = entrada.next();

        System.out.println("Ingrese el nuevo nombre del usuario");
        String nombre = entrada.next();

        System.out.println("Ingrese el nuevo apellido del usuario");
        String apellido = entrada.next();

        System.out.println("Ingrese el nuevo correo del usuario");
        String correo = entrada.next();

        System.out.println("Ingrese la nueva contresena del usuario");
        String contrania = entrada.next();

        return new Usuario(cedula, nombre, apellido, correo, contrania);

    }

    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del Usuario: " + usuario);
    }

    public Usuario eliminarUsuario() {

        entrada = new Scanner(System.in);
        System.out.println("Ingrese la cedula del estudiante");
        String cedula = entrada.next();
        return new Usuario(cedula, null, null, null, null);
    }

    public String retornaCorreo() {

        entrada = new Scanner(System.in);
        System.out.println("Ingrese el correo del usuario");
        String correo = entrada.next();

        return correo;
    }

    public String retornaContra() {

        entrada = new Scanner(System.in);
        System.out.println("Ingrese la contrasena del usuario");
        String contrasenia = entrada.next();

        return contrasenia;

    }

    public void validarLogeo(Usuario usuario) {

        if (usuario == null) {
            System.out.println("Su correo o contrasenia estan incorrectas");
            System.out.println("O aun no existe registro del usuario");
        }

    }

    public boolean logeoUsuario(Usuario usuario) {
        boolean log = false;
        if (usuario != null) {
            log = true;
            return log;
        } else {
            return log;
        }
    }

    public void verDatosUser(Usuario usuario) {
        System.out.println(" Datos del Usuario :" + usuario);

    }
}
