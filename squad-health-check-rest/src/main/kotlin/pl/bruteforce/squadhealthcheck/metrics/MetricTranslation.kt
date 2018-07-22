package pl.bruteforce.squadhealthcheck.metrics

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("Squad health metric translation")
data class MetricTranslation(@ApiModelProperty("Metric translation identifier") val translationId: Long,
                             @ApiModelProperty("Language of translations") val lang: String,
                             @ApiModelProperty("Translation of metric name") val name: String,
                             @ApiModelProperty("Translation of metric green light description") val greenDescription: String,
                             @ApiModelProperty("Translation of metric red light description") val redDescription: String
)