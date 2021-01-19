package com.tts.main;

import java.util.Scanner;

public class Pet {
    private static String name;
    private static int age;
    private static String location;
    private static String type;
    private static Pet myPet = new Pet();

    public static void main(String[] args) {

        name = "Apollo";
        myPet.setPetName(name);
        myPet.setPetAge(3);
        myPet.setPetLocation("Foster");
        myPet.type = "dog";
        myPet.petInfo(myPet);
    }

    public void petInfo(Pet pet ){
        System.out.println("Here's your pet info " + pet.toString().replace("{", "").replace("]",""));
    }


    //getters
    public String getPetName() { return name; }

    public int getPetAge() { return age; }

    public String getPetLocation() { return location; }

    public String getPetType() { return type; }

    //setters
    public void setPetName(String petName) { this.name = petName; }

    public void setPetAge(int petAge) { this.age = petAge; }

    public void setPetLocation(String petLocation) { this.location = petLocation; }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}//end class
