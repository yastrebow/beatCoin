package ru.yastrebov.beatcoin.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yastrebov.beatcoin.service.cryptocurrency.CryptocurrencyService;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BeatCoinController {

    private final CryptocurrencyService cryptocurrencyService;

    @GetMapping
    void getRate() {
        cryptocurrencyService.getRate();
    }
}
