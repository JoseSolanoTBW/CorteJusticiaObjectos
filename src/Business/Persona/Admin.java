/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Persona;

/**
 *
 * @author mean
 */
public class Admin  extends Persona{

    public Admin() {
        super();
    }

    public Admin(int Cedula, String Nombre, String Apellido, int Telefono, String Direccion) {
        super(Cedula, Nombre, Apellido, Telefono, Direccion);
    }

    public Admin(int idPersona, int Cedula, String Nombre, String Apellido, int Telefono, String Direccion, String nombre) {
        super(idPersona, Cedula, Nombre, Apellido, Telefono, Direccion, nombre);
    }

    public Admin(int idPersona, int Cedula, String Nombre, String Apellido, int Telefono, String Direccion) {
        super(idPersona, Cedula, Nombre, Apellido, Telefono, Direccion);
    }
    
    
}
