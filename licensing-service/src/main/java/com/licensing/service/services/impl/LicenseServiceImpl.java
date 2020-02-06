package com.licensing.service.services.impl;

import com.licensing.service.models.License;
import com.licensing.service.repositories.LicenseRepository;
import com.licensing.service.services.LicenseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LicenseServiceImpl implements LicenseService {

    @Resource
    private LicenseRepository licenseRepository;

    @Override
    public License getLicense(Long orgId, Long licenseId) {
        return licenseRepository.findByOrganizationIdAndLicenseId(orgId, licenseId);
    }

    @Override
    public List<License> getAllLicensesByOrg(Long orgId) {
        return licenseRepository.findByOrganizationId(orgId);
    }

    @Override
    public void saveLicense(Long orgId, String productName) {
        License license = new License();
        license.setOrganizationId(orgId);
        license.setProductName(productName);
        licenseRepository.save(license);
    }
}
