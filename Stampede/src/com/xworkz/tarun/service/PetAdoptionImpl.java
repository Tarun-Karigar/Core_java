package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.PetAdoptionDto;
import com.xworkz.tarun.repository.PetAdoptionRepository;
import com.xworkz.tarun.repository.PetAdoptionRepositoryImpl;
import com.xworkz.tarun.service.PetAdoptionService;

public class PetAdoptionImpl implements PetAdoptionService {

    private PetAdoptionRepository repository = new PetAdoptionRepositoryImpl();

    @Override
    public boolean save(PetAdoptionDto petAdoptionDto) {
        if (petAdoptionDto != null) {
            System.out.println("The DTO is not null");
            return repository.persist(petAdoptionDto); // call persist
        } else {
            System.err.println("DTO is null");
        }
        return false;
    }
}
