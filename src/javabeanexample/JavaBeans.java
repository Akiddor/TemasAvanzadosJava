package javabeanexample;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        // create a new object
        Person person = new Person();
        // add values in Person.name
        person.setName("Brian");
        // add values in Person.lastName
        person.setLastName("Guerrero");
        // call to method toString
        System.out.println(person.toString() );


    }
}

class Person implements Serializable {
    private String name;
    private String lastName;


    // method constructor
    public Person(){
    }
    // Create a getters and setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methd toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
