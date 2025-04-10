package com.xworkz.tarun.internal;
//Omlet is a SideDish is a Dish
 public class Dish {
    String describe(){
        return "Dish";
    }
  public class SideDish extends Dish{
        String describe(){
            return "Side Dish is a " + super.describe();
        }
  }
 public class Omlet extends SideDish {
        String describe(){
            return "omlet is a " + super.describe();
        }

 }

}
