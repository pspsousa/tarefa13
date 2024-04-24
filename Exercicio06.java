package tarefa13;
public class Exercicio06 {
public static double Exercicio06(double numero1, double numero2) {

	// Calcular o máximo entre dois números: Implemente uma função que receba dois números como parâmetros e retorne o maior deles.


        return Math.max(numero1, numero2);
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;

        double maximo = Exercicio06(num1, num2);
        System.out.println("O máximo entre " + num1 + " e " + num2 + " é: " + maximo);
    }
}