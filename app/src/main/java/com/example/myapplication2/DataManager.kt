package com.example.myapplication2

object DataManager {
    var courses: HashMap<String, CourseInfo> = HashMap<String, CourseInfo>()
    lateinit var notes: ArrayList<NoteInfo>
    init {
        SeedData()
    }

    fun SeedData() {
        val courseData = arrayOf(
            CourseInfo("a9gf","Tværfagligt, 4. sem."),
            CourseInfo("ab54","Procesvejledning"),
            CourseInfo("64db","Produktvejledning"),
            CourseInfo("64vu","ERFA Vejledning"),
        )
        for(course in courseData)
            this.courses[course.courseId] = course

        notes = arrayListOf(
            NoteInfo(courseData[0],"plan", "learn Unity"),
            NoteInfo(courseData[0],"plan", "learn Unity"),
            NoteInfo(courseData[0],"plan", "learn Unity"),
            NoteInfo(courseData[0],"plan", "learn Unity"),

            NoteInfo(courseData[1],"plan", "learn Unity"),
            NoteInfo(courseData[1],"plan", "learn Unity"),
            NoteInfo(courseData[1],"plan", "learn Unity"),
            NoteInfo(courseData[1],"plan", "learn Unity"),

            NoteInfo(courseData[2],"plan", "learn Unity"),
            NoteInfo(courseData[2],"plan", "learn Unity"),
            NoteInfo(courseData[2],"plan", "learn Unity"),
            NoteInfo(courseData[2],"plan", "learn Unity"),

            NoteInfo(courseData[3],"plan", "learn Unity"),
            NoteInfo(courseData[3],"plan", "learn Unity"),
            NoteInfo(courseData[3],"plan", "learn Unity"),
            NoteInfo(courseData[3],"plan", "learn Unity"),
        )
    }
}