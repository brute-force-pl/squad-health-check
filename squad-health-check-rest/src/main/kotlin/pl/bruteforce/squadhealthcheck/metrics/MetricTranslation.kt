package pl.bruteforce.squadhealthcheck.metrics

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("Squad health metric translation")
data class MetricTranslation(@ApiModelProperty("Metric translation identifier", example = "1") val translationId: Long,
                             @ApiModelProperty("Language of translations", example = "en") val lang: String,
                             @ApiModelProperty("Translation of metric name", example = "Delivering value") val name: String,
                             @ApiModelProperty("Translation of metric green light description", example = "We deliver great stuff! We're proud of it and our stakeholders are really happy.") val greenDescription: String,
                             @ApiModelProperty("Translation of metric red light description", example = "We deliver crap. We feel ashamed to deliver it. Our stakeholders hate us.") val redDescription: String
)