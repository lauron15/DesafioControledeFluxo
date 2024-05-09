import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro Parâmetro");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo Parâmetro");
        int valor2 = sc.nextInt();

        try {
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        sc.close();
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        if (valor1 >= valor2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = valor1; i <= valor2; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}