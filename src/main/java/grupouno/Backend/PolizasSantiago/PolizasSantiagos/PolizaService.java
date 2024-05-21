package grupouno.Backend.PolizasSantiago.PolizasSantiagos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolizaService {

    @Autowired
    private PolizaSantiagoRepo polizaRepository;

    public List<PolizaSantiago> getAllPolizas() {
        return polizaRepository.findAll();
    }

    public PolizaSantiago getPolizaById(Long id) {
        return polizaRepository.findById(id).orElseThrow();
    }

    public PolizaSantiago createPoliza(PolizaSantiago poliza) {
        return polizaRepository.save(poliza);
    }

    public PolizaSantiago updatePoliza(Long id, PolizaSantiago poliza) {
        PolizaSantiago existingPoliza = getPolizaById(id);
        existingPoliza.setTipoPoliza(poliza.getTipoPoliza());
        existingPoliza.setFechaInicio(poliza.getFechaInicio());
        existingPoliza.setFechaFin(poliza.getFechaInicio());
        existingPoliza.setSumaAsegurada(poliza.getSumaAsegurada());
        existingPoliza.setCliente(poliza.getCliente());
        return polizaRepository.save(existingPoliza);
    }

    public void deletePoliza(Long id) {
        polizaRepository.deleteById(id);
    }
}
