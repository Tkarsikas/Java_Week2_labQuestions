import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //C4
        HashMap<String, Integer> siMap = new HashMap<>();

        String sentence = sc.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        for (String string : words) {
            if(siMap.containsKey(string)){
                int a = siMap.get(string)+1;
                siMap.put(string, a);
            }else{
                siMap.put(string, 1);
            }
        }

        for (String string : siMap.keySet()) {
            System.out.println("key: "+ string + ", value: "+ siMap.get(string));
        }
        sc.close();
    }
}
