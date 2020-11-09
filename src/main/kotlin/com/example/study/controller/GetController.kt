package com.example.study.controller

import com.example.study.model.SearchParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GetController {
    @RequestMapping(method = [RequestMethod.GET], path = ["/getMethod"])
    fun getRequest() : String{
        return "Hi, Spring!"
    }

    @GetMapping("/getParameter")
    fun getParameter(@RequestParam id : String, @RequestParam password : String) : String{
        println("id : $id")
        println("password : $password")

        return id + password
    }

    @GetMapping("/getMultiParameter")
    fun getMultiParameter(searchParam: SearchParam) : SearchParam{
        println(searchParam.account)
        println(searchParam.email)
        println(searchParam.page)

        return searchParam
    }


}