package ru.yastrebov.beatcoin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yastrebov.beatcoin.model.enums.CurrencyName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscription")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "currency_short_name", nullable = false, length = 100)
    @Enumerated(EnumType.STRING)
    private CurrencyName currencyShortName;

    @Column(name = "max_rate_change", nullable = false)
    private Double maxRateChange;

    @Column(name = "min_rate_change", nullable = false)
    private Double minRateChange;
}
