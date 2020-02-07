package com.licensing.service.clients;

import com.licensing.service.clients.entities.Organization;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("organizationservice")
public interface OrganizationFeignClient {

    @GetMapping(value = "/organizations/{orgId}", consumes = "application/json")
    Organization getOrganization(@PathVariable(name = "orgId") Long organizationId);
}
