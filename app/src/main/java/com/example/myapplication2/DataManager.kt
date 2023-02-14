package com.example.myapplication2

class DataManager() {
    var Courses: HashMap<String, CourseInfo> = HashMap<String, CourseInfo>()

    init {
        SeedData()
    }

    fun SeedData() {
        val courses = arrayOf(
            CourseInfo("a9gf","Tværfagligt, 4. sem."),
            CourseInfo("ab54","Procesvejledning"),
            CourseInfo("64db","Produktvejledning"),
            CourseInfo("64vu","ERFA Vejledning"),
        )
        for(course in courses)
            Courses[course.courseId] = course
    }
}