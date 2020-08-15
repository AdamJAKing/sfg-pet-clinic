package dev.adamking.sfgpetclinic.services.map;

import dev.adamking.sfgpetclinic.model.Owner;
import dev.adamking.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
