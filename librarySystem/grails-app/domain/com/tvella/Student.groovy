package com.tvella

class Student {

String name

String email

String username

String password

int studentID

Course course

static hasMany=[bookReviews: BookReview, books: Book]

    static constraints = {

name blank:false, nullable:false

email blank:false, nullable:false

username unique:true, blank:false, nullable:false

password password:true, blank:false, nullable:false

studentID unique:true, blank:false, nullable:false

course blank:false, nullable:false

    }
}
