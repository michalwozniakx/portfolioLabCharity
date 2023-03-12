package pl.coderslab.charity.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.Entity.Donation;
import pl.coderslab.charity.Repository.DonationRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public Integer sumOfBag() {
        return donationRepository.sumOfBag().orElse(0);
    }

    public Long sumOfDonation() {
        return donationRepository.count();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }

//    public int sumOfBag() {  //jpql query
//        if (donationRepository.findAll().size() > 0) {
//            return donationRepository.findAll().size();
//        } else return 0;
//    }
//
//    public int sumOfDonation() { //count
//        if (donationRepository.findAll().size() > 0) {
//            return donationRepository.findAll().size();
//        } else return 0;
//    }

}
