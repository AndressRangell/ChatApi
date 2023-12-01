package com.andres.rangel.data

import com.andres.rangel.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessage(message: Message)

}