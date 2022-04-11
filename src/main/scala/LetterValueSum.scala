object LetterValueSum {
  def letterSum(letters: String): Int = {
    val lettersValues = (for (i <- 1 to 26) yield ((96 + i).toChar, i)).toMap
    letters.foldLeft(0)((sum, letter) => sum + lettersValues(letter))
  }
}
