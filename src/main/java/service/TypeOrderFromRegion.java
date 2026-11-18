package service;

import java.math.BigDecimal;

public enum TypeOrderFromRegion {
    EDOSTAVKA_AND_EMOLL("5.00"),
    MAIL("2.50"),
    BIG_ORDER("10.00"),
    BAGS("0.50"),
    HOURS("2.20"),
    CANCELLED_ORDER("3.50"),
    CANCELLED_MAIL("1.50");

private final BigDecimal rate;

TypeOrderFromRegion(String rate) {
    this.rate = new BigDecimal(rate);
}

public BigDecimal getRate() {
    return rate;
}
}