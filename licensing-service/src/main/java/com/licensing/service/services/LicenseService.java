package com.licensing.service.services;

import com.licensing.service.models.License;

import java.util.List;

public interface LicenseService {
    License getLicense(Long orgId, Long licenseId);

    List<License> getAllLicensesByOrg(Long orgId);

    void saveLicense(Long orgId, String productName);
}
