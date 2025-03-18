package Generics

//Generic is only a compile time feature(to help the compiler and user) and, it does not make it to the run time.
//T stands for type parameter, it can be any character


//This Team<T> is essential for the generics to work, it is a signature.
//we can also restrict the generic type for an upper bound like this
// Team<T: Player>


//covariance <out T> -> meaning we can take subclasses of T
//contravariance <in T> -> meaning we can take superclasses of T

//we can define multiple upper bound to the generic class
//But only one class can be inherited another has to ba an interface,
//also we can define only one upper bound using where keywords
//same we can do in a function.

interface Nothing {

}

class MoreThan2<T>(val name: String, private val players: MutableList<T>) where T : Player, T : Nothing {

}

class Team<T : Player>(val name: String, private val players: MutableList<T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("The player is already added in the team. Player name ${(player as Player).name}")
        } else {
            players.add(player)
            println("Player added to the team, player name ${(player as Player).name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)

class CricketPlayer(name: String)

fun main() {
//    val footballPlayer = FootballPlayer("Football player 1")
//    val footballPlayer2 = FootballPlayer("Football player 2")
//
//    val baseballPlayer = BaseballPlayer("Baseball player 1")
//    val baseballPlayer2 = BaseballPlayer("Baseball player 2")
//
//    val footballTeam = Team("Football Team", mutableListOf(footballPlayer))
//    footballTeam.addPlayer(footballPlayer2)
////    footballTeam.addPlayer(baseballPlayer) //this will give error
//
//    val team = Team<Player>("Players", mutableListOf(footballPlayer))
//    team.addPlayer(baseballPlayer) //now this will work
//
//    //this will not work as we have restricted the team to be inherited from the player class
////    val cricketPlayer = Team<CricketPlayer>()

    printData("string")
    printData(1)
    printData(1.0)
}


fun <G> printData(data: G) {
    println(data)
}

class Gen<G>(val data: G) {
    fun typedData(): G {
        return data
    }
}