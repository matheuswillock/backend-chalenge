package com.wirecard.service

import com.wirecard.repository.ClientRepository
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

@MicronautTest
class ClientUnitTest {

 @Inject
 lateinit var clientRepository: ClientRepository

 @Test
 fun test() {
   val client = clientRepository.findById(1)
   assertNotNull(client)
 }


}