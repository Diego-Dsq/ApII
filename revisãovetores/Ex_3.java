package revisãovetores;

import java.util.Scanner;

public class Ex_3 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int Vetor1[] = {7, 2, 5, 8, 4};
        int Vetor2[] = {4, 2, 9, 5};
        String ola = uniao (Vetor1, Vetor2);

        System.out.println(ola);

    }

    static String uniao (int[] vetor1, int[] vetor2) {
        String concatenar = "";

        for (int i = 0; i < vetor1.length; i++) {
            concatenar = concatenar + vetor1[i];
        }

        for (int i = 0; i < vetor2.length; i++) {
            boolean Comparar = false;

            for (int j = 0; j < vetor1.length; j++) {

                if (vetor2[i] == vetor1[j]) {
                    Comparar = true;
                }
            }
            if (Comparar == false) {
                concatenar = concatenar + vetor2[i];
            }
        }

        return concatenar;
    }
}
