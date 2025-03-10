import java.util.*;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        String cipherText = "YVCCF NFICU";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        freq.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
