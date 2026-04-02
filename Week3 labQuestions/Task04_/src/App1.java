import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //C1
        ArrayList<String> listStr = new ArrayList<>();
        String name="";
        do{
            System.out.print("lisää nimi: ");
            name = sc.nextLine();
            if(!name.equals("stop")){
                listStr.add(name);
            }else{
                System.out.println("lopetit nimien lisäämisen, tulostetaan listan nimet: ");
            }
        }while(!name.equals("stop"));

        for (String string : listStr) {
            System.out.print(string+", ");            
        }
        System.out.println("lista tulostettu");

        sc.close();


    }
}
