package Hierarchy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RandomPerson {
   private Employee ramdomPers;
    public RandomPerson(Employee ramdomPers) {
        this.ramdomPers=ramdomPers;
    }
    public String fullName(){
        return ramdomPers.getFirstname()+" "+ramdomPers.getLastName();
      }
      public int calculateEmployerAge(){

        return (int) ChronoUnit.YEARS.between(ramdomPers.getBirthday(),ramdomPers.getDateOfEmployment());

      }
      public String positinOfEmployer(){
        return ramdomPers.getPosition();
      }
      public String adressOfEmployer(){
        return ramdomPers.getAddres();
      }
    }


