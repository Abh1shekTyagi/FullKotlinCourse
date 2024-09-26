package collections
//we can use comparable
fun main(){

    val numbers = listOf(166,22,3,24,5,36)
    println(numbers.sorted())

    val cities = listOf(
        City("New York", "USA"),
        City("Los Angeles", "USA"),
        City("Chicago", "USA"),
        City("Houston", "USA"),
        City("Phoenix", "USA"),

        City("Tokyo", "Japan"),
        City("Osaka", "Japan"),
        City("Kyoto", "Japan"),
        City("Nagoya", "Japan"),
        City("Sapporo", "Japan"),

        City("London", "UK"),
        City("Manchester", "UK"),
        City("Birmingham", "UK"),
        City("Liverpool", "UK"),
        City("Glasgow", "UK"),

        City("Paris", "France"),
        City("Marseille", "France"),
        City("Lyon", "France"),
        City("Nice", "France"),
        City("Toulouse", "France"),

        City("Berlin", "Germany"),
        City("Munich", "Germany"),
        City("Frankfurt", "Germany"),
        City("Hamburg", "Germany"),
        City("Cologne", "Germany"),

        City("Sydney", "Australia"),
        City("Melbourne", "Australia"),
        City("Brisbane", "Australia"),
        City("Perth", "Australia"),
        City("Adelaide", "Australia"),

        City("Toronto", "Canada"),
        City("Vancouver", "Canada"),
        City("Montreal", "Canada"),
        City("Calgary", "Canada"),
        City("Ottawa", "Canada"),

        City("Beijing", "China"),
        City("Shanghai", "China"),
        City("Shenzhen", "China"),
        City("Guangzhou", "China"),
        City("Chengdu", "China"),

        City("Mumbai", "India"),
        City("Delhi", "India"),
        City("Bangalore", "India"),
        City("Hyderabad", "India"),
        City("Chennai", "India"),

        City("Moscow", "Russia"),
        City("Saint Petersburg", "Russia"),
        City("Novosibirsk", "Russia"),
        City("Yekaterinburg", "Russia"),
        City("Kazan", "Russia")
    )

    cities.sorted().forEach { println(it.name) }//it doesn't have sorted method so,
    //Comparable
    // we have to implement comparable interface in City class
    // this will always sort by the value defined in compareTo method which is not very flexible

    //Comparator
    //so we can create more comparable properties for the class by extending Comparator and overriding compare method
    cities.sortedWith(comparator = CompareByCountry()).forEach { println(it.country) }
    //we can also shorten it by using sortedWith inbuilt compareBy and thenBy methods
    //time complexity is O(nlogn) for compareBy and O(nlogn) for thenBy(smaller multiple lists) in total it is the same, also since it is called with comparator
    cities.sortedWith(compareBy<City> {it.country}.thenBy { it.name }).forEach { println( "country =${it.country}, name = ${it.name}") }
    //we can also use specific property using sortedBy method no need to extend comparable, comparator interfaces
    cities.sortedBy { it.name }
}

data class City(val name: String, val country: String): Comparable<City>{
    override fun compareTo(other: City): Int {
        return when{
            this.name > other.name -> {
                1
            }
            this.name < other.name -> {
                -1
            }
            else -> 0
        }
    }

}

class CompareByCountry: Comparator<City>{
    override fun compare(o1: City, o2: City): Int {
        return if(o1.country > o2.country) 1
        else if(o1.country < o2.country) -1
        else 0
    }

}