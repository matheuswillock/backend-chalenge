package com.wirecard.model

import org.hibernate.Hibernate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "buyer")
data class Buyer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val name: String,
    val email: String,
    var cpf: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Buyer

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , email = $email , cpf = $cpf )"
    }
}