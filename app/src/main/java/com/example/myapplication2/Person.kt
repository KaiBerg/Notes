package com.example.myapplication2

class CourseInfo(val courseId: String, val Title: String) {
    public override fun toString(): String {
        return Title
    }
}

class NoteInfo(var Course: CourseInfo, var title: String, var text: String) {
}