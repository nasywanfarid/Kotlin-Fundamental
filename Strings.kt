fun main(){
    val wordone = "Modern"
    val wordtwo = "Concise"
    val wordthree = "Pragmatic"
    val wordfour = "Safe"

    val kotlin ="""
        Kotlin is $wordone
        Kotlin is $wordtwo
        kotlin is $wordthree
        Kotlin is $wordfour
    """.trimMargin()
    print(kotlin)
}