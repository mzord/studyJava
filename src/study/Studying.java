package study;

import entities.Rent;

import java.util.*;
import java.util.stream.Collectors;

public class Studying {

    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("Foda");
        list.add("Pica");
        list.add(1, "Joao");
        list.add(2, "Fodao");

        list.indexOf("Foda");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

        for (String item : list) {
            System.out.println(item);
        }
    }

}
