package com.rsdz.finance.dao;

import com.rsdz.finance.entity.AmexTransaction;
import com.rsdz.finance.entity.CCTransaction;

import java.util.List;

public interface CCTransactionDao {

    public List<? extends CCTransaction> getAll();
    public CCTransaction save(CCTransaction transaction);

    public CCTransaction getByID(Integer id);

    public void saveAll(List<? extends CCTransaction> transactions);

    public void deleteAll();
}
