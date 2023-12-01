package com.andres.rangel.plugins

import com.andres.rangel.room.RoomController
import com.andres.rangel.routes.chatSocket
import com.andres.rangel.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
