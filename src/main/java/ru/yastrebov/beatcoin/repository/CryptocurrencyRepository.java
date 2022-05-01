package ru.yastrebov.beatcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yastrebov.beatcoin.model.Cryptocurrency;

public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long> {

}
