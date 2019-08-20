package revisãovetores;

import java.util.Scanner;

public class Ex_4 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int Vetor1[] = {1, 3, 6, 7};
        int Vetor2[] = {2, 4, 5};
        int Vetor3[] = intercalar(Vetor1, Vetor2);

        for (int i = 0; i < Vetor3.length; i++) {
            System.out.print(Vetor3[i] + "\t");
        }

    }

    static int[] intercalar(int[] Vetor1, int[] Vetor2) {

        int Vetor3[] = new int[7];
        int p = 0, r;
        for (int i = 0; i < Vetor1.length; i++) {
            Vetor3[i] = Vetor1[i];
        }
        
        for (int i = 4; i < Vetor3.length; i++) {
            Vetor3[i] = Vetor2[p];
            p++;
        }
        
        for (int i = 0; i <Vetor3.length; i++) {
            for (int j = 0; j <Vetor3.length; j++) {
                
                if (Vetor3[i] < Vetor3[j]){
                    r = Vetor3[j];
                    Vetor3[j] = Vetor3[i];
                    Vetor3[i] = r;
                }
                
            }
            
        }

        return Vetor3;
    }
}
