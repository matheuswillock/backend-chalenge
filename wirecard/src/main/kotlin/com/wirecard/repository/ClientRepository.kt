package com.wirecard.repository

import com.wirecard.model.Client
import io.micronaut.data.repository.CrudRepository

interface ClientRepository: CrudRepository<Client, Long> {
}