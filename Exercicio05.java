package tarefa13;
public class Exercicio05 {
public static boolean Exercicio05(int ano) {

	// Verificar se um ano é bissexto: Desenvolva um método que receba um ano como argumento e retorne verdadeiro se o ano for bissexto e falso caso contrário.

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int ano1 = 2020;
        int ano2 = 2021;

        System.out.println(ano1 + " é bissexto? " + Exercicio05(ano1));
        System.out.println(ano2 + " é bissexto? " + Exercicio05(ano2));
    }
}


