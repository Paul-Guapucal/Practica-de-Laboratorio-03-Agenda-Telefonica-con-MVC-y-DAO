/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Idao;

import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 *
 * @author paul_
 */
public interface ITelefonoDao {
    
    public void create(Telefono telefono);
    public Telefono read(int id);
    public void update(Telefono telefono);
    public void delete(Telefono telefono);   
    public List<Telefono> findAll();
}
