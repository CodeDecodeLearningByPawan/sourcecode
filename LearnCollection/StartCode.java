import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");
//        System.out.println(names);
//        System.out.println(names.get(2));

        names.remove(2);
        names.remove("Vandna");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Durgesh"));
        System.out.println(names.isEmpty());
        System.out.println(names.set(1,"Ram"));
       // names.clear();
        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println(vector);
        System.out.println("--------------------------------------------------------");

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(15.14);
        nms.add(16.14);
        nms.add(17.14);
        nms.add(99.3);
        nms.add(99.3);
        System.out.println(nms);
        System.out.println();

        TreeSet<Double> treeset = new TreeSet<>();
        treeset.addAll(nms);
        System.out.println(treeset);


//        LinkedList list = new LinkedList<>();
//        list.add("Sachin");
//        list.add(102);
//        list.add(654.02);
//        list.add(true);
//        System.out.println(list);
//

    }
}
