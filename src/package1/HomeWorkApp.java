package package1;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("------------------Task №2------------------");
        printThreeWords();
        System.out.println("------------------Task №3------------------");
        checkSumSign();
        System.out.println("------------------Task №4------------------");
        printColor();
        System.out.println("------------------Task №5------------------");
        compareNumbers();
        System.out.println("------------------Task №6------------------");
        System.out.println("Sum in range 10 to 20: " + checkRange(2, 8));
        System.out.println("Sum in range 10 to 20: " + checkRange(5, 15));
        System.out.println("Sum in range 10 to 20: " + checkRange(20, 15));
        System.out.println("------------------Task №7------------------");
        checkSign(-8);
        checkSign(0);
        checkSign(8);
        System.out.println("------------------Task №8------------------");
        System.out.println("Number is negative: " + getSign(-1));
        System.out.println("Number is negative: " + getSign(0));
        System.out.println("Number is negative: " + getSign(10));
        System.out.println("------------------Task №9------------------");
        printString("Lorem ipsum", 3);
        System.out.println("------------------Task №10------------------");
        System.out.println("Is leap year: " + leapYear(56));
        System.out.println("Is leap year: " + leapYear(200));
        System.out.println("Is leap year: " + leapYear(800));
    }

    //Task №2
    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //Task №3
    private static void checkSumSign() {
        int a = 5;
        int b = -10;
        int c;

        c = a + b;

        if (c >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    //Task №4
    private static void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }
    }

    //Task №5
    private static void compareNumbers() {
        int a = -120;
        int b = -1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Task №6
    private static boolean checkRange(int a, int b) {
        int c = a + b;
        return ((c > 10) && (c <= 20));
    }

    //Task №7
    private static void checkSign(int number) {
        if (number >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Відємне число");
        }
    }

    //Task №8
    private static boolean getSign(int number) {
        return (number < 0);
    }

    //Task №9
    private static void printString(String str, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(str);
        }
    }

    //Task №10
    private static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
