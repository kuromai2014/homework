package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var FullTicket = scanner.nextInt()
    print("How many round-trip tickets:")
    var SingleTicket = scanner.nextInt()
    val Ti = Ticket(FullTicket,SingleTicket)
    Ti.print()
}

class Ticket(var FullTicket:Int,var SingleTicket:Int){
    fun print(){
        println("Total tickets:" + FullTicket + "\n" + "Round-trip tickets:" + SingleTicket +
                "\n" + "Total:" + ((FullTicket-SingleTicket)*1000+SingleTicket*1800))
    }
}