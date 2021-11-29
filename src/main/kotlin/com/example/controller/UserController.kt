package com.example.controller

import com.example.entity.User
import org.springframework.web.bind.annotation.*
import javax.annotation.PostConstruct

@RestController
class UserController {
    private val userMap: MutableMap<String, User> = mutableMapOf()

    @PostConstruct
    fun init(){
        userMap["1"] = User("1", "테스트1", "111-1111", "대구")
        userMap["2"] = User("2", "테스트2", "222-2222", "영주")
        userMap["3"] = User("3", "테스트3", "333-3333", "서울")
    }

    @GetMapping("/user/{id}")
    fun getUserInfo(@PathVariable("id") id:String) = userMap[id]

    @GetMapping("/user/all")
    fun getUserInfoAll() = ArrayList<User>(userMap.values)

    @PutMapping("/user/{id}")
    fun putUserInfo(@PathVariable("id") id:String, @RequestParam("name") name: String, @RequestParam("phone") phone: String, @RequestParam("address") address:String) {
        val userInfo = User(id, name, phone, address)
        userMap[id] = userInfo
    }
    @PostMapping("/user/{id}")
    fun postUserInfo(@PathVariable("id") id: String, @RequestParam("name") name: String, @RequestParam("phone") phone: String, @RequestParam("address") address: String) {

        val userInfo = userMap[id]
        userInfo?.name = name
        userInfo?.phone = phone
        userInfo?.address = address
    }

    @DeleteMapping("/user/{id}")
    fun deleteUserInfo(@PathVariable("id") id: String) = userMap.remove(id)

}