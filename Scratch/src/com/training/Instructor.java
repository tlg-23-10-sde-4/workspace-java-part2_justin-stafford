package com.training;

class Instructor {
    // instance variables for each Instructor Object
    // shared among all Instructor Objects
    private static final Projector projector = new Projector();


    private String name;
    private final int yearsExperience;

    public Instructor(String name, int yearsExperience) {
        System.out.println("Instructor ctor created, name");
        this.name = name;
        this.yearsExperience = yearsExperience;
    }
    public static void touch() {
        System.out.println("Instructor.touch()");
    }
    public String getName() {
        return name;
    }
    public int getYearsExperience() {
        return yearsExperience;
    }
    static {
        System.out.println("static fields initialized, Instructor.class loaded into memory");
    }
}
