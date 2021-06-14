import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание сканера

        System.out.println("Введите радиус окружности в см :");
        String radius =  scanner.nextLine (); //int radius = scanner.nextInt();(старые данные)

        double area = circleArea(radius); // double - дробные числа
        double lenght = circleLenght(radius);

        System.out.println("Площадь круга = " + area + "см.кв.");
        System.out.println("Динна окружности = " + lenght + "см.");
    }

    // расчет радиуса
    public static double circleArea(String radius){ //(int radius){ - изменения
        double r = Double.parseDouble (radius);
        final double Pi = 3.14;
        return Pi * r * r;
    }

    // расчет длины окружности
    public static double circleLenght (String radius){ //(int radius){
        double l = Double.parseDouble (radius);
        final double Pi = 3.14;
        return 2 * Pi * l;
    }

    // для теста отрицательного числа
    public static double negativeNumber(String radius){
        double negativeNumber = 0;
        try {
            double n = Double.parseDouble (radius);
            final double Pi = 3.14;
            if (n <= 0 ) return 0;
            return 2 * Pi * n;
        } catch (NumberFormatException e) {
            System.out.println ("Отрицательное число! \uD83D\uDE31");
        }
        return negativeNumber;
    }
}
