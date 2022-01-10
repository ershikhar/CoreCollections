package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MultipleArrayListOperations {
    public static void main(String[] args){

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,2,4,5,3,2,6,7,8,8,2,44));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(1,2,2,4,5,3,21,6,7,8,8,2));

        //Comparison - sort
        Collections.sort(al1);
        Collections.sort(al2);
        System.out.println(al1.equals(al2));


        System.out.println("al1 is "+al1);
        System.out.println("al2 is "+al2);

        //unique elements
        al1.removeAll(al2);
        System.out.println(al1);
        al1 = new ArrayList<>(Arrays.asList(1,2,2,4,5,3,2,6,7,8,8,2,44));
        System.out.println("al1 is "+al1);
        System.out.println("al2 is "+al2);


        //intersection
        al1.retainAll(al2);
        System.out.println(al1);


        //printing with foreach
        System.out.println("---------------------");
        al2.forEach((ele)-> System.out.println(ele));
    }
}
