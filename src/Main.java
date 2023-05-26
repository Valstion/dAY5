public class Main {
    public static void main(String[] args) {
        for (; true; ) {
            double rndNum = Math.random();
            System.out.println(rndNum);
            if (rndNum > 0.7) ;
            {
                break;
            }
        }
        boolean shouldGo = true;
        while (shouldGo) {
            if (Math.random() > 0.5) {
                shouldGo = false;
            }
            System.out.println("=)");
        }
        while (true) {
            System.out.println("=)");
            if (Math.random() > 0.5) {
                break;
            }
        }
        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                System.out.println("Y = " + y + " X = " + x);
            }
        }
        System.out.println("--------------------------------------------------");
        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                System.out.print(y * x + " ");
            }

            System.out.println();
        }
    }
}
