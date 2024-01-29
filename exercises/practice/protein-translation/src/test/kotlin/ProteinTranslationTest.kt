import kotlin.test.assertEquals
import kotlin.test.Test

class ProteinTranslationTest {

    @Test
    fun testEmptyRNASequence() {
        val results = ProteinTranslation.proteins("")
        val expected = emptyList<String>()
        assertEquals(expected, results)
    }

    @Test
    fun testMethionineRNASequence() {
        val results = ProteinTranslation.proteins("AUG")
        val expected = listOf("Methionine")
        assertEquals(expected, results)
    }

    @Test
    fun testPhenylalanineRNASequence1() {
        val results = ProteinTranslation.proteins("UUU")
        val expected = listOf("Phenylalanine")
        assertEquals(expected, results)
    }

    @Test
    fun testPhenylalanineRNASequence2() {
        val results = ProteinTranslation.proteins("UUC")
        val expected = listOf("Phenylalanine")
        assertEquals(expected, results)
    }

    @Test
    fun testLeucineRNASequence1() {
        val results = ProteinTranslation.proteins("UUA")
        val expected = listOf("Leucine")
        assertEquals(expected, results)
    }

    @Test
    fun testLeucineRNASequence2() {
        val  results = ProteinTranslation.proteins("UUG")
        val expected = listOf("Leucine")
        assertEquals(expected, results)
    }

    @Test
    fun testSerineRNASequence1() {
        val results = ProteinTranslation.proteins("UCU")
        val expected = listOf("Serine")
        assertEquals(expected, results)
    }

    @Test
    fun testSerineRNASequence2() {
        val results = ProteinTranslation.proteins("UCC")
        val expected = listOf("Serine")
        assertEquals(expected, results)
    }

    @Test
    fun testSerineRNASequence3() {
        val results = ProteinTranslation.proteins("UCA")
        val expected = listOf("Serine")
        assertEquals(expected, results)
    }

    @Test
    fun testSerineRNASequence4() {
        val results = ProteinTranslation.proteins("UCG")
        val expected = listOf("Serine")
        assertEquals(expected, results)
    }

    @Test
    fun testTyrosineRNASequence1() {
        val results = ProteinTranslation.proteins("UAU")
        val expected = listOf("Tyrosine")
        assertEquals(expected, results)
    }

    @Test
    fun testTyrosineRNASequence2() {
        val results = ProteinTranslation.proteins("UAC")
        val expected = listOf("Tyrosine")
        assertEquals(expected, results)
    }

    @Test
    fun testCysteineRNASequence1() {
        val results = ProteinTranslation.proteins("UGU")
        val expected = listOf("Cysteine")
        assertEquals(expected, results)
    }

    @Test
    fun testCysteineRNASequence2() {
        val results = ProteinTranslation.proteins("UGC")
        val expected = listOf("Cysteine")
        assertEquals(expected, results)
    }

    @Test
    fun testTryptophanRNASequence() {
        val results = ProteinTranslation.proteins("UGG")
        val expected = listOf("Tryptophan")
        assertEquals(expected, results)
    }

    @Test
    fun testSTOPCodonRNASequence1() {
        val results = ProteinTranslation.proteins("UAA")
        val expected = emptyList<String>()
        assertEquals(expected, results)
    }

    @Test
    fun testSTOPCodonRNASequence2() {
        val results = ProteinTranslation.proteins("UAG")
        val expected = emptyList<String>()
        assertEquals(expected, results)
    }

    @Test
    fun testSTOPCodonRNASequence3() {
        val results = ProteinTranslation.proteins("UGA")
        val expected = emptyList<String>()
        assertEquals(expected, results)
    }

    @Test
    fun testSequenceOfTwoProteinCodons() {
        val results = ProteinTranslation.proteins("UUUUUU")
        val expected = listOf("Phenylalanine", "Phenylalanine")
        assertEquals(expected, results)
    }

    @Test
    fun testSequenceOfTwoDifferentProteinCodons() {
        val results = ProteinTranslation.proteins("UUAUUG")
        val expected = listOf("Leucine", "Leucine")
        assertEquals(expected, results)
    }

    @Test
    fun testTranslateRNAStrand() {
        val results = ProteinTranslation.proteins("AUGUUUUGG")
        val expected = listOf("Methionine", "Phenylalanine", "Tryptophan")
        assertEquals(expected, results)
    }

    @Test
    fun testTranslationStopsIfSTOPCodonIsAtBeginning() {
        val results = ProteinTranslation.proteins("UAGUGG")
        val expected = emptyList<String>()
        assertEquals(expected, results)
    }

    @Test
    fun testTranslationStopsIfSTOPCodonIsAtEndOfTwoCodons() {
        val results = ProteinTranslation.proteins("UGGUAG")
        val expected = listOf("Tryptophan")
        assertEquals(expected, results)
    }

    @Test
    fun testTranslationStopsIfSTOPCodonIsAtEndOfThreeCodons() {
        val results = ProteinTranslation.proteins("AUGUUUUAA")
        val expected = listOf("Methionine", "Phenylalanine")
        assertEquals(expected, results)
    }

    @Test
    fun testTranslationStopsIfSTOPCodonInMiddleOfThreeCodons() {
        val results = ProteinTranslation.proteins("UGGUAGUGG")
        val expected = listOf("Tryptophan")
        assertEquals(expected, results)
    }

    @Test
    fun testTranslationStopsIfSTOPCodonIsInMiddleOfSixCodons() {
        val results = ProteinTranslation.proteins("UGGUGUUAUUAAUGGUUU")
        val expected = listOf("Tryptophan", "Cysteine", "Tyrosine")
        assertEquals(expected, results)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testNonexistentCodon() {
        ProteinTranslation.proteins("AAA")
    }

    @Test(expected = IllegalArgumentException::class)
    fun testUnknownAminoAcid() {
        ProteinTranslation.proteins("XYZ")
    }
}
