package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
    private BigDecimal value;
    private String currency;

    Money(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    BigDecimal getValue() {
        return this.value;
    }

    String getCurrency() {
        return this.currency;
    }
}