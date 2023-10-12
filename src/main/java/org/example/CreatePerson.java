package org.example;

public class CreatePerson {

    // attribute
    private String personName;

    private int personAge;


    // konstruktør
    public CreatePerson(String personName, int personAge){
        this.personName = personName;
        this.personAge = personAge;
    }

    // set-method
    public void setPersonName(String personName){
        this.personName = personName;
    }

    public void  setPersonAge(int personAge){
        this.personAge = personAge;
    }


    // get-method
    public String getPersonName(){
        return personName;
    }

    public  int getPersonAge(){
        return personAge;
    }

    @Override
    public String toString() {
        return "CreatePerson" +
                "personName =" + personName + '\'' +
                "personAge =" + personAge;
    }
}
