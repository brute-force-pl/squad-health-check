package pl.bruteforce.squadhealthcheck.metrics

import javax.persistence.*

@Entity
@Table(name = "metric_translations")
data class MetricTranslationEntity(@Id @Column(name = "translation_id", nullable = false) @GeneratedValue(strategy = GenerationType.AUTO) var translationId: Long,
                                   @Column(name = "lang", nullable = false) var lang: String,
                                   @Column(name = "name", nullable = false) var name: String,
                                   @Column(name = "green_description", nullable = false) var greenDescription: String,
                                   @Column(name = "red_description", nullable = false) var redDescription: String,
                                   @ManyToOne(fetch = FetchType.EAGER) @JoinColumn(name = "metric_id") var metric: MetricEntity
) {
    fun asMetricTranslation(): MetricTranslation {
        return MetricTranslation(translationId = translationId,
                lang = lang,
                name = name,
                greenDescription = greenDescription,
                redDescription = redDescription)
    }

    fun update(translation: MetricTranslation?) {
        name = translation?.name ?: name
        greenDescription = translation?.greenDescription ?: greenDescription
        redDescription = translation?.redDescription ?: redDescription
    }
}