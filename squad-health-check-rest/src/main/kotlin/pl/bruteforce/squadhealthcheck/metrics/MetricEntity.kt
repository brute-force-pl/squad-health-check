package pl.bruteforce.squadhealthcheck.metrics

import javax.persistence.*

@Entity
@Table(name = "metrics")
data class MetricEntity(@Id @Column(name = "metric_id", nullable = false) @GeneratedValue(strategy = GenerationType.AUTO) val metricId: Long,
                        @OneToMany(mappedBy = "metric_id", cascade = [(CascadeType.ALL)], fetch = FetchType.EAGER) val translations: List<MetricTranslationEntity>) {

    fun asMetric(): Metric {
        return Metric(metricId = metricId,
                translations = translations.map { it.asMetricTranslation() }
        )
    }

    fun update(metric: Metric) {
        translations.forEach {it.update(metric.translations.find { translation -> it.translationId == translation.translationId })}
    }
}