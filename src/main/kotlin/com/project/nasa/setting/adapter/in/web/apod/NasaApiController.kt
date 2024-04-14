package com.project.nasa.setting.adapter.`in`.web.apod

import com.project.nasa.setting.adapter.`in`.web.apod.dto.RequestLike
import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail
import com.project.nasa.setting.adapter.out.persistence.service.apod.ApodAdapter
import com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod
import com.project.nasa.setting.adapter.out.persistence.service.like.LikeAdapter
import com.project.nasa.setting.application.port.out.usecase.apod.ApodPort
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.context.annotation.Description
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@Tag(name = "NASA Api 컨트롤러", description = "https://api.nasa.gov 에서 데이터 받기 컨트롤러")
@RequestMapping("api/v1/nasa")
@RestController
class NasaApiController(
    private val apodPort: ApodPort,
    private val apodAdapter: ApodAdapter,
    private val likeAdapter : LikeAdapter
) {
    @Operation(summary = "APOD 받기" , description = "APOD = Astronomy Picture of the Day")
    @Description("API로부터 APOD를 받고 DB에 저장한다")
    @GetMapping("/apod")
    fun getAndJoinApi(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date : LocalDate): ResponseEntity<EntityModel<ResponseApod>> {
        var apod : ResponseApod? = apodAdapter.getByDate(date)
        if(apod == null){
            apod = apodAdapter.join(apodPort.convertApod("https://api.nasa.gov/planetary/apod",date))
        }
        val resource = EntityModel.of(apod)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NasaApiController::class.java).getAndJoinApi(date))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
    @Operation(summary = "APOD 별점 올리기", description = "APOD 별점 올리기")
    @Description("해당 APOD의 StarPoint를 1 올려준다")
    @PutMapping("/apod/addPoint")
    fun updateStarPoint(@RequestBody requestLike: RequestLike) : ResponseEntity<EntityModel<Int>>{
        val resource = EntityModel.of(likeAdapter.incrementLike(requestLike))
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NasaApiController::class.java).updateStarPoint(requestLike))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
    @Operation(summary = "APOD 사진 메일 보내기", description = "APOD 사진을 이메일로 보내기")
    @Description("해당 APOD의 사진을 이메일로 보내준다")
    @PostMapping("/apod/sendImage")
    fun sendImage(@RequestParam("id") id : Long, @RequestBody email : String) : ResponseEntity<EntityModel<ResponseEmail>> {
        val resource = EntityModel.of(apodAdapter.sendImageToEmail(id,email))
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NasaApiController::class.java).sendImage(id,email))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}