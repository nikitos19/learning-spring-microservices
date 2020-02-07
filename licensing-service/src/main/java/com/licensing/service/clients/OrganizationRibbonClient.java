package com.licensing.service.clients;

import com.licensing.service.clients.entities.Organization;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

//@Component
public class OrganizationRibbonClient {

//    @Resource see in application class
//    private RestTemplate restTemplate;

//    public Organization getOrganization(Long organizationId) {
//        return restTemplate
//                .exchange("http://organizationservice/organization/{orgId}",
//                        HttpMethod.GET, null, Organization.class, organizationId)
//                .getBody();
//    }
}
