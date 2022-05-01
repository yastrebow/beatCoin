package ru.yastrebov.beatcoin.service.cryptocurrency;

import ru.yastrebov.beatcoin.model.Cryptocurrency;

public interface CryptocurrencyService {

    void getRate();

    Cryptocurrency createCryptocurrency(Cryptocurrency cryptocurrency);

    String getLastCryptocurrency(String lastName, String firstName);

    Double rateComparsion(Cryptocurrency oldCryptocurrency, Double newRate);

}
