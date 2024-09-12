package com.rsdz.finance.services;

import com.rsdz.finance.dao.CCTransactionDao;
import com.rsdz.finance.entity.AmexTransaction;
import com.rsdz.finance.entity.CCTransaction;
import com.rsdz.finance.helpers.CSVHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVServiceImpl implements CSVService {
    CCTransactionDao ccTransactionDao;

    @Autowired
    public CSVServiceImpl(CCTransactionDao ccTransactionDao) {
        this.ccTransactionDao = ccTransactionDao;
    }

    public void upload(MultipartFile file) {
        try {
            List<? extends CCTransaction> transactions = CSVHelper.csvToTransactions(file.getInputStream());
            ccTransactionDao.saveAll(transactions);
        } catch (IOException e) {
            throw new RuntimeException("Failed to store CSV Data. " + e.getMessage());
        }
    }
}
