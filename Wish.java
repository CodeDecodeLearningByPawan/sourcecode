@FunctionalInterface
public interface Wish {
    void wishMsg();
    class Greeting{
        public static void main(String[] args) {
            Wish wish = () -> {
                System.out.println("Hi");
                System.out.println("GoodMorning");
            };
            wish.wishMsg();

        }
    }
}
