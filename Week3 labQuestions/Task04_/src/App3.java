import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //C3
        HashMap<String, String> mapSrings = new HashMap<>();

        String key="";
        String value="";
        
        do{
            System.out.print("lisää avain taulukkoon: ");
            key = sc.nextLine().trim().toLowerCase();

            if(!key.equals("stop")){
            System.out.print("lisää arvo taulukkoon: ");
            value = sc.nextLine().trim().toLowerCase();
            }if(!value.equals("stop")&&!key.equals("stop")){
                mapSrings.put(key, value);
            }else{
                System.out.println("lopetit arvojen lisäämisen, tulostetaan uniikit nimet listasta");
            }
        }while(!key.equals("stop") && !value.equals("stop"));

        for (String string : mapSrings.keySet()) {
            System.out.print("key: "+string+", value: "+mapSrings.get(string)+", ");
        }
        System.out.print("nimet tulostettu ");

        sc.close();
    }
}
