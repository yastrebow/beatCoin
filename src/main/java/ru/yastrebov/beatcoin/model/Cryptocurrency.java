package ru.yastrebov.beatcoin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import ru.yastrebov.beatcoin.model.enums.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cryptocurrency")
public class Cryptocurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_short_name", nullable = false, length = 100)
    @Enumerated(EnumType.STRING)
    private Currency currencyShortName;

    @Column(name = "current_rate")
    private Double currentRate;

    @Column(name = "snapshot", nullable = false)
    @CreationTimestamp
    private LocalDateTime snapshot;

    @Column(name = "rate_change")
    private Double rateChange;
}
