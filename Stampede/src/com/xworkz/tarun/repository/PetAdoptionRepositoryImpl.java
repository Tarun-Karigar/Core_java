package com.xworkz.tarun.repository;

import com.xworkz.tarun.dto.PetAdoptionDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PetAdoptionRepositoryImpl implements PetAdoptionRepository{
    public PetAdoptionRepositoryImpl() {
    }

    @Override
    public boolean persist(PetAdoptionDto petAdoptionDto) {
        if(petAdoptionDto!=null){
            System.out.println("The detailed saved successfully");
            String url="jdbc:mysql://localhost:3306/petadoption";
            String username="root";
            String password="Tarun@699625";

            try {
                // Step1 : Load The Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Step 2 : Create The Connection
                Connection connection= DriverManager.getConnection(url,username,password);
                // Step 3: Prepare The Statement
                String sql = "insert into petadoption1 values (0,'" + petAdoptionDto.getName() + "','" + petAdoptionDto.getPhone() + "','" + petAdoptionDto.getEmail() + "','" + petAdoptionDto.getMessage() + "')";

                 Statement statement=connection.createStatement();
                // Step 4: Execute The Statement
                statement.executeUpdate(sql);

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }


        }
        else {
            System.err.println("The detailes not saved successfully");
        }
        System.out.println("Succesfully running in repo");
        return true;
    }
}
