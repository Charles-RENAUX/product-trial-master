package fr.alten.api.repository;

import fr.alten.api.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Integer> {
    static Optional<Account> findByEmail(String email);
}
