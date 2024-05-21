package grupouno.Backend.PolizasSantiago.SiniestroSantiago;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
    public interface SiniestroSantiagoRepo extends JpaRepository<SiniestroSantiago, Long> {
    }