package com.licensing.service.services.impl;

import com.licensing.service.models.License;
import com.licensing.service.repositories.LicenseRepository;
import com.licensing.service.services.LicenseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LicenseServiceImpl implements LicenseService {

    @Resource
    private LicenseRepository licenseRepository;

    @Override
    public License getLicenseById(Long id) {
        return licenseRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Iterable<License> getAllLicenses() {
        return licenseRepository.findAll();
    }
}
