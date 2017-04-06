package com.tvella

class Course {

String title

String code

String leader

String department

String description

String studyMode

static hasMany = [students: Student]

    static constraints = {

title blank:false, nullable:false

code unique:true, blank:false, nullable:false

leader blank:false, nullable:false

department blank:false, nullable:false

studyMode blank:false, nullable:false

    }
}
