package com.github.programmingwithmati.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankBalance {

    private Long id;
    private BigDecimal amount = BigDecimal.ZERO;
    private Date lastUpdate;
    private BankTransaction latestTransaction;

    public BankBalance process(BankTransaction bankTransaction) {
        // TODO Implement code here
        return this;
    }
}
