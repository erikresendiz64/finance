package com.rsdz.finance.services;

import com.rsdz.finance.entity.AmexTransaction;
import com.rsdz.finance.entity.CCTransaction;

import java.util.List;

public interface TransactionService {
    List<? extends CCTransaction> findAll();

    CCTransaction findById(Integer id);

    CCTransaction save(CCTransaction ccTransaction);
}
