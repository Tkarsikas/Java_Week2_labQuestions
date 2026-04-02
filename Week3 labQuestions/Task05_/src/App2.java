import java.util.*;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //A2
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("a");
        list.add("abcde");
        list.add("ab");
        
        Collections.sort(list);
        System.out.println(list);
        sc.close();


    }
}
