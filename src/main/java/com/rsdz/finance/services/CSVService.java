package com.rsdz.finance.services;

import org.springframework.web.multipart.MultipartFile;

public interface CSVService {

    public void upload(MultipartFile file);
}