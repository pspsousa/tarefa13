package tarefa13;
public class Exercicio07 {
public static boolean Exercicio07(String str) {

	// Verificar se uma string é palíndromo: Escreva um método que receba uma string como argumento e retorne verdadeiro se a string for um palíndromo e falso caso contrário.

        // Remove espaços e converte para minúsculas
        str = str.replace(" ", "").toLowerCase();
        // Verifica se a string é igual à sua versão invertida
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String palavra1 = "reconhecer";
        String palavra2 = "java";
        String frase1 = "A man a plan a canal Panama";
        String frase2 = "hello world";

        System.out.println(palavra1 + " é um palíndromo? " + Exercicio07(palavra1));
        System.out.println(palavra2 + " é um palíndromo? " + Exercicio07(palavra2));
        System.out.println(frase1 + " é um palíndromo? " + Exercicio07(frase1));
        System.out.println(frase2 + " é um palíndromo? " + Exercicio07(frase2));
    }
}