package ListAndArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayLists
{
    public static void main(String[] args){
        List<Integer> syncAl = Collections.synchronizedList(new ArrayList<Integer>());
        //for adding/remove - no sync blocks needed
        syncAl.add(1);
        syncAl.add(2);
        syncAl.add(3);
        syncAl.remove(2);
        System.out.println(syncAl);
        //to fetch - block needed
        Iterator<Integer> itr = syncAl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //the iterator above will fail if usd in multithreading so below is the solution
        synchronized (syncAl){
            Iterator<Integer> it = syncAl.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
//Copyonarraylist does not require the synchronized block
        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        al.add(3);
        al.add(4);
        al.add(4);
        al.add(null);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
