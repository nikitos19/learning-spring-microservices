package com.organization.service.services.impl;

import com.organization.service.entities.Organization;
import com.organization.service.repositories.OrganizationRepository;
import com.organization.service.services.OrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Resource
    private OrganizationRepository organizationRepository;

    @Override
    public Organization getOrganizationById(Long orgId) {
        return organizationRepository.getOrganizationById(orgId);
    }
}
