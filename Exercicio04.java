package tarefa13;
public class Exercicio04 {
public static double Exercicio04(double numero1, double numero2, double numero3) {

	//Calcular a média de três números: Crie uma função que receba três números como parâmetros e retorne a média desses números.

        return (numero1 + numero2 + numero3) / 3;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;
        double num3 = 30;

        double media = Exercicio04(num1, num2, num3);
        System.out.println("A média dos números é: " + media);
    }
}