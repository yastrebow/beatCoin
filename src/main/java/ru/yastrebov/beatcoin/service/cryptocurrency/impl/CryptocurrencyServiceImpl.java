package ru.yastrebov.beatcoin.service.cryptocurrency.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.yastrebov.beatcoin.feign.GeckoApiFeignClient;
import ru.yastrebov.beatcoin.model.Cryptocurrency;
import ru.yastrebov.beatcoin.model.dto.CryptocurrencyDto;
import ru.yastrebov.beatcoin.service.cryptocurrency.CryptocurrencyService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CryptocurrencyServiceImpl implements CryptocurrencyService {

    private final GeckoApiFeignClient geckoApiFeignClient;

    @Override
    public void getRate() {
        List<CryptocurrencyDto> usd = geckoApiFeignClient.getRate("usd");
        usd.forEach(System.out::println);

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
    public Double rateComparsion(Cryptocurrency oldCryptocurrency, Double newRate) {
        return null;
    }
}
