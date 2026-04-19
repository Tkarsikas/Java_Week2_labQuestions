
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String s = "tämä on testi";

        String newS = ListFreq.frequensies(s);
        System.out.print(newS);
    }
}
