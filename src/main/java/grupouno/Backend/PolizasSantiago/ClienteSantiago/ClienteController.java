package grupouno.Backend.PolizasSantiago.ClienteSantiago;

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
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceSantiago clienteService;

    @GetMapping
    public List<ClienteSantiago> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ClienteSantiago getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteSantiago createCliente(@RequestBody ClienteSantiago cliente) {
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{id}")
    public ClienteSantiago updateCliente(@PathVariable Long id, @RequestBody ClienteSantiago cliente) {
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
}
