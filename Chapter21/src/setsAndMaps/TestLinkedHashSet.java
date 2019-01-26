package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("Dhaka");
        set.add("Takio");
        set.add("New York");
        System.out.println(set);

        for (Object element : set) {
            System.out.println(element.toString().toLowerCase() + "  ");
        }
    }
}
