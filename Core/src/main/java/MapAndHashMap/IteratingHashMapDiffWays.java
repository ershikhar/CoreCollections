package MapAndHashMap;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public class IteratingHashMapDiffWays {
    public static void main(String[] args){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("India","Delhi");
        hm.put("Canada","Ottwa");
        hm.put(null,"Pak");
        hm.put(null,"istan");
        hm.put("Paji",null);
        hm.put("waji",null);

        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Entry<String,String> e= (Entry<String, String>) itr.next();
            System.out.println(e.getValue());
        }
        System.out.println("-----------");
        hm.remove(null);
        itr = null;
        String str;
        itr = hm.keySet().iterator();
        while(itr.hasNext()){
            str = (String) itr.next();
            System.out.println(hm.get(str));
        }

        System.out.println("-----------");
        hm.forEach((k,v)-> System.out.println(hm.get(k)));
    }
}
