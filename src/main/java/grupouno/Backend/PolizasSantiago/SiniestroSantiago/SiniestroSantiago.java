package grupouno.Backend.PolizasSantiago.SiniestroSantiago;

import grupouno.Backend.PolizasSantiago.PolizasSantiagos.PolizaSantiago;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "santiagosiniestros")

public class SiniestroSantiago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSiniestro;

    @Column(name = "fecha_siniestro", length = 50)
    private String fechaSiniestro;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "costo_reparacion")
    private float costoReparacion;

    @ManyToOne
    @JoinColumn(name = "id_poliza")
    private PolizaSantiago poliza; // Se crea la relación con la tabla `santiagopoliza`

    public Object getFechaSiniestro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaSiniestro'");
    }

    public Object getDescripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }

    public Object getCostoReparacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCostoReparacion'");
    }

    public Object getPoliza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPoliza'");
    }

    public void setFechaSiniestro(Object fechaSiniestro2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFechaSiniestro'");
    }

    public void setDescripcion(Object descripcion2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescripcion'");
    }

    public void setCostoReparacion(Object costoReparacion2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCostoReparacion'");
    }

    public void setPoliza(Object poliza2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPoliza'");
    }

    // Getters y setters
}
