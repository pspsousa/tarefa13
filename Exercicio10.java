package tarefa13;
public class Exercicio10 {
public static boolean Exercicio10(int numero) {

	// Verificar se um número é primo: Implemente uma função que receba um número inteiro como argumento e retorne verdadeiro se o número for primo e falso caso contrário.


        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 17;

        System.out.println(numero1 + " é primo? " + Exercicio10(numero1));
        System.out.println(numero2 + " é primo? " + Exercicio10(numero2));
        System.out.println(numero3 + " é primo? " + Exercicio10(numero3));
    }
}