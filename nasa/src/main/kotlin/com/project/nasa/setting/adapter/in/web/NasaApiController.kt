package com.project.nasa.setting.adapter.`in`.web

import com.project.nasa.setting.adapter.out.persistence.member.service.ApodService
import com.project.nasa.setting.application.port.`in`.ApiUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.RequestApod
import com.project.nasa.setting.application.port.`in`.dto.response.ResponseApod
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.context.annotation.Description
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.time.LocalDate

@Tag(name = "NASA Api 컨트롤러", description = "https://api.nasa.gov 에서 데이터 받기 컨트롤러")
@RequestMapping("api/v1/nasa")
@RestController
class NasaApiController(
    val apiUseCase: ApiUseCase,
    val apodService: ApodService
) {
    @Operation(summary = "APOD 받기" , description = "APOD = Astronomy Picture of the Day")
    @Description("API로부터 APOD를 받고 DB에 저장한다")
    @GetMapping("/apod")
    fun getAndjoinApi(@RequestParam("date") date : LocalDate): ResponseEntity<ResponseApod> {
        var apod : ResponseApod? = apodService.getByDate(date)
        if(apod == null){
            apod = apiUseCase.getApod("https://api.nasa.gov/planetary/apod", date)
            apodService.join(apod)
        }
        return ResponseEntity.ok(apod)
    }
}