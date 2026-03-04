import java.util.Scanner;

public class Exercicio02 {

    static final int N = 30;


    public static void main(String[] args) {
        final int N = 30;

        int rm[] = new int[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
       int n = entradaDeDados(rm, nota1, nota2);

       double media[] = new double[n];
       calcularMedia(n, nota1,nota2,media);

        for (int i = 0; i < n; i++) {
            System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
        }
        int aprovados[] = new int[n];
        int nAp = geraListaAprovados(n,media,rm,aprovados);
        System.out.println("\n **** LISTA DE APOVADOS ****");
        for (int i = 0; i < nAp; i++) {
            System.out.println(aprovados[i]);

        }
    }
    public static void calcularMedia(int n,double[] nota1, double[] nota2,double[] media){
        for (int i = 0; i < n; i++) {
            media[i] = (nota1[i] + nota2 [i]) / 2;

        }
    }
    public static int geraListaAprovados(int n, double[] media, int[] rm,int[] aprovados){
        int nAp = 0;
        for (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                aprovados[nAp] = rm[i];
                nAp++;
            }
        }
        return nAp;
    }


    public static int entradaDeDados(int[] rm, double[] nota1, double[] nota2){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Informe RM (negativo para encerrar)");
        int rmLido = sc.nextInt();


        for (n = 0;n  < N & rmLido > 0 ;n++) {
            rm[n] =  rmLido;

            System.out.print("Nota 1:");
            nota1[n] = sc.nextDouble();

            System.out.print("Nota 2:");
            nota2[n] = sc.nextDouble();

            System.out.println("Informe o rm (negativo para encerrar)");
            rmLido = sc.nextInt();

        }
        return n;
    }
}

