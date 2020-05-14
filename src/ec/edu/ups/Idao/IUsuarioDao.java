/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author paul_
 */
public interface IUsuarioDao {
    
    public void create(Usuario usuario);
    public Usuario read(String correo, String contrasenia);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);   
    public List<Usuario> findAll();
}
