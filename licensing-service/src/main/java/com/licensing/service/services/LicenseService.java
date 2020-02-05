package com.licensing.service.services;

import com.licensing.service.models.License;

public interface LicenseService {
    License getLicenseById(Long id);

    Iterable<License> getAllLicenses();
}
