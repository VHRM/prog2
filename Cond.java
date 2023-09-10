public class Cond {
    private static Boolean greaterThan(int a, int b) throws Exception {
        if (a > b) {
            return true;
        }
        return false;
    }

    private static String returnMaxNumber(int a, int b) throws Exception {
        if (greaterThan(a, b)) {
            return "Os maior é: " + a;
        } else if (a == b) {
            return "Os números são iguais";
        }
        return "Os maior é: " + b;
    }

    private static String isGreatest(int a, int b, int c) throws Exception {
        if (greaterThan(a, b) && greaterThan(a, c) && c != b) {
            return "Condição satisfeita";
        }
        return "Erro";
    }

    private static String evenOrOdd(int a) throws Exception {
        if (a % 2 == 0) {
            return a + "é par.";
        }
        return a + "é impar.";
    }

    private static int multAddSub(int a, int b) throws Exception{
        if (a == b) {
            return a * b;
        } else if (greaterThan(a, b)) {
            return a - b;
        }
        return a + b;
    }

    private static int calculator(int function, int a, int b) throws Exception {
        switch (function) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 1: Caso teste (1, 2) -> Resposta: " + returnMaxNumber(1, 2));
        System.out.println("Exercício 2: Caso teste (1, 2, 3) -> Resposta: " + isGreatest(1, 2, 3) );
        System.out.println("Exercício 3: Caso teste (10) -> Resposta: " + evenOrOdd(10));
        System.out.println("Exercício 4: Caso teste (1, 4) -> Resposta: " + multAddSub(1, 4));
        try {
            System.out.println("Exercício 4: Caso teste (1, 2, 3, 4) -> Resposta: " + calculator(1, 2, 3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}