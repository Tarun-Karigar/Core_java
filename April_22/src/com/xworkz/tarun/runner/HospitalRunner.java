package com.xworkz.tarun.runner;

import com.xworkz.tarun.external.AppollHospital;
import com.xworkz.tarun.internal.rule.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital=new AppollHospital();
        hospital.clean();
    }
}
