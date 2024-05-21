package grupouno.Backend.PolizasSantiago.ClienteSantiago;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteSantiago, Long> {
}
