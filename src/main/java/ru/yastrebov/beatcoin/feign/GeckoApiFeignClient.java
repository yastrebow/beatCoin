package ru.yastrebov.beatcoin.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.yastrebov.beatcoin.model.dto.CryptocurrencyDto;

import java.util.List;

@FeignClient(value = "Gecko", url = "https://api.coingecko.com/api/v3")
public interface GeckoApiFeignClient {

    @GetMapping(value = "/coins/markets")
    List<CryptocurrencyDto> getRate(@RequestParam(name = "vs_currency") String vsCurrency);

}
