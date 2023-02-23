package usingjavapackages;

import java.util.Scanner;

 class UsingPackages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, course, grade;
        double averagemarks;
        int regno, stage;
        //creating object scanner class
        System.out.println("Enter Registration number");
        regno=input.nextInt();
        System.out.println("Enter averagemarks");
        averagemarks=input.nextDouble();
        System.out.println("Enter name");
        name =input.next();
        System.out.println("Enter course");
        course=input.next();
        System.out.println("Enter grade");
        grade=input.next();
        System.out.println("Enter stage");
        stage=input.nextInt();

        System.out.println("Registration number"+ regno);
        System.out.println("averagemarks" + averagemarks);
        System.out.println("name" + name);
        System.out.println("course" + course);
        System.out.println("grade" + grade);
        System.out.println("stage" + stage);



    }
}