package com.example.study.controller

import com.example.study.model.SearchParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PostController {

    @PostMapping(value =  ["/postMethod"])
    fun postMethod(@RequestBody searchParam: SearchParam) : SearchParam {
        return searchParam
    }
}