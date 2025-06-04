package repository;

import com.xworkz.tarun.dto.Clothdto;

public class ClothRepositoryImpl implements ClothRepository{
    public ClothRepositoryImpl(){
        System.out.println("Constrictor created");
    }
    @Override
    public boolean persist(Clothdto clothdto) {
        if(clothdto!=null){
            System.out.println("The detailed saved successfully");
        }
        else {
            System.err.println("The detailes not saved successfully");
        }
        System.out.println("Succesfully running in repo");
        return true;
    }
}
