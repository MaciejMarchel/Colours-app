import java.util.*

class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return colours
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours.first()
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.last()
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sortedBy { it }
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return colours.map { it.uppercase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter { colours -> colours.startsWith("$letter") }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length == size }
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter { it.length < size }
    }

    fun isColourInTheList(colour : String): Boolean {
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return colour.contains("Blue", ignoreCase = true)
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.
    // Seperates the list content onto now lines
    fun seperateLines() {
        colours.forEach {
            println(it)
        }
    }

    //Checks for colour names with more than the number passed as a parameter
    fun coloursWithMoreCharsThan(size: Int) : List<String>{
        return colours.filter { it.length > size }
    }

    //converts the list to lowercase
    fun coloursLowerCase(): List<String> {
       return colours.map { it.lowercase() }
    }
}


