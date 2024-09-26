package collections

//it takes a lambda function and returns a map of key value pairs
//key is the lambda result and values are the list of values for which this lambda function is returned


fun main(){

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

    println(cities.groupBy { it.country })
    println(cities.groupBy(keySelector = {it.country}, valueTransform = {it.name})) //uses groupByTo internally
//    cities.groupByTo(destination = {}, keySelector = {it.country}, valueTransform = {it.name})
}
