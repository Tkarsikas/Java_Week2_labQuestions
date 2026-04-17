public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        PhoneBook objPhoneBook = new PhoneBook();

        objPhoneBook.add("Anna", "0202020");
        objPhoneBook.add("Bob", "05454545");
        objPhoneBook.add("James", "232323");

        
        System.out.println(objPhoneBook.find("James"));
        System.out.println(objPhoneBook.size());


    }
}
