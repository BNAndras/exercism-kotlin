include(
    "practice:accumulate",
    "practice:acronym",
    "practice:all-your-base",
    "practice:affine-cipher",
    "practice:allergies",
    "practice:anagram",
    "practice:armstrong-numbers",
    "practice:atbash-cipher",
    "practice:bank-account",
    "practice:beer-song",
    "practice:binary",
    "practice:binary-search",
    "practice:binary-search-tree",
    "practice:bob",
    "practice:bowling",
    "practice:change",
    "practice:circular-buffer",
    "practice:clock",
    "practice:collatz-conjecture",
    "practice:complex-numbers",
    "practice:crypto-square",
    "practice:custom-set",
    "practice:darts",
    "practice:diamond",
    "practice:difference-of-squares",
    "practice:diffie-hellman",
    "practice:dnd-character",
    "practice:dominoes",
    "practice:eliuds-eggs",
    "practice:etl",
    "practice:flatten-array",
    "practice:forth",
    "practice:gigasecond",
    "practice:grade-school",
    "practice:grains",
    "practice:hamming",
    "practice:hello-world",
    "practice:hexadecimal",
    "practice:isbn-verifier",
    "practice:isogram",
    "practice:kindergarten-garden",
    "practice:knapsack",
    "practice:largest-series-product",
    "practice:leap",
    "practice:linked-list",
    "practice:list-ops",
    "practice:luhn",
    "practice:matching-brackets",
    "practice:matrix",
    "practice:meetup",
    "practice:minesweeper",
    "practice:nth-prime",
    "practice:nucleotide-count",
    "practice:pangram",
    "practice:pascals-triangle",
    "practice:perfect-numbers",
    "practice:phone-number",
    "practice:pig-latin",
    "practice:prime-factors",
    "practice:protein-translation",
    "practice:rail-fence-cipher",
    "practice:raindrops",
    "practice:react",
    "practice:resistor-color",
    "practice:resistor-color-duo",
    "practice:resistor-color-trio",
    "practice:reverse-string",
    "practice:rna-transcription",
    "practice:robot-name",
    "practice:robot-simulator",
    "practice:roman-numerals",
    "practice:rotational-cipher",
    "practice:run-length-encoding",
    "practice:saddle-points",
    "practice:say",
    "practice:scale-generator",
    "practice:scrabble-score",
    "practice:secret-handshake",
    "practice:series",
    "practice:sieve",
    "practice:simple-cipher",
    "practice:space-age",
    "practice:spiral-matrix",
    "practice:strain",
    "practice:sublist",
    "practice:sum-of-multiples",
    "practice:transpose",
    "practice:triangle",
    "practice:two-fer",
    "practice:word-count",
    "practice:wordy",
    "practice:yacht",
    "practice:zebra-puzzle",
)

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
            }
        }
    }
}
