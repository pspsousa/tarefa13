package tarefa13;
public class Exercicio01 {
public static boolean Exercicio01(int numero) {

	//  Verificar se um número é par ou ímpar: Crie um método que receba um número inteiro como parâmetro e retorne verdadeiro se o número for par e falso se for ímpar.

        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 15;

        System.out.println(numero1 + " é par? " + Exercicio01(numero1));
        System.out.println(numero2 + " é par? " + Exercicio01(numero2));
    }
}
