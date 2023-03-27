package Hierarchy;

import java.time.LocalDateTime;
import java.util.Date;

public class DatabaseAdmin extends Employee{

    private String dbTechnology ;

    public DatabaseAdmin(String firstname, String lastName, LocalDateTime birthday, String addres, LocalDateTime dateOfEmployment, String position,String dbTechnology) {
        super(firstname, lastName, birthday, addres, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology(){
        return  dbTechnology;
    }
    @Override
    public String getPosition() {
        return super.getPosition();
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
        return "db admin"+" "+super.getAddres();
    }
}
