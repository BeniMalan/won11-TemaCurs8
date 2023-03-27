package Hierarchy;
import java.time.LocalDateTime;

public  class Employee implements Person {
    public Employee(String firstname, String lastName, LocalDateTime birthday, String addres, LocalDateTime dateOfEmployment, String position) {
        Firstname = firstname;
        LastName = lastName;
        Addres = addres;
        Birthday=birthday;
        DateOfEmployment = dateOfEmployment;
        Position = position;
    }

    private String Firstname;
    private String LastName;
    private LocalDateTime Birthday;
    private String Addres;
    private LocalDateTime DateOfEmployment;
    private String Position;
    public String getPosition(){
        return Position;
    }
    public LocalDateTime getDateOfEmployment(){
          DateOfEmployment=LocalDateTime.now();
          return DateOfEmployment;
    }

    @Override
    public String getFirstname() {
        return Firstname;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return Birthday;
    }

    @Override
    public String getAddres() {
        return Addres;
    }
}







