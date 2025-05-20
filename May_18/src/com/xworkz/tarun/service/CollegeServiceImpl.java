package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.Collegedto;

public class CollegeServiceImpl implements CollegeService{
    @Override
    public boolean save(Collegedto collegedto) {
        if(collegedto!=null){
            System.out.println("The dto is not null");
            String name1=collegedto.getName();
            if(name1!=null && name1.length()>2  && name1.length()<21){
                System.out.println("valid brand name ");
            }
            else {
                System.err.println("The brand name is not valid ");
                return false;
            }
        }
        System.out.println("Executed save method");
        return true;
    }
}
