package com.example.roomdbtutorial

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "first_name") val firstName:String?,
    @ColumnInfo(name = "last_Name") val lastName:String?,
    @ColumnInfo(name = "roll_no") val rollNumber:Int?

)
