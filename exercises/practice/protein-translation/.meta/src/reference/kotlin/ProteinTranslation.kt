object ProteinTranslation {
    fun proteins(input: String): List<String> {
        val results = mutableListOf<String>()

        input.chunked(3).forEach {
            if (!codonToProtein.containsKey(it)) {
                throw IllegalArgumentException()
            }
            val protein = codonToProtein.getValue(it)
            protein == "STOP" && return results
            results.add(protein)
        }

        return results
    }

    private val codonToProtein = mapOf(
            "AUG" to "Methionine",
            "UUU" to "Phenylalanine",
            "UUC" to "Phenylalanine",
            "UUA" to "Leucine",
            "UUG" to "Leucine",
            "UCU" to "Serine",
            "UCC" to "Serine",
            "UCA" to "Serine",
            "UCG" to "Serine",
            "UAU" to "Tyrosine",
            "UAC" to "Tyrosine",
            "UGU" to "Cysteine",
            "UGC" to "Cysteine",
            "UGG" to "Tryptophan",
            "UAA" to "STOP",
            "UAG" to "STOP",
            "UGA" to "STOP"
    )
}
