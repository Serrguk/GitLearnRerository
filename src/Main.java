import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        //SPEED_OF_LIGHT = 1_079_252_848.8 kph

        BigDecimal value1 = BigDecimal.valueOf(987654321);
        BigDecimal value2 = BigDecimal.valueOf(123456789);
        System.out.println(value1.divide(value2, 100, RoundingMode.DOWN));

        RelativitySpeeds rs = new RelativitySpeeds();
        System.out.println("\n" + rs.sumSpeed(100, 50));
    }
}