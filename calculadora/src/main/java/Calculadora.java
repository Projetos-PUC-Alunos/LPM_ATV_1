import java.lang.Math;

class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Não é possivel dividir por 0 'zero'");
        }
    }

    public double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double cosseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public double raizQuadrada(double num) {
        return Math.sqrt(num);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
