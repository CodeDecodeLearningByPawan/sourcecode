import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp obj1, Emp obj2) {
        return obj1.getEmpId() - obj2.getEmpId();
    }
}
