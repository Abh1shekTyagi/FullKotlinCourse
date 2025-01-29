package Generics

//covariance
class TeamOut<T: Player>(val name: String, private val players: MutableList<out T> ){
    fun addPlayer(player: T){
        if(players.contains(player)){
            println("The player is already added in the team. Player name ${(player as Player).name}")
        }else{
//            players.add(player) // we can not perform this here
            println("Player added to the team, player name ${(player as Player).name}")
        }
    }
}

//contravariance
//mutable list will take in all the superclasses objects here.
class TeamIn<T: Player> (val name: String, private val players: MutableList<in T> ){
    fun addPlayer(player: T){
        if(players.contains(player)){
            println("The player is already added in the team. Player name ${(player as Player).name}")
        }else{
            players.add(player) // we can perform this here
            println("Player added to the team, player name ${(player as Player).name}")
        }
    }
}