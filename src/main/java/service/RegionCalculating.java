package service;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;

public class RegionCalculating (LegalOrderCalculating legalOrderCalculating){

private final Map<TypeOrderFromRegion, Integer> orders =
        new EnumMap<>(TypeOrderFromRegion.class);

public void putOrder(Integer eDostavkaAndEmoll, Integer mail,
                     Integer bidOrder, Integer bags,
                     Integer hours, Integer cancelledOrder,
                     Integer cancelledMail) {
    orders.put(TypeOrderFromRegion.EDOSTAVKA_AND_EMOLL, eDostavkaAndEmoll);
    orders.put(TypeOrderFromRegion.MAIL, mail);
    orders.put(TypeOrderFromRegion.BIG_ORDER, bidOrder);
    orders.put(TypeOrderFromRegion.BAGS, bags);
    orders.put(TypeOrderFromRegion.HOURS, hours);
    orders.put(TypeOrderFromRegion.CANCELLED_ORDER, cancelledOrder);
    orders.put(TypeOrderFromRegion.CANCELLED_MAIL, cancelledMail);
}

public BigDecimal calculateSalary() {
    BigDecimal total = BigDecimal.ZERO;
    for (TypeOrderFromRegion types: TypeOrderFromRegion.values()) {
        int count = orders.getOrDefault(types, 0);
        BigDecimal rate = types.getRate();
        BigDecimal countBigDec = BigDecimal.valueOf(count);
        BigDecimal salary = rate.multiply(countBigDec);
        total = total.add(salary);
    }
    total = total.add();
    return total;
}


public Map<TypeOrderFromRegion, Integer> getOrders() {
    return orders;
}

}
