import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh","32145678",12));
        emps.add(new Emp("Ankit","3214",11));
        emps.add(new Emp("Bhavesh","977",45));
       // emps.add(new Emp("Pawan","70477",18));
        //System.out.println(emps);
//        Collections.sort(emps);
//        System.out.println(emps);
        Collections.sort(emps, new IdComparator());
      //  System.out.println(emps);
        ArrayList<Emp> emps1 = new ArrayList<>();
        emps1.addAll(emps);
        System.out.println(emps1);
        Collections.sort(emps1,new NameComparator());
        System.out.println(emps1);


    }
}
