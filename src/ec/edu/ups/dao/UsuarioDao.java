/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.Idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author paul_
 */
public class UsuarioDao implements IUsuarioDao {

    private List<Usuario> listaUsuario;

    public UsuarioDao() {
        listaUsuario = new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(String correo, String contrasenia) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getContrasenia().equalsIgnoreCase(contrasenia)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usua = listaUsuario.get(i);
            if (usua.getCedula().equalsIgnoreCase(usuario.getCedula())) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario usua = it.next();
            if (usua.getCedula().equalsIgnoreCase(usuario.getCedula())) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
    }

}
