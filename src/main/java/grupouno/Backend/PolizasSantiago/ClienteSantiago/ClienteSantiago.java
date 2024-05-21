package grupouno.Backend.PolizasSantiago.ClienteSantiago;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "santiagocliente")
public class ClienteSantiago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; 

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "direccion", length = 50)
    private String direccion;

    @Column(name = "telefono", length = 50)
    private String telefono;

    @Column(name = "fecha_nacimiento", length = 50)
    private String fechaNacimiento; 

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "identificador", length = 50)
    private String identificador;

    public Object getNombre() {
        return this.nombre;
    }

    public void setNombre(Object nombre2) {
        this.nombre = nombre2.toString();
    }

    public Object getFecha() {
        return this.fechaNacimiento;
    }

    public void setFecha(Object fecha2) {
        this.fechaNacimiento = fecha2.toString();
    }

    public Object getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(Object iden2) {
        this.identificador = iden2.toString();
    }

    public Object getId() {
        return this.idCliente;
    }

    public void setId(Long id2) {
        this.idCliente = id2;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setDireccion(String direccion2) {
        this.direccion = direccion2;
    }

    public void setTelefono(String telefono2) {
        this.telefono = telefono2;
    }

    public Object getCorreo() {
        return this.correo;
    }

    public void setCorreo(Object correo2) {
        this.correo = correo2.toString();
    }

    // Getters y setters
}
