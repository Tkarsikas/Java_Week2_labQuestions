
import java.util.HashMap;

public class PhoneBook {

    private final HashMap<String, String> entries;

    public PhoneBook() {
        this.entries = new HashMap<>();
    }

    public void add(String name, String number) {
        this.entries.put(name, number);
    }

    public String find(String name) {
        return this.entries.get(name);
    }

    public int size() {
        return this.entries.size();
    }
}