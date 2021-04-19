import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Ui ui;

    public static void main(String[] args) {
        new Main().run();
    }
    private void run() {
        ui = new Ui();
        System.out.println(ui.showWelcomeMessage());
        System.out.println();
        System.out.print(ui.inputPrompt());
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println();
            //handle input
            handleInput(input);
            System.out.println();
            System.out.println(ui.showWelcomeMessage());
            System.out.println();
            System.out.print(ui.inputPrompt());
        }
    }
    public void handleInput(String input) {
        try {
            Scanner sc = new Scanner(System.in);
            int i = Integer.parseInt(input);
            if(i == 1) {
                System.out.println(ui.caseOne());
                System.out.print(ui.inputPrompt());
                int a = sc.nextInt();
                List<Integer> palPrimes = getPalPrimes(a);
                for (Integer pp: palPrimes) {
                    System.out.println(pp);
                }
            } else if (i == 2) {
                System.out.println(ui.caseTwo());
                System.out.print(ui.inputPrompt());
                int a = sc.nextInt();
                System.out.print(ui.inputPrompt());
                int b = sc.nextInt();
                List<Integer> palPrimes = getPossiblePalPrimes(a, b);
                for (Integer pp: palPrimes) {
                    System.out.println(pp);
                }
            } else if (i == 3) {
                System.out.println(ui.caseThree());
                System.out.print(ui.inputPrompt());
                String txtString = sc.nextLine();
            } else if (i == 4) {
                System.out.println(ui.caseFour());
            } else if (i == 5) {

            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //palin prime
    private List<Integer> getPalPrimes(int a) {
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        List<Integer> primes = s.sieveOfEratosthenes(a);
        List<Integer> palinPrime = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++) {
            if(isPalin(primes.get(i))) {
                palinPrime.add(primes.get(i));
            }
        }
        return palinPrime;
    }

    private boolean isPalin(int p) {
        if (p >= 0 && p < 10) {
            return true;
        } else {
            int r, sum = 0, temp = p;
            while(p > 0) {
                r = p % 10;  //getting remainder
                sum = (sum * 10) + r;
                p = p / 10;
            }
            return sum == temp;
        }
    }

    //possible palprimes
    private List<Integer> getPossiblePalPrimes(int a, int b) {
        List<Integer> listOfpp = new ArrayList<>();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i = min; i <= max; i++) {
            if (isPossiblePalin(i)) {
                listOfpp.add(i);
            }
        }
        return listOfpp;
    }
    private boolean isPossiblePalin(int p) {
        String pString = Integer.toString(p);
        char[] arr = pString.toCharArray();
        for(int i = 0; i < pString.length(); i++) {
            String pp = pString.substring(0, i) + pString.substring(i+1, pString.length());
            Integer num = Integer.parseInt(pp);
            System.out.println(num);
        }
        return true;
    }
}
