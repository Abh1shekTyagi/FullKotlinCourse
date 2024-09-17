fun main(){

    //basic loops
    for(i in 1..10){
        print(i)
    }

    //loop with until
    for(i in 1 until 10){
        print(" $i")
    }

    //loop with operator //same as until
    for(i in 1..<10){
        print(i)
    }

    //down to
    for(i in 100 downTo 1){
        print(" $i")
    }

    // step
    for(i in 100 downTo 1 step 2){
        print(i)
    }


    //---------------------------------- when we do not know the number of times loops should run ----
    // while(SomeCondition){ code }
    var number = 0
    while (number < 10){
        number++
        if(number == 6) continue // this will skip below code and check the condition again
        if(number == 10) break //this will terminate the loop
        print(number)
    }


    //when we want to run something at least once
    do{
        print(number)
    }while (number < 12)


    //nested loops
    var count = 0
    while(number <20){
        number++
        while(count <5){
            count ++
            if(count ==4) break //will break the inner loop
        }
    }

    //while loop with label
    outerLoop@ while (number < 26){
        number ++
        while (count < 5){
            count ++
            if(count == 4) break@outerLoop //will break the outer loop
            continue@outerLoop
        }
    }
    //Note that we can not target the inner loop with outer loop once opposite
}