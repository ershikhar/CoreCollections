package MapAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapOperations {
    public static void main(String[] args){
        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("India","Delhi");
        hm1.put("Canada","Ottwa");
        hm1.put("Canadai","Ottwa");
        hm1.put("Paji",null);
        hm1.put("waji",null);

        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm2.put("India","Delhi");
        hm2.put("Indiai","Delhi");
        hm2.put("Canada","Ottwa");
        hm1.put("Canadai","Ottwa");
        hm2.put("Paji",null);
        hm2.put("waji",null);
//        hm2.put("wajiiiii",null);

        //find the diffenrece
        HashSet hs = new HashSet(hm1.entrySet());
        hs.addAll(hm2.entrySet());
        System.out.println(hs);
        hs.removeAll(hm1.entrySet());
        System.out.println(hs);

        //compare for equality of entries
        System.out.println(hm1.entrySet().equals(hm2.entrySet()));

        //compare for equality of keys
        System.out.println(hm1.keySet().equals(hm2.keySet()));

        //compare for equality of values
        System.out.println(hm1.values().equals(hm2.values()));

        //compare for equality of values
        System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values())));

        //compare for equality of values with duplicates value
        System.out.println(new HashSet<>(hm1.values()).equals(new HashSet<>(hm2.values())));
        System.out.println("------------");

        //intersection of keys
        hm1.keySet().retainAll(hm2.keySet());
        System.out.println(hm1.keySet());
    }
}
