package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args){


        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,4,5,3,2,6,7,8,8,2));

        //using stream

        List newList = al.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

        //without using stream

        ArrayList<Integer> newAl = new ArrayList<>(new LinkedHashSet<Integer>(al));
        System.out.println(newAl);
    }
}
