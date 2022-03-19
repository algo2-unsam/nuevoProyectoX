import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PerroSpec : DescribeSpec({
    describe("Tests de perro") {
        it("Ladrido del perro grande") {
            val perroGrande = Perro()
            perroGrande.ladrar() shouldBe "Guau!!!!!!"
        }
        it("Ladrido del perro chico") {
            val perroChico = Perro(grande = false)
            perroChico.ladrar() shouldBe "Wuf!"
        }
    }
})