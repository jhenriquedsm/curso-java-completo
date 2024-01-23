package topicosBasicos;

/*
Formatar: toLowerCase(), toUpperCase(), trim();
Recortar: substring(inicio), substring(inicio, fim);
Substituir: Replace(char, char), Replace(string, string)
Buscar: IndexOf, LastIndexOf;
str.Split(" ");
 */

public class functionStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(0,4);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xyz");
        int i = original.indexOf("bc"); //primeira posicao
        int j = original.lastIndexOf("bc"); //ultima posicao

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s1 + "-");
        System.out.println("toUpperCase: -" + s2 + "-");
        System.out.println("trim: -" + s3 + "-");
        System.out.println("substring(2): -" + s4 + "-");
        System.out.println("substring(0, 4): -" + s5 + "-");
        System.out.println("replace('a', 'x'): -" + s6 + "-");
        System.out.println("replace('abc', 'xyz'): -" + s7 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);


        String[] vect = original.split(" ");
        String s8 = vect[0];
        String s9 = vect[1];
        String s10 = vect[2];
        String s11 = vect[3];
        String s12 = vect[4];
        System.out.println("split(' '): " + s8);
        System.out.println("split(' '): " + s9);
        System.out.println("split(' '): " + s10);
        System.out.println("split(' '): " + s11);
        System.out.println("split(' '): " + s12);

    }
}
