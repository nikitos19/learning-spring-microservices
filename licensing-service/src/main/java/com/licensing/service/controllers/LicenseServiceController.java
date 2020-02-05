package com.licensing.service.controllers;

import com.licensing.service.models.License;
import com.licensing.service.services.LicenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/organizations/{orgId}/licenses")
public class LicenseServiceController {

    @Resource
    private LicenseService licenseService;

    @GetMapping
    public Iterable<License> getLicenses(@PathVariable(name = "orgId") String organizationId) {
        return licenseService.getAllLicenses();
    }

    @GetMapping(value = "/{licenseId}")
    public License getLicense(@PathVariable(name = "orgId") String organizationId, @PathVariable Long licenseId) {
        return licenseService.getLicenseById(licenseId);
    }
}
