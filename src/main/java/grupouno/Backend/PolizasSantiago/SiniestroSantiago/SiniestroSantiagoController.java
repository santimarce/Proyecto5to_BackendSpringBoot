package grupouno.Backend.PolizasSantiago.SiniestroSantiago;

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
@RequestMapping("/siniestros")

public class SiniestroSantiagoController {

    @Autowired
    private SiniestroSantiagoService siniestroService;

    @GetMapping
    public List<SiniestroSantiago> getAllSiniestros() {
        return siniestroService.getAllSiniestros();
    }

    @GetMapping("/{id}")
    public SiniestroSantiago getSiniestroById(@PathVariable Long id) {
        return siniestroService.getSiniestroById(id);
    }

    @PostMapping
    public SiniestroSantiago createSiniestro(@RequestBody SiniestroSantiago siniestro) {
        return siniestroService.createSiniestro(siniestro);
    }

    @PutMapping("/{id}")
    public SiniestroSantiago updateSiniestro(@PathVariable Long id, @RequestBody SiniestroSantiago siniestro) {
        return siniestroService.updateSiniestro(id, siniestro);
    }

    @DeleteMapping("/{id}")
    public void deleteSiniestro(@PathVariable Long id) {
        siniestroService.deleteSiniestro(id);
    }
}