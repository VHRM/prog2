import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Rep {
    private static int sumZeroToTen() throws Exception {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }
    
    private static int[] getInterval(int a, int b) throws Exception {
        int interval[], diff;
        if (a < b) {
            diff = b - a;
        } else {
            diff = a - b;
        }

        interval = new int[diff];
        for (int i = 0; i < diff; i++) {
            interval[i] = diff + i;
        }
        return interval;
    }

    private static int countPositives(ArrayList<Integer> numbers) throws Exception {
        int sum = 0;
        for (int i : numbers) {
            if (i > 0) {
                sum++;
            }
        }
        return sum;
    }

    private static int[] countOdds(int a, int b) throws Exception {
        int interval[] = getInterval(a, b), odds[] = new int[interval.length], countOdds = 0;
        for (int i : interval) {
            if (i % 2 == 1) {
                odds[countOdds] = i;
                i++;
            }
        }
        return odds;
    }

    private static Boolean isPrime(int number) throws Exception {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 1: Caso teste () -> " + sumZeroToTen());
        System.out.println("Exercício 2: Caso teste (3, 10) -> " + Arrays.toString(getInterval(3, 10)));
        int n[] = {3, 10, 11, 15, -1, -2, -3};
        System.out.println("Exercício 3: Caso teste ");
        ArrayList<Integer> entradas = new ArrayList<Integer>();
        int entrada = 1;
        Scanner scan = new Scanner(System.in);
        while (entrada != 0) {
            System.out.println("Insira um número:");
            entrada = scan.nextInt();
            if (entrada != 0) {
                entradas.add(entrada);
            }
        }
        System.out.println("Quantidade de positivos: " + countPositives(entradas));
        
        System.out.println("Exercício 4: Caso teste (1, 10) -> ");
        n = countOdds(1, 10);
        for (int i : n) {
            if (i > 0)
                System.out.println("É impar: " + i);
        }
        System.out.println("Exercício 5: Caso teste (19) -> 19 " + (isPrime(19) ? "é primo" : "não é primo"));
    }
}
