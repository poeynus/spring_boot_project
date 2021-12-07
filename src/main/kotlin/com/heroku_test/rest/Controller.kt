package com.heroku_test.rest

import org.springframework.web.bind.annotation.*
import javax.annotation.PostConstruct

@RestController
class Controller {
    @GetMapping("/")
    fun index() = "Main"

    private val userMap: MutableMap<String, Entity> = mutableMapOf()

    @PostConstruct
    fun init(){
        userMap["1"] = Entity("1", "테스트11", "111-1111", "대구")
        userMap["2"] = Entity("2", "테스트22", "222-2222", "영주")
        userMap["3"] = Entity("3", "테스트33", "333-3333", "서울")
        userMap["4"] = Entity("4", "테스트44", "444-4444", "기숙사")
    }

    @GetMapping("/user/{id}")
    fun getUserInfo(@PathVariable("id") id:String) = userMap[id]

    @GetMapping("/user/all")
    fun getUserInfoAll() = ArrayList<Entity>(userMap.values)

    @PutMapping("/user/{id}")
    fun putUserInfo(@PathVariable("id") id:String, @RequestParam("name") name: String, @RequestParam("phone") phone: String, @RequestParam("address") address:String) {
        val userInfo = Entity(id, name, phone, address)
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