package ru.yastrebov.beatcoin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yastrebov.beatcoin.dto.currency.Bitcoin;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CryptocurrencyDto {

    private Bitcoin bitcoin;

}
