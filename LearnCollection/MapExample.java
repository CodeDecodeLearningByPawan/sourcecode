import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Core Java",4000);
        courses.put("Basic Python",3000);
        courses.put("Spring",8000);
        courses.put("Android",4000);
        courses.put("Android",6000);
        System.out.println(courses);
        System.out.println("Using method");

        courses.remove("Core Java");
        System.out.println(courses);


}}
