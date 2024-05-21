package grupouno.Backend.PolizasSantiago.RegistroSantiago;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
    

@Repository

public interface RegistroSantiagoRepo extends JpaRepository<RegistroSantiago, Long> {
}

