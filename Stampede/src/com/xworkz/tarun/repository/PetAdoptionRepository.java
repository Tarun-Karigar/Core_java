package com.xworkz.tarun.repository;

import com.xworkz.tarun.dto.PetAdoptionDto;

public interface PetAdoptionRepository {
    boolean persist(PetAdoptionDto petAdoptionDto);
}
