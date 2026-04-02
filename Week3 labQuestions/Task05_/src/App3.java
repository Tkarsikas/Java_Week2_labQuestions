import java.util.*;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //A3
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(3, "eka");
        map.put(1, "toka");
        map.put(2, "kolmas");
        
        System.out.println(map);
        sc.close();
    }
}
