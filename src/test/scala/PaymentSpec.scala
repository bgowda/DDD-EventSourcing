import domain.Payment
import java.util.UUID
import org.scalatest.{Matchers, FlatSpec}


class PaymentSpec extends FlatSpec with Matchers{


  "Payment" should "transfer amount from one account to another"{
    val pay = Payment.create(20, "test transfer", 3435345435, 4345345345)
    pay.transfer

    pay.status?

  }
}
