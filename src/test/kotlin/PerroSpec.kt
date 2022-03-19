import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PerroSpec : DescribeSpec({
    describe("Tests de perro") {
        it("Cuando ladra el perro se escucha") {
            val perro = Perro()
            perro.ladrar() shouldBe "Guau!"
        }
    }
})