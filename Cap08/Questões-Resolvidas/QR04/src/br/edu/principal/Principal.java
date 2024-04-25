package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int seg;

        System.out.println("Digite o número de segundos:");
        seg = sc.nextInt();

        transformacao(seg);
    sc.close();
	}
	
	public static void transformacao(int segundos) {
        int h, m, s, r;
        h = segundos / 3600;
        r = segundos % 3600;
        m = r / 60;
        s = r % 60;
        System.out.println(h + " horas " + m + " minutos " + s + " segundos");
    }
}
