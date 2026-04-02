import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //C2
        HashSet<String> setSrings = new HashSet<>();

        String name="";
        
        do{
            System.out.print("lisää nimi taulukkoon: ");
            name = sc.nextLine().trim().toLowerCase();
            if(!name.equals("stop")){
                setSrings.add(name);
            }else{
                System.out.println("lopetit nimien lisäämisen, tulostetaan uniikit nimet listasta");
            }
        }
        while(!name.equals("stop"));

        for (String string : setSrings) {
            System.out.print(string+", ");
        }
        System.out.print("nimet tulostettu ");

        sc.close();


    }
}
