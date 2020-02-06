package com.licensing.service.controllers;

import com.licensing.service.models.License;
import com.licensing.service.services.LicenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/organizations/{orgId}/licenses")
public class LicenseServiceController {

    @Resource
    private LicenseService licenseService;

    @GetMapping
    public Iterable<License> getLicenses(@PathVariable(name = "orgId") Long organizationId) {
        return licenseService.getAllLicensesByOrg(organizationId);
    }

    @GetMapping(value = "/{licenseId}")
    public License getLicense(@PathVariable(name = "orgId") Long organizationId, @PathVariable Long licenseId) {
        return licenseService.getLicense(organizationId, licenseId);
    }

    @PostMapping(value = "/add-license")
    public void createLicense(@PathVariable(name = "orgId") Long organizationId, @RequestParam String productName) {
        licenseService.saveLicense(organizationId, productName);
    }
}
