package grupouno.Backend.PolizasSantiago.RegistroSantiago;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistroSantiagoService {

    @Autowired
    private RegistroSantiagoRepo registroRepository;

    public List<RegistroSantiago> getAllRegistros() {
        return registroRepository.findAll();
    }

    public RegistroSantiago getRegistroById(Long id) {
        return registroRepository.findById(id).orElseThrow();
    }

    public RegistroSantiago createRegistro(RegistroSantiago registro) {
        return registroRepository.save(registro);
    }

    public RegistroSantiago updateRegistro(Long id, RegistroSantiago registro) {
        RegistroSantiago existingRegistro = getRegistroById(id);
        existingRegistro.setNombre(registro.getNombre());
        existingRegistro.setEstado(registro.getEstado());
        existingRegistro.setFecha(registro.getFecha());
        existingRegistro.setCliente(registro.getCliente());
        return registroRepository.save(existingRegistro);
    }

    public void deleteRegistro(Long id) {
        registroRepository.deleteById(id);
    }

    
}
