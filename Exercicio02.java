package tarefa13;
public class Exercicio02 {
public static double Exercicio02(double numero) {

	// Calcular o quadrado de um número: Desenvolva um método que receba um número como argumento e retorne o quadrado desse número.

        return numero * numero;
    }

    public static void main(String[] args) {
        double numero1 = 5;
        double numero2 = 10;

        System.out.println("O quadrado de " + numero1 + " é: " + Exercicio02(numero1));
        System.out.println("O quadrado de " + numero2 + " é: " + Exercicio02(numero2));
    }
}