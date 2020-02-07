package com.organization.service.controllers;

import com.organization.service.entities.Organization;
import com.organization.service.services.OrganizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/organizations")
public class OrganizationController {

    @Resource
    private OrganizationService organizationService;

    @GetMapping(value = "/{orgId}")
    public Organization getOrganization(@PathVariable(name = "orgId") Long organizationId) {
        return organizationService.getOrganizationById(organizationId);
    }
}
