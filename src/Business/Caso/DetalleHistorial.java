/**
 * Jose Solano Montoya
 */

package Business.Caso;

import java.util.Date;

public class DetalleHistorial {
    private int idDetalle;
    private Estado estadoHistorial;
    private Date FechaActualizacion;

    public DetalleHistorial() {
    }

    public DetalleHistorial(int idDetalle, Estado estadoHistorial, Date FechaActualizacion) {
        this.idDetalle = idDetalle;
        this.estadoHistorial = estadoHistorial;
        this.FechaActualizacion = FechaActualizacion;
    }

    

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Estado getEstadoHistorial() {
        return estadoHistorial;
    }

    public void setEstadoHistorial(Estado estadoHistorial) {
        this.estadoHistorial = estadoHistorial;
    }

    

    public Date getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(Date FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }
    
}
