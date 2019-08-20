package revisãovetores;

import java.util.Scanner;

public class Ex_2 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        int Vetor1[] = {2, 3, 6, 5, 7, 11};
        int Vetor2[] = {5, 8, 10, 2, 7, 5};
        String ola = intersecao (Vetor1, Vetor2);

        System.out.println(ola);

    }

    static String intersecao (int[] vetor1, int[] vetor2) {
        String concatenar = "";

        for (int i = 0; i < vetor1.length; i++) {
            boolean Comparar = false;
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    Comparar = true;
                }
            }
            if (Comparar == false){
                concatenar = concatenar + vetor1[i];
            }
        }

        return concatenar;
    }
}
