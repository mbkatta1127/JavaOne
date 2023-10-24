package com.xpanxion.assignments.student;

public class Person {
    public int id;
    public String firstName;
    public String lastName;
    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

    public String setAndGetLastName(String lastName){
        this.lastName = lastName;
        return this.lastName;
    }


}
