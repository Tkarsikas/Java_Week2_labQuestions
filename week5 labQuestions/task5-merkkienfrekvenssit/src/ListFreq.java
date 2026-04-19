import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListFreq {

    public static String frequensies(String s) {
        if (s == null) {
            return "{}";
        }

        Map<Character, Long> letters = s.toLowerCase()
            .chars()
            .mapToObj(c -> (char) c)
            .filter(Character::isLetter)
            .collect(Collectors.groupingBy(
                ch -> ch,
                LinkedHashMap::new,
                Collectors.counting()
            ));

        return letters.toString();
    }
}