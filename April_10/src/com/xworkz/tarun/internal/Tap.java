package com.xworkz.tarun.internal;

class Tap {
    String  describe(){
        return "Organization";
    }
     class Acadamy extends Tap{
        String describe(){
            return "Academy is a " + super.describe();
        }
         class Organization extends Acadamy{
            String describe(){
                return "Tap is a "+super.describe();
            }
        }

    }

}
