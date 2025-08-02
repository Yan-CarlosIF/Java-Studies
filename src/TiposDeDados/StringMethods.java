package TiposDeDados;

public class StringMethods {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        // LowerCase
        System.out.println(original.toLowerCase());

        // UpperCase
        System.out.println(original.toUpperCase());

        // Trim (espaços no fim e inicio)
        System.out.println(original.trim());

        // substring (cria um substring a partir de indices)
        System.out.println(original.substring(2));
        System.out.println(original.substring(2, 9));

        // replace
        System.out.println(original.replace('a', 'x'));

        String chama = "Chama ou não chama?";

        // split
        String[] words = chama.split(" ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
