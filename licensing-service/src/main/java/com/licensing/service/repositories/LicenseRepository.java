package com.licensing.service.repositories;

import com.licensing.service.models.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
}
