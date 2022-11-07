package com.example.kolejka

class kolejka (lst:MutableList<Any>){

    val vars: MutableList<Any> = mutableListOf()

    fun isEmpty():Boolean = vars.isEmpty()

    fun count():Int = vars.count()

    override  fun toString() = vars.toString()

    fun enqueue(element:Any){
        vars.add(element)
    }
    fun first(): Any? {
        if(vars.isEmpty()==true){
            return null
        }
        else{return vars[0]}

    }

    fun dequeue():Any?{
        if (this.isEmpty()){
            return null
        } else {
            return vars.removeAt(0)
        }
    }

    fun peek() : Any? = vars.lastOrNull()

}
