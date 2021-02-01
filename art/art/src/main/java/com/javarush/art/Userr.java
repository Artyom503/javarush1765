package com.javarush.art;


import org.attoparser.trace.MarkupTraceEvent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// Class is called Userr, with double "r", because postgre does not allow entity "user"
@Entity // This tells Hibernate to make a table out of this class
public class Userr {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) // This says id will be generated automatically
    private int id;

    private String login;
    private String password;
    private String name;
    private String gender;
    private String surname;
    private String birthday;
    private String PersonalInfo;
    private String email;
    private String address;

    // When working with entities, we have to create an empty constructor
    public Userr(){

    }
    // Here comes the real constructor
    public Userr(int id, String name, String surname, String birthday, String login, String password, String PersonalInfo, String email, String address){

        this.login = login;
        this.password = password;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.PersonalInfo = PersonalInfo;
        this.address = address;
    }

    //Multiple setters and getter

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPersonalInfo() {
        return PersonalInfo;
    }

    public void setPersonalInfo(String personalInfo) {
        PersonalInfo = personalInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}