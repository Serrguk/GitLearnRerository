import java.math.BigDecimal;
import java.math.RoundingMode;

public class RelativitySpeeds {
    public static final BigDecimal SPEED_OF_LIGHT = BigDecimal.valueOf(1_079_252_848.8);

    public BigDecimal sumSpeed(double speed1, double speed2) {
        BigDecimal v1 = BigDecimal.valueOf(speed1);
        BigDecimal v2 = BigDecimal.valueOf(speed2);

        if (v1.compareTo(SPEED_OF_LIGHT) > 0 || v2.compareTo(SPEED_OF_LIGHT) > 0) {
            System.out.println("Нельзя превысить скорость света");
            return BigDecimal.ZERO;
        } else {
            return (v1.add(v2))
                    .divide((BigDecimal.ONE.add((v1.multiply(v2))
                            .divide(SPEED_OF_LIGHT.pow(2), 50, RoundingMode.DOWN))), 50, RoundingMode.DOWN);
        }
    }
}