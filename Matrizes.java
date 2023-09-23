import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{1,2,3},{1,2,3}};
        int[][] matrizDois = {{1,2,3},{1,2,3}};
        // Formando a primeira matriz
        System.out.println("Posicão [0][0] da primeira matriz: ");
        matriz[0][0] = sc.nextInt();
        System.out.println("Posicão [0][1] da primeira matriz: ");
        matriz[0][1] = sc.nextInt();
        System.out.println("Posicão [0][2] da primeira matriz: ");
        matriz[0][2] = sc.nextInt();
        System.out.println("Posicão [1][0] da primeira matriz: ");
        matriz[1][0] = sc.nextInt();
        System.out.println("Posicão [1][1] da primeira matriz: ");
        matriz[1][1] = sc.nextInt();
        System.out.println("Posicão [1][2] da primeira matriz: ");
        matriz[1][2] = sc.nextInt();

        // Formando a Segunda matriz
        System.out.println("Posicão [0][0] da segunda matriz: ");
        matrizDois[0][0] = sc.nextInt();
        System.out.println("Posicão [0][1] da segunda matriz: ");
        matrizDois[0][1] = sc.nextInt();
        System.out.println("Posicão [0][2] da segunda matriz: ");
        matrizDois[0][2] = sc.nextInt();
        System.out.println("Posicão [1][0] da segunda matriz: ");
        matrizDois[1][0] = sc.nextInt();
        System.out.println("Posicão [1][1] da segunda matriz: ");
        matrizDois[1][1] = sc.nextInt();
        System.out.println("Posicão [1][2] da segunda matriz: ");
        matrizDois[1][2] = sc.nextInt();

        // Gerando as duas matrizes:
        int[][] matrizResultante = {{(matriz[0][0] + matrizDois[0][0]),(matriz[0][1] + matrizDois[0][1]),(matriz[0][2] + matrizDois[0][2])},{(matriz[1][0] + matrizDois[1][0]),(matriz[1][1] + matrizDois[1][1]),(matriz[1][2] + matrizDois[1][2])}};
        
        System.out.println("Matriz Resultante:");
        System.out.printf("|%d %d %d|\n|%d %d %d|", matrizResultante[0][0],matrizResultante[0][1],matrizResultante[0][2],matrizResultante[1][0],matrizResultante[1][1],matrizResultante[1][2]);
        
    }
}
