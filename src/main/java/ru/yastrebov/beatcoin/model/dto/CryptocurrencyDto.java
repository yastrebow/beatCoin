package ru.yastrebov.beatcoin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CryptocurrencyDto {

    private String symbol;

    private Double current_price;
    
}
