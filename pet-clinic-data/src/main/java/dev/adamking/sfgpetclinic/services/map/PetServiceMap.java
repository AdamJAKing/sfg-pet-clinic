package dev.adamking.sfgpetclinic.services.map;

import dev.adamking.sfgpetclinic.model.Pet;
import dev.adamking.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
