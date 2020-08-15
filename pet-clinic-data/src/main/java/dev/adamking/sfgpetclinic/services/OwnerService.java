package dev.adamking.sfgpetclinic.services;

import dev.adamking.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
