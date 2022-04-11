import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LetterValuesSumSpec extends AnyFlatSpec {
  behavior of "LetterValuesSum.letterSum"
  it should "return 0 for empty string" in {
    LetterValueSum.letterSum("") shouldBe 0
  }

  it should "return 1 for a" in {
    LetterValueSum.letterSum("a") shouldBe 1
  }

  it should "return 26 for z" in {
    LetterValueSum.letterSum("z") shouldBe 26
  }

  it should "return 6 for cab" in {
    LetterValueSum.letterSum("cab") shouldBe 6
  }

  it should "return 100 for excellent" in {
    LetterValueSum.letterSum("excellent") shouldBe 100
  }

  it should "return 317 for microspectrophotometries" in {
    LetterValueSum.letterSum("microspectrophotometries") shouldBe 317
  }
}
