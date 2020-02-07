package com.licensing.service.services.impl;

import com.licensing.service.clients.OrganizationDiscoveryClient;
import com.licensing.service.clients.entities.Organization;
import com.licensing.service.dtos.LicenseData;
import com.licensing.service.entities.License;
import com.licensing.service.repositories.LicenseRepository;
import com.licensing.service.services.LicenseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LicenseServiceImpl implements LicenseService {

    @Resource
    private LicenseRepository licenseRepository;
    @Resource
    private OrganizationDiscoveryClient organizationDiscoveryClient;

    @Override
    public LicenseData getLicense(Long orgId, Long licenseId) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(orgId, licenseId);
        Organization organization = organizationDiscoveryClient.getOrganization(orgId);

        return getLicenseData(license, organization);
    }

    @Override
    public List<LicenseData> getAllLicensesByOrg(Long orgId) {
        Organization organization = organizationDiscoveryClient.getOrganization(orgId);
        List<License> licenses = licenseRepository.findByOrganizationId(orgId);

        return licenses.stream()
                .map(license -> getLicenseData(license, organization))
                .collect(Collectors.toList());
    }

    @Override
    public void saveLicense(Long orgId, String productName) {
        License license = new License();
        license.setOrganizationId(orgId);
        license.setProductName(productName);
        licenseRepository.save(license);
    }

    //further will be used converters/populators
    private LicenseData getLicenseData(License license, Organization organization) {
        LicenseData licenseData = new LicenseData();
        licenseData.setLicenseId(license.getLicenseId());
        licenseData.setProductName(license.getProductName());
        licenseData.setOrganizationId(organization.getId());
        licenseData.setOrganizationName(organization.getName());
        return licenseData;
    }
}
