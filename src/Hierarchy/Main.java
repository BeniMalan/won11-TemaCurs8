package Hierarchy;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("David", "Beckham", LocalDateTime.of(1975, 1, 1, 0, 0), "123 Bucuresti", LocalDateTime.now(), "Programmer SR", "Java");
        DatabaseAdmin dbadmin=new DatabaseAdmin("Ion","Luca",LocalDateTime.of(1990,03,01,00,2),"1234 Bucuresti",LocalDateTime.now(),"dbAdmin","SQL");
        RandomPerson randomPerson = new RandomPerson(programmer);
        System.out.println("Full Name: " + randomPerson.fullName());
        System.out.println("Age : "+randomPerson.calculateEmployerAge());
        System.out.println("Position:"+randomPerson.positinOfEmployer());
        System.out.println("Adress :"+randomPerson.adressOfEmployer());

    }
}

