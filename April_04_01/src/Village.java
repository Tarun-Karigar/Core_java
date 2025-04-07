public class Village {
    String state;
    String  district;
    int  no_of_houses;

    public Village(String state,String  district,int  no_of_houses){
        this.district=district;
        this.state=state;
        this.no_of_houses=no_of_houses;
    }
     public void villageinfo(){
        System.out.println("The village belongs to the state :"+state);
         System.out.println("The village belongs to the district"+district);
         System.out.println("The number of houses inside the village :"+no_of_houses);
     }


}
