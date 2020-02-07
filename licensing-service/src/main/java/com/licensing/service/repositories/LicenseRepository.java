package com.licensing.service.repositories;

import com.licensing.service.entities.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

    List<License> findByOrganizationId(Long organizationId);

    License findByOrganizationIdAndLicenseId(Long organizationId, Long licenseId);
}
