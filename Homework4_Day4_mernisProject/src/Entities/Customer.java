package Entities;

import Abstract.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements Entity {
    public String firstName,lastName,nationalityId;
    public int id;
    public LocalDate dateOfBirth;

    public Customer(String firstName, String lastName, String nationalityId, int id, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }
}
