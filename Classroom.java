package com.company;
public class Classroom {
    public static void main(String[] args) {
        Wilder walter = new Wilder("Walter", true);
        Wilder jesse = new Wilder("Jesse", true);
        Wilder flynn = new Wilder("Flynn", true);
        Wilder skyler = new Wilder("Skyler", false);
        Wilder holly = new Wilder("Holly", false);


        System.out.println(walter.whoAmI("Walter", true));
        System.out.println(jesse.whoAmI("Jesse", true));
        System.out.println(flynn.whoAmI("Flynn", true));
        System.out.println(skyler.whoAmI("Skyler", false));
        System.out.println(holly.whoAmI("Holly", false));
    }
}