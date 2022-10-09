package com.example.day5assignment

fun main() {
    val todo= todo()
    val task1= task("ruba","buy a car",false,1)
    val task2= task("sara","travel to newyork",false,2)
    val task3= task("Mohammed","sell my car",false,3)
    todo.addtask(task1)
    todo.addtask(task2)
    todo.addtask(task3)
    todo.remove(task2)
    todo.show(task3)
todo.change(task1)
    todo.change(task3)
    for(task in todo.tasks){
        println("nameis: ${task.name},note: ${task.note},iscompleted: ${task.iscomplete},id: ${task.id}")
    }
}
data class task(var name :String, var note :String, var iscomplete :Boolean, var id :Int)

class todo {
    val tasks= arrayListOf<task>()
    fun addtask(task: task)
    {
        tasks.add(task)
    }
    fun show(task: task) {
        for (task in todo.tasks) {
            when (task) {
                1 -> println("nameis: ${task.name},note: ${task.note},iscompleted: ${task.iscomplete},id: ${task.id}")
                2 -> println("nameis: ${task.name},note: ${task.note},iscompleted: ${task.iscomplete},id: ${task.id}")
                3 -> println("nameis: ${task.name},note: ${task.note},iscompleted: ${task.iscomplete},id: ${task.id}")
            }
        }
    }
    fun remove(task: task)
    {
        tasks.remove(task)
    }
    fun change(task: task)
    {
        for (task in todo.tasks) {
            if (task.iscomplete==false)
                task.iscomplete== ture
        }
    }
}

