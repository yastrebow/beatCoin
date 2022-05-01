package ru.yastrebov.beatcoin.service.cryptocurrency.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.yastrebov.beatcoin.dto.CryptocurrencyDto;
import ru.yastrebov.beatcoin.feign.GeckoApiFeignClient;
import ru.yastrebov.beatcoin.model.Cryptocurrency;
import ru.yastrebov.beatcoin.model.enums.CurrencyName;
import ru.yastrebov.beatcoin.repository.CryptocurrencyRepository;
import ru.yastrebov.beatcoin.service.cryptocurrency.CryptocurrencyService;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class CryptocurrencyServiceImpl implements CryptocurrencyService {

    private final GeckoApiFeignClient geckoApiFeignClient;
    private final CryptocurrencyRepository cryptocurrencyRepository;

    @Override
    public void getRate() {
        CryptocurrencyDto cryptocurrencyDto = geckoApiFeignClient.getRate("bitcoin", "usd");

        String[] splittedCurrencyName = cryptocurrencyDto
                .getBitcoin()
                .getClass()
                .getName().split("\\.");
        String currencyName = splittedCurrencyName[splittedCurrencyName.length - 1].toUpperCase();

        Cryptocurrency cryptocurrency = Cryptocurrency.builder()
                .currencyShortName(CurrencyName.valueOf(currencyName))
                .currentRate(cryptocurrencyDto
                        .getBitcoin()
                        .getUsd())
                .snapshot(LocalDateTime.now())
                .build();

        log.info("The rate is: {}", cryptocurrency);

        Cryptocurrency savedCryptocurrency = cryptocurrencyRepository.save(cryptocurrency);

        log.info("Saved savedCryptocurrency: {}", savedCryptocurrency);
    }

    @Override
    public Cryptocurrency createCryptocurrency(Cryptocurrency cryptocurrency) {
        return null;
    }

    @Override
    public String getLastCryptocurrency(String lastName, String firstName) {
        return null;
    }

    @Override
    public Double rateComprising(Cryptocurrency oldCryptocurrency, Double newRate) {
        return null;
    }
}
