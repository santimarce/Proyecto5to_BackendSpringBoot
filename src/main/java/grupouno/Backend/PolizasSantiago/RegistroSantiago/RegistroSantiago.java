package grupouno.Backend.PolizasSantiago.RegistroSantiago;

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
@Table(name = "santiagoregistro")

public class RegistroSantiago {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "fecha")
    private Date fecha; // Se recomienda usar Date para la fecha

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteSantiago cliente; // Se crea la relación con la tabla `santiagocliente`

    public Object getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    public Object getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }

    public Object getFecha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFecha'");
    }

    public Object getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

    public void setNombre(Object nombre2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    public void setEstado(Object estado2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }

    public void setFecha(Object fecha2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFecha'");
    }

    public void setCliente(Object cliente2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    // Getters y setters
}
