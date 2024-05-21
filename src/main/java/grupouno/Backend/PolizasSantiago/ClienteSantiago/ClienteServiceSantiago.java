package grupouno.Backend.PolizasSantiago.ClienteSantiago;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceSantiago {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteSantiago> getAllClientes() {
        return clienteRepository.findAll();
    }

    public ClienteSantiago getClienteById(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    public ClienteSantiago createCliente(ClienteSantiago cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteSantiago updateCliente(Long id, ClienteSantiago cliente) {
        ClienteSantiago existingCliente = getClienteById(id);
        existingCliente.setNombre(cliente.getNombre());
        existingCliente.setCorreo(cliente.getCorreo());
        existingCliente.setDireccion(cliente.getDireccion());
        existingCliente.setTelefono(cliente.getTelefono());
        return clienteRepository.save(existingCliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
