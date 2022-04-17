package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println();
	String firstName = "Ivan";
	String middleName = "Ivanovich";
	String lastName = "Ivanov";
	String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("FIO sotrudnika - " + fullName);
        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println();
        fullName = fullName.toUpperCase();
        System.out.println("FIO sotrudnika dlya otcheta - " + fullName);
        System.out.println();
        System.out.println("Zadanie 3");
        System.out.println();
        String firstName1 = "Maxim";
        String middleName1 = "Maximovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName1 + ' ' + firstName1 + ' ' + middleName1;
        fullName1 = fullName1.replace("x", "ks");
        System.out.println(fullName1);



    }
}
