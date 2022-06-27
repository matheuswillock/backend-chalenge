package com.wirecard.model

import org.hibernate.Hibernate
import javax.persistence.*

@Entity(name = "payment")
data class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var amount: Double,
    var typePay: TypePay,
    @ManyToOne
    var card: Card

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Payment

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , amount = $amount , typePay = $typePay , card = $card )"
    }
}