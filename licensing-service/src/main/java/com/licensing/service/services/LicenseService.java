package com.licensing.service.services;

import com.licensing.service.dtos.LicenseData;

import java.util.List;

public interface LicenseService {
    LicenseData getLicense(Long orgId, Long licenseId);

    List<LicenseData> getAllLicensesByOrg(Long orgId);

    void saveLicense(Long orgId, String productName);
}
