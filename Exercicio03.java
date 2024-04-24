package tarefa13;
public class Exercicio03 {
public static String Exercicio03(double numero) {

	//  Verificar se um número é positivo, negativo ou zero: Implemente um método que receba um número como parâmetro e retorne uma mensagem indicando se o número é positivo, negativo ou zero.

        if (numero > 0) {
            return "O número é positivo.";
        } else if (numero < 0) {
            return "O número é negativo.";
        } else {
            return "O número é zero.";
        }
    }

    public static void main(String[] args) {
        double numero1 = 5;
        double numero2 = -10;
        double numero3 = 0;

        System.out.println(Exercicio03(numero1));
        System.out.println(Exercicio03(numero2));
        System.out.println(Exercicio03(numero3));
    }
}