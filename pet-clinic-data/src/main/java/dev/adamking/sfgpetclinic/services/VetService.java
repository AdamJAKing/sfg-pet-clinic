package dev.adamking.sfgpetclinic.services;

import dev.adamking.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
