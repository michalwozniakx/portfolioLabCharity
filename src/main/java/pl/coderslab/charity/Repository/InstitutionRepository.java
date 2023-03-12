package pl.coderslab.charity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Institution;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {
}
