package MapAndHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeMaps {
    public static void main(String[] args){
        //ConcurrentHashMaps - cannot have null kes,valyues but allows rea for threads and segmentwise locking,so very effieicent
        //will bnever throw concurrent exception
        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put("India","Delhi");
        chm.put("Canada","Ottwa");
//        chm.put(null,"Pak");   -- null pointer exception
        System.out.println(chm);

        //synchronized maps - lock on complete map , can have null key .values
        Map m1 = new HashMap();
        m1.put("ss","Sss");
        Map m = Collections.synchronizedMap(m1);
        m.put("India","Delhi");
        m.put("Canada","Ottwa");
        m.put("null","Delhi");
        m.put("Canadsa","null");
        System.out.println(m);



    }
}
