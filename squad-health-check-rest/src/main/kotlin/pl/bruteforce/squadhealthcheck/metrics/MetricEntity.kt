package pl.bruteforce.squadhealthcheck.metrics

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "metrics")
data class MetricEntity(val metricId: Long)