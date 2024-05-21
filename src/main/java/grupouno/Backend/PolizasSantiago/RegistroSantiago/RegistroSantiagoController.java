package grupouno.Backend.PolizasSantiago.RegistroSantiago;

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
@RequestMapping("/registros")
public class RegistroSantiagoController {

    @Autowired
    private RegistroSantiagoService registroService;

    @GetMapping
    public List<RegistroSantiago> getAllRegistros() {
        return registroService.getAllRegistros();
    }

    @GetMapping("/{id}")
    public RegistroSantiago getRegistroById(@PathVariable Long id) {
        return registroService.getRegistroById(id);
    }

    @PostMapping
    public RegistroSantiago createRegistro(@RequestBody RegistroSantiago registro) {
        return registroService.createRegistro(registro);
    }

    @PutMapping("/{id}")
    public RegistroSantiago updateRegistro(@PathVariable Long id, @RequestBody RegistroSantiago registro) {
        return registroService.updateRegistro(id, registro);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistro(@PathVariable Long id) {
        registroService.deleteRegistro(id);
    }
}