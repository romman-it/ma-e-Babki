package service;

import java.math.BigDecimal;

import static service.TypeOrderFromRegion.BIG_ORDER;
import static service.TypeOrderFromRegion.MAIL;

public class RegionInput {
private BigDecimal eDostavkaAndEmoll = BigDecimal.ZERO;
private BigDecimal mail = BigDecimal.ZERO;
private BigDecimal bidOrder = BigDecimal.ZERO;
private BigDecimal bags = BigDecimal.ZERO;
private BigDecimal hours = BigDecimal.ZERO;
private BigDecimal cancelledOrder = BigDecimal.ZERO;
private BigDecimal cancelledMail = BigDecimal.ZERO;

public void replareOtherSymbols(String value) {
    value.replaceAll("\\D+", "");
}

private BigDecimal parseOrZero(String value) {
    replareOtherSymbols(value);
    if (value == null || value.isBlank()) {
        return BigDecimal.ZERO;
    }
    return new BigDecimal(value.trim());
}

public void parseToBigDecimal(String eDostavkaAndEmollString, String mailString,
                              String bidOrderString, String bagsString,
                              String hoursString, String cancelledOrderString,
                              String cancelledMailString) {
    this.eDostavkaAndEmoll = parseOrZero(eDostavkaAndEmollString);
    this.mail = parseOrZero(mailString);
    this.bidOrder = parseOrZero(bidOrderString);
    this.bags = parseOrZero(bagsString);
    this.hours = parseOrZero(hoursString);
    this.cancelledOrder = parseOrZero(cancelledOrderString);
    this.cancelledMail = parseOrZero(cancelledMailString);
}
}
