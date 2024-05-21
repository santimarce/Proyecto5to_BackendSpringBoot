package grupouno.Backend.PolizasSantiago.PolizasSantiagos;

import java.sql.Date;

import grupouno.Backend.PolizasSantiago.ClienteSantiago.ClienteSantiago;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "polizas")

public class PolizaSantiago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteSantiago cliente;

    @Column(name = "numero")
    private String numero;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    public Object getTipoPoliza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoPoliza'");
    }

    public Object getFechaInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaInicio'");
    }

    public Object getSumaAsegurada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSumaAsegurada'");
    }

    public Object getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

    public void setCliente(Object cliente2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    public void setSumaAsegurada(Object sumaAsegurada) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSumaAsegurada'");
    }

    public void setFechaFin(Object fechaInicio2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFechaFin'");
    }

    public void setFechaInicio(Object fechaInicio2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFechaInicio'");
    }

    public void setTipoPoliza(Object tipoPoliza) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTipoPoliza'");
    }

    // Getters y setters

}
