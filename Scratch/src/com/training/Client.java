package com.training;

class Client {
    public static void main(String[] args) {
// classloader loads Instructor.class into memory which initializes all Instructor Objects
//     Instructor instructor1 = new Instructor("John", 20);
//
//     Instructor instructor2 = new Instructor("Jane", 30);
        Instructor.touch();
        Instructor.touch();
    }
}