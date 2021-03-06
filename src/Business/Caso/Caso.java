/**
 * Jose Solano Montoya
 */

package Business.Caso;

import Business.Persona.Querellante;
import Business.Persona.Juez;
import java.util.Date;

public class Caso {

    private int NumeroCaso;
    private String Descripcion;
    private Date FechaCfeacion;
    private Juez JuezAsignado;
    private Estado estadoCaso;
    private Querellante Denunciante;
    private Historial RegistroHistorico;
    private String Resolucion;

    public Caso() {
    }
    
    public Caso(int NumeroCaso, String Descripcion, Date FechaCfeacion, Querellante Denunciante, Date FechaCreacion) {
        this.NumeroCaso = NumeroCaso;
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;       
        this.Denunciante = Denunciante;
        
    }

    public Caso(String Descripcion, Date FechaCfeacion, Juez JuezAsignado, Estado estadoCaso, Querellante Denunciante, Historial RegistroHistorico) {
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;
        this.JuezAsignado = JuezAsignado;
        this.estadoCaso = estadoCaso;
        this.Denunciante = Denunciante;
        this.RegistroHistorico = RegistroHistorico;
    }

    public Caso(int NumeroCaso, String Descripcion, Date FechaCfeacion, int idestado, String estadoCaso) {
        this.NumeroCaso = NumeroCaso;
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;
        this.estadoCaso = new Estado(idestado, estadoCaso);
    }
    
    public Caso(int NumeroCaso, String Descripcion, Date FechaCfeacion, int idestado, String estadoCaso, int idPersona, String nombrePersona, String Apellido) {
        this.NumeroCaso = NumeroCaso;
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;
        this.estadoCaso = new Estado(idestado, estadoCaso);
        this.Denunciante = new Querellante();
        this.Denunciante.setIdPersona(idPersona);
        this.Denunciante.setNombre(nombrePersona);
        this.Denunciante.setApellido(Apellido);
    }
    public Caso(int NumeroCaso, String Descripcion, Date FechaCfeacion, int idestado, String estadoCaso, int idPersona, String nombrePersona, String Apellido, String Resolucion) {
        this.NumeroCaso = NumeroCaso;
        this.Descripcion = Descripcion;
        this.FechaCfeacion = FechaCfeacion;
        this.estadoCaso = new Estado(idestado, estadoCaso);
        this.Denunciante = new Querellante();
        this.Denunciante.setIdPersona(idPersona);
        this.Denunciante.setNombre(nombrePersona);
        this.Denunciante.setApellido(Apellido);
        this.Resolucion = Resolucion;
    }

    public int getNumeroCaso() {
        return NumeroCaso;
    }

    public void setNumeroCaso(int NumeroCaso) {
        this.NumeroCaso = NumeroCaso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaCfeacion() {
        return FechaCfeacion;
    }

    public void setFechaCfeacion(Date FechaCfeacion) {
        this.FechaCfeacion = FechaCfeacion;
    }

    public Juez getJuezAsignado() {
        return JuezAsignado;
    }

    public void setJuezAsignado(Juez JuezAsignado) {
        this.JuezAsignado = JuezAsignado;
    }

    

    public Querellante getDenunciante() {
        return Denunciante;
    }

    public void setDenunciante(Querellante Denunciante) {
        this.Denunciante = Denunciante;
    }

    public Historial getRegistroHistorico() {
        return RegistroHistorico;
    }

    public void setRegistroHistorico(Historial RegistroHistorico) {
        this.RegistroHistorico = RegistroHistorico;
    }

    public Estado getEstadoCaso() {
        return estadoCaso;
    }

    public void setEstadoCaso(Estado estadoCaso) {
        this.estadoCaso = estadoCaso;
    }

    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String Resolucion) {
        this.Resolucion = Resolucion;
    }
    
}
