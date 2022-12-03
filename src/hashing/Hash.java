package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(2);
        set.add(4);
        set.remove(4);
        Iterator it = set.iterator();
        System.out.println("elements in set are "+set);
        
    }
}
