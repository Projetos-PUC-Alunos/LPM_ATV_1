import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("Calculadora Euler");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Seno");
            System.out.println("6 - Cosseno");
            System.out.println("7 - Tangente");
            System.out.println("8 - Raiz Quadrada");
            System.out.println("9 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            double resultado = 0.0;
            double num1, num2, angulo;
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.somar(num1, num2);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.dividir(num1, num2);
                    break;
                case 5:
                    System.out.print("Digite o ângulo em graus: ");
                    angulo = scanner.nextDouble();
                    resultado = calculadora.seno(angulo);
                    break;
                case 6:
                    System.out.print("Digite o ângulo em graus: ");
                    angulo = scanner.nextDouble();
                    resultado = calculadora.cosseno(angulo);
                    break;
                case 7:
                    System.out.print("Digite o ângulo em graus: ");
                    angulo = scanner.nextDouble();
                    resultado = calculadora.tangente(angulo);
                    break;
                case 8:
                    System.out.print("Digite um número: ");
                    double numRaiz = scanner.nextDouble();
                    resultado = calculadora.raizQuadrada(numRaiz);
                    break;
                case 9:
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double expoente = scanner.nextDouble();
                    resultado = calculadora.potencia(base, expoente);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            System.out.println("Resultado da operação: " + resultado);
        }

        scanner.close();
    }
}