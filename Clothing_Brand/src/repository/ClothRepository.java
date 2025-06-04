package repository;

import com.xworkz.tarun.dto.Clothdto;

public interface ClothRepository {
    boolean persist(Clothdto clothdto);
}
