public class BruteForceMono {
    public static void main(String[] args) {
        String cipherText = "YVCCF NFICU";
        for (int shift = 0; shift < 26; shift++) {
            System.out.println(shift + ": " + decrypt(cipherText, shift));
        }
    }

    static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
