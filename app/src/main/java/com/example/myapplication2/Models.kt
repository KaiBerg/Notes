package com.example.myapplication2

data class CourseInfo(val courseId: String, val Title: String) {
    public override fun toString(): String {
        return Title
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String) {
}