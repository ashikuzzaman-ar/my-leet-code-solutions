package myleetcodesolutions.solution.random;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class CoinChange implements Serializable {
    private static final Map<String, Double> map;

    static {
        map = new HashMap<>();
        map.put("PENNY", .01);
        map.put("NICKLE", .05);
        map.put("DESC", .1);
        map.put("QUARTER", .25);
        map.put("HALF", .5);
        map.put("ONE", 1.0);
        map.put("TWO", 2.0);
        map.put("FIVE", 5.0);
        map.put("TEN", 10.0);
        map.put("FIFTY", 50.0);
        map.put("HUNDRED", 100.0);
    }

    public void change() {
        try (Scanner scanner = new Scanner(System.in)) {
            String line; //"15.94;16.00";
            while ((line = scanner.next()) != null) {
                String[] numbers = line.split(";");
                BigDecimal pp = new BigDecimal(numbers[0]);
                BigDecimal ch = new BigDecimal(numbers[1]);
                if (pp.compareTo(ch) == 0) {
                    System.out.println("ZERO");
                } else if (pp.compareTo(ch) > 0) {
                    System.out.println("ERROR");
                }
                BigDecimal due = ch.subtract(pp).setScale(2, RoundingMode.HALF_UP);
                List<String> bills = new ArrayList<>();
                while (due.doubleValue() > 0) {
                    double comp = due.doubleValue();
                    Map.Entry<String, Double> entry =
                            map.entrySet().stream().filter(e -> e.getValue() <= comp).max((e1, e2) -> (int) (e1.getValue() - e2.getValue())).get();
                    due = due.remainder(BigDecimal.valueOf(entry.getValue())).setScale(2, RoundingMode.HALF_UP);
                    bills.add(entry.getKey());
                }
                System.out.println(bills.stream().sorted().collect(Collectors.joining(",")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
