import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");
        for(String s : names)
        {
            System.out.println(s +"\t"+ s.length());
        }
        System.out.println("Next==========");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
        ListIterator<String> listIterator = names.listIterator(names.size());
        while(listIterator.hasPrevious()){
            String previous = listIterator.previous();
            System.out.println(previous);

        }
        System.out.println("forecah method");
        names.forEach(p->
        {
            System.out.println(p);
        });
        System.out.println("treeset");
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.addAll(names);
        treeSet.forEach(str->
                {
                    System.out.println(str);
                });



    }
}
