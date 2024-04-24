package tarefa13;
public class Exercicio08 {
public static long Exercicio08(int numero) {

	// Calcular o fatorial de um número: Crie uma função que receba um número inteiro como parâmetro e retorne o fatorial desse número.

        if (numero < 0) {
            System.out.println("Erro: O número deve ser não negativo.");
            return -1;
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;

        long fatorial1 = Exercicio08(numero1);
        long fatorial2 = Exercicio08(numero2);

        System.out.println("O fatorial de " + numero1 + " é: " + fatorial1);
        System.out.println("O fatorial de " + numero2 + " é: " + fatorial2);
    }
}