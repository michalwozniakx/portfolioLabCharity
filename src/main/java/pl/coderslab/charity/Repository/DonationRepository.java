package pl.coderslab.charity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Donation;

import java.util.Optional;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {

    @Query("SELECT SUM(d.quantity) FROM Donation d")
    Optional<Integer> sumOfBag();
}
