package dev.adamking.sfgpetclinic.services.map;

import dev.adamking.sfgpetclinic.model.Owner;
import dev.adamking.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
