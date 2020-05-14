/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.dao.UsuarioDao;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author paul_
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();
        UsuarioDao usuarioDao = new UsuarioDao();
        TelefonoDao telefonoDao = new TelefonoDao();
        ControladorUsuario controlUsuario = new ControladorUsuario(vistaU, vistaT, usuarioDao, telefonoDao);
        ControladorTelefono controlTelefono = new ControladorTelefono(vistaT, telefonoDao);
        
        int opciones;
        while (!salir) {
            System.out.println("\n************************** Sistema De Agendas Telefonicas **************************");
            System.out.println("1. Registrarse ");
            System.out.println("2. Iniciar Sesion");
            System.out.println("3. Salir");
            
            try {
                System.out.println("Seleccione alguna de las opciones");
                opciones = entrada.nextInt();
                switch (opciones) {
                    case 1:
                        
                        controlUsuario.registrarUsuario();
                        
                        break;
                    
                    case 2:
                        
                        boolean loguear,
                        fuera = false;
                        controlUsuario.ingresoUsuario();
                        loguear = controlUsuario.isLog();
                        if (loguear == true) {
                            System.out.println("Inicio de sesion existoso");
                            while (!fuera) {
                                
                                System.out.println("1. Actualizar los datos personales del usuario");
                                System.out.println("2. Registrar un telefono nuevo");
                                System.out.println("3. Actualizar un telefono");
                                System.out.println("4. Buscar un telefono en la cuenta");
                                System.out.println("5. Listar los telefonos");
                                System.out.println("6. Eliminar un telefono de la cuenta");
                                System.out.println("7. Eliminar cuenta");
                                System.out.println("8. Cerrar Sesion");
                                
                                try {
                                    
                                    System.out.println("Seleccione alguna de las opciones");
                                    int op = entrada.nextInt();
                                    switch (op) {
                                        case 1:
                                            controlUsuario.actualizarUsuario();
                                            break;
                                        case 2:
                                            controlTelefono.registrarTelefono();
                                            controlUsuario.agregarTelefono();
                                            break;
                                        case 3:
                                            controlTelefono.actualizarTelefono();
                                            break;
                                        case 4:
                                            controlTelefono.verTelefono();
                                            break;
                                        case 5:
                                            controlTelefono.verTelefonos();
                                            break;
                                        case 6:
                                            controlTelefono.eliminarTelefono();
                                            break;
                                        case 7:
                                            controlUsuario.eliminarUsuario();
                                            break;
                                        case 8:
                                            //Si se escoge esta opcion sale del bucle 
                                            fuera = true;
                                            break;
                                        default:
                                            
                                            System.out.println("Solo se permiten items del 1 al 3");
                                            
                                            break;
                                    }

                                } catch (InputMismatchException e) {

                                    System.out.println("Debes insertar un item del 1 al 3");
                                    entrada.next();
                                }
                            }
                        }

                        break;
                    
                    case 3:
                        
                        salir = true;
                        
                        break;
                    
                    default:
                        
                        System.out.println("Solo se permiten items del 1 al 3");
                }

            } catch (InputMismatchException exepcion) {
                System.out.println("Debes insertar un item del 1 al 3");
                entrada.next();
            }
        }
    }
}