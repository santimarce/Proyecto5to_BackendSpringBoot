package grupouno.Backend.PolizasSantiago.PolizasSantiagos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polizas")

public class PolizaSantiagoController {

    @Autowired
    private PolizaService polizaService;

    @GetMapping
    public List<PolizaSantiago> getAllPolizas() {
        return polizaService.getAllPolizas();
    }

    @GetMapping("/{id}")
    public PolizaSantiago getPolizaById(@PathVariable Long id) {
        return polizaService.getPolizaById(id);
    }

    @PostMapping
    public PolizaSantiago createPoliza(@RequestBody PolizaSantiago poliza) {
        return polizaService.createPoliza(poliza);
    }

    @PutMapping("/{id}")
    public PolizaSantiago updatePoliza(@PathVariable Long id, @RequestBody PolizaSantiago poliza) {
        return polizaService.updatePoliza(id, poliza);
    }

    @DeleteMapping("/{id}")
    public void deletePoliza(@PathVariable Long id) {
        polizaService.deletePoliza(id);
    }
}
