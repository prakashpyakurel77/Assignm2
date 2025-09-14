package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Person {

    private String name;
    private String address;
    private short age;

    // Constructor that takes name and age
    public Person(String name, short age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods for address
    public abstract String getAddress();
    public abstract void setAddress(String address);

    // Getter and Setter for age
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}