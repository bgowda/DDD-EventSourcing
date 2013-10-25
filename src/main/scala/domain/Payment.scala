package domain

import java.util.UUID


case class Payment(id:PaymentId,
                   amount:Double,
                   description:String,
                   fromAccount:Long,
                   toAccount:Long)

case class PaymentId(uuid:UUID)

object PaymentId {
  def generate: PaymentId = PaymentId(UUID.randomUUID())
 }

object Payment{

  def create(amount:Double, description:String, fromAccount:Long, toAccount:Long):Payment =
     Payment(PaymentId.generate, amount:Double, description:String, fromAccount:Long, toAccount:Long)

  def transfer    = {
     println(this)
  }

  //Basically, the K combinator is a function of two arguments, that merely returns the first argument.
  // The second argument is useful only for the side-effects it has on the first argument.
}
