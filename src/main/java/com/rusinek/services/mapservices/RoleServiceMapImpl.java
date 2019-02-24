package com.rusinek.services.mapservices;

import com.rusinek.domain.DomainObject;
import com.rusinek.domain.security.Role;
import com.rusinek.services.RoleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("map")
public class RoleServiceMapImpl extends AbstractMapService implements RoleService {


    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Role getById(Integer id) {
        return (Role) super.getById(id);
    }

    @Override
    public Role saveOrUpdate(Role domainObject) {
        return (Role) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}