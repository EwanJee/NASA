package com.project.nasa.setting.application.service

import com.project.nasa.setting.application.port.`in`.NewsUseCase
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class NewsApiService : NewsUseCase {
    fun getByQAndDate(q : String, date : LocalDate){

    }
}