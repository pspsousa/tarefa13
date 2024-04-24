package tarefa13;
public class Exercicio09 {
public static double Exercicio09(double base, double altura) {

	// Calcular a área de um retângulo: Desenvolva um método que receba a base e a altura de um retângulo como parâmetros e retorne a área desse retângulo.

        return base * altura;
    }

    public static void main(String[] args) {
        double base = 5;
        double altura = 3;

        double area = Exercicio09(base, altura);
        System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é: " + area);
    }
}
