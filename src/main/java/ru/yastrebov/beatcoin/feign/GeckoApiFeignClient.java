package ru.yastrebov.beatcoin.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.yastrebov.beatcoin.dto.CryptocurrencyDto;

@FeignClient(value = "Gecko", url = "https://api.coingecko.com/api/v3")
public interface GeckoApiFeignClient {

    @GetMapping(value = "/simple/price")
    CryptocurrencyDto getRate(@RequestParam(name = "ids") String ids,
                              @RequestParam(name = "vs_currencies") String vsCurrency);

}
