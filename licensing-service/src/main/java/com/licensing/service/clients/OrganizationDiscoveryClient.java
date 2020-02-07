package com.licensing.service.clients;

import com.licensing.service.clients.entities.Organization;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Component
public class OrganizationDiscoveryClient {

    @Resource
    private DiscoveryClient discoveryClient;

    public Organization getOrganization(Long organizationId) {
        List<ServiceInstance> instances = discoveryClient.getInstances("organizationservice");
        if (CollectionUtils.isEmpty(instances)) {
            return null;
        }
        String serviceUrl = instances.get(0).getUri().toString() + "/organizations/" + organizationId;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate
                .exchange(serviceUrl, HttpMethod.GET, null, Organization.class, organizationId)
                .getBody();
    }
}
