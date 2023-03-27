package Hierarchy;

import java.time.LocalDateTime;
import java.util.Date;

public class Programmer extends Employee{
    private String Language;
    public String getLanguage(){
        return Language;
    }

    public Programmer(String firstname, String lastName, LocalDateTime birthday, String addres, LocalDateTime dateOfEmployment, String position, String language) {
        super(firstname, lastName, birthday, addres, dateOfEmployment, position);
        Language = language;
    }


    @Override
    public String getPosition() {
        return "Programmer";
    }

    @Override
    public LocalDateTime getDateOfEmployment() {
        return super.getDateOfEmployment();
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public LocalDateTime getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getAddres() {
        return super.getAddres();
    }
}
