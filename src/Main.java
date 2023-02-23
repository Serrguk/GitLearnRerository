import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SPEED_OF_LIGHT = 1_079_252_848.8 kph

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость первого объекта: ");
        double speed1 = scanner.nextDouble();
        System.out.println("Введите скорость второго объекта: ");
        double speed2 = scanner.nextDouble();
        scanner.close();

        RelativitySpeeds rs = new RelativitySpeeds();
        System.out.println("Относительные скорости объектов равны :" + rs.sumSpeed(speed1, speed2) + " км/ч");
    }
}