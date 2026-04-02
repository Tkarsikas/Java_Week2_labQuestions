import java.util.*;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //A1
        ArrayList<String> list = new ArrayList<>();

        list.add("b");
        list.add("a");
        list.add("c");

        Collections.sort(list);
        System.out.println(list);

        sc.close();
    }
}
