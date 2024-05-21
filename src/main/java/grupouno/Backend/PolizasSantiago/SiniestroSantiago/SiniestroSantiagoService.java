package grupouno.Backend.PolizasSantiago.SiniestroSantiago;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiniestroSantiagoService {

    @Autowired
    private SiniestroSantiagoRepo siniestroRepository;

    public List<SiniestroSantiago> getAllSiniestros() {
        return siniestroRepository.findAll();
    }

    public SiniestroSantiago getSiniestroById(Long id) {
        return siniestroRepository.findById(id).orElseThrow();
    }

    public SiniestroSantiago createSiniestro(SiniestroSantiago siniestro) {
        return siniestroRepository.save(siniestro);
    }

    public SiniestroSantiago updateSiniestro(Long id, SiniestroSantiago siniestro) {
        SiniestroSantiago existingSiniestro = getSiniestroById(id);
        existingSiniestro.setFechaSiniestro(siniestro.getFechaSiniestro());
        existingSiniestro.setDescripcion(siniestro.getDescripcion());
        existingSiniestro.setCostoReparacion(siniestro.getCostoReparacion());
        existingSiniestro.setPoliza(siniestro.getPoliza());
        return siniestroRepository.save(existingSiniestro);
    }

    public void deleteSiniestro(Long id) {
        siniestroRepository.deleteById(id);
    }
}
