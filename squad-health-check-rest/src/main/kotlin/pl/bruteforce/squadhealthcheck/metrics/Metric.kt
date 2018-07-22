package pl.bruteforce.squadhealthcheck.metrics

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("Squad health metric")
data class Metric(@ApiModelProperty("Identifier of metric", example = "1") val metricId: Long,
                  @ApiModelProperty("Translations of metric") val translations: List<MetricTranslation>)