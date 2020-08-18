package dev.adamking.sfgpetclinic.services.map;

import dev.adamking.sfgpetclinic.model.Vet;
import dev.adamking.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
