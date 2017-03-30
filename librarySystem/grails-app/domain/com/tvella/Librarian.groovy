package com.tvella

class Librarian {

String name

String email

String office

String username

String password

String telephone

String library

    static constraints = {

name blank:false, nullable:false

email blank:false, nullable:false, email:true

office blank:false, nullable:false

username unique:true, blank:false, nullable:false

password password:true, blank:false, nullable:false

telephone blank:false, nullable:false

library blank:false, nullable:false

    }
}
