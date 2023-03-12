package pl.coderslab.charity.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Repository.InstitutionRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitutionService {
    private final InstitutionRepository institutionRepository;

    //mozna uzyc paginacji
    public List<Institution> findAll() {
        return institutionRepository.findAll(Pageable.ofSize(6)).getContent();
    }
}
