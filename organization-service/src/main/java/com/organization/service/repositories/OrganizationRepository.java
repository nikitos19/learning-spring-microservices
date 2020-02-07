package com.organization.service.repositories;

import com.organization.service.entities.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {
    Organization getOrganizationById(Long orgId);
}
