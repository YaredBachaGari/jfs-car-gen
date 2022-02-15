package com.example.car_gen;

public class Main {
    public static void main(String[] args){
        Honda civic = new Honda();
        Lexus rx350 = new Lexus();
        Toyota supra = new Toyota();

        System.out.println(rx350.getColor());
        System.out.println(civic.getColor());
        System.out.println(supra.getColor());

        System.out.println(civic.accelerateSpeed());
        System.out.println(civic.decelerateSpeed());
        System.out.println(civic.convertToElectric());
    }
}
