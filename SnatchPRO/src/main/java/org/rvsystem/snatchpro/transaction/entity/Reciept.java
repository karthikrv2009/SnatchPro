package org.rvsystem.snatchpro.transaction.entity;

import java.math.BigInteger;

import org.rvsystem.snatchpro.bankinfo.entity.BankInfo;
import org.rvsystem.snatchpro.vendor.entity.Vendor;

public class Reciept {
 private long id;
 private BankInfo bankInfo;
 private BigInteger amountPaid;
 private BigInteger totalAmount;
 private String bankTransactionInfo;
 private Vendor vendor;
}
