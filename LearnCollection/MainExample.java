import java.util.HashMap;

public class MainExample {
    public static void main(String[] args) {
        HashMap<String,Integer> friends = new HashMap<>();
        friends.put("Ankit", 20);
        friends.put("Uttam",25);
        int size = friends.size();
        System.out.println(size);
        System.out.println(friends);
    }
}
