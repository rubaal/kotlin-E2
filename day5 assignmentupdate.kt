package com.example.day5assignment

fun main() {
    val todo= todo()
    val task1= task("ruba","buy a car",false,1)
    val task2= task("sara","travel to newyork",false,2)
    val task3= task("Mohammed","sell my car",false,3)
    val Todo= todo()
    todo.addtask(task1,"buy a car")
    todo.addtask(task2,"travel to newyork")
    todo.addtask(task3,"sell my car")
    todo.show(task2,2)
    todo.remove(task2)
    todo.change(task3 , true)
    println("All Tasks:")
    todo.alltask(task1,"buy a car")
    todo.alltask(task3,"sell my car")
}
data class task(var name :String, var note :String, var iscomplete :Boolean, var id :Int)

class todo {
    val tasks= arrayListOf<task>()
    fun addtask(task: task,name: String)
    {
        tasks.add(task)
        println("Add Task: ${task.note}")
    }
    fun show(task: task,id:Int) {
        println("Task Details: ID (${task.id}), Name: (${task.name}), Task: (${task.note}),Completed: (${task.iscomplete})")
    }
    fun remove(task: task )
    {
        tasks.remove(task)
        println("Remove Task: ${task.note}")
    }
    fun change(task: task, iscomplete:Boolean)
    {
        task.iscomplete= iscomplete
        println("Task: ${task.note}, Complete: ${task.iscomplete}")
    }

    fun alltask(task: task,note: String)
    {
        tasks.add(task)
        println("Task: ${task.note}")
    }
}

