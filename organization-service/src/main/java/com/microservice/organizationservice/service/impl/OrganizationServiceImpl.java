package com.microservice.organizationservice.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.organizationservice.dto.OrganizationDto;
import com.microservice.organizationservice.entity.Organization;
import com.microservice.organizationservice.mapper.OrganizationMapper;
import com.microservice.organizationservice.repository.OrganizationRepository;
import com.microservice.organizationservice.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {
@Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
