package MapAndHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CreateMapMultipleWays {

    //Static Map
    static Map m ;
    static{
        m = new HashMap();
        m.put("statickey1","value 1");
        m.put("statickey2","value 2");
    }
    public static void main(String[] args){
        System.out.println(CreateMapMultipleWays.m.get("statickey2"));

        //Singleton - just one entry
        Map singleMap = Collections.singletonMap("username","Shikhar");
        System.out.println(singleMap.get("username"));

        //Empty map -- nothing can be added to it
        Map emptyMap =  Map.of();

        Map multimap =  Map.of(1,222,2,444,3,555);
        System.out.println(multimap);

        //Antoher way is to use Stream.of and then passing string array in it
        //Antoher way is to use SingleEntry with abstractmap
    }
}
