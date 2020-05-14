/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author paul_
 */
public class VistaTelefono {

    private Scanner entrada;

    public VistaTelefono() {
        entrada = new Scanner(System.in);
    }

    public Telefono registrarTelefono() {

        entrada = new Scanner(System.in);

        System.out.println("Ingrese el codigo del telefono");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el numero de telefono");
        String numero = entrada.next();

        System.out.println("Ingrese tipo:" + "celular / convencional");
        String tipo = entrada.next();

        System.out.println("Ingrese la operadora del telefono");
        String operadora = entrada.next();

        return new Telefono(codigo, numero, tipo, operadora);

    }

    public Telefono actualizarTelefono() {

        entrada = new Scanner(System.in);

        System.out.println("Ingrese el codigo del telefono a actualizar ");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el nuevo numero de telefono");
        String numero = entrada.next();

        System.out.println("Ingrese el nuevo tipo:" + "celular / convencional");
        String tipo = entrada.next();

        System.out.println("Ingrese la nueva operadora");
        String operadora = entrada.next();

        return new Telefono(codigo, numero, tipo, operadora);

    }

    public Telefono eliminarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono a eliminar");
        int codigo = entrada.nextInt();

        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del telefono a buscar");
        int codigo = entrada.nextInt();

        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("Datos del telefono :" + telefono);

    }

    public void validarRegistro(Telefono telefono) {

        if (telefono == null) {

            System.out.println("No existe registro del telefono en este usuario");
        }

    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono : " + telefono);
        }

    }

}
