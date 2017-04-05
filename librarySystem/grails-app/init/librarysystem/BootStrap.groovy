package librarysystem

class BootStrap {

    def init = { servletContext -> 

def Library1 = New Library (

building: 'Todd Library',
address: '1 Street Street, Sheffield',
openingHours: '9:00 - 18:00',
location: 'Todd Building',
studySpaces: '73'

).save()

def Library2 = New Library (

building: 'Matt Library',
address: '2 Street Street, Sheffield',
openingHours: '10:00 - 17:00',
location: 'Matt Building',
studySpaces: '35'

).save()

def Librarian1 = New Librarian (

name: 'Mandy',
email: 'Mandy@my.shu.ac.uk',
office: 'Office 1',
username: 'MandyV',
password: 'password',
telephone: '0121 123456',
library: Library1

).save()

def Librarian2 = New Librarian (

name: 'Kevin',
email: 'Kevin@my.shu.ac.uk',
office: 'Office 2',
username: 'KevinV',
password: 'password',
telephone: '0121 234567',
library: Library2

).save()

def Course1 = New Course (

title: 'Computing',
code: '01',
leader: 'Mark G',
department: 'ACES',
description: 'Just Computing',
studyMode: 'Full-Time'

).save()

def Course2 = New Course (

title: 'Computer Science',
code: '02',
leader: 'Sue W',
department: 'ACES',
description: 'Just Computer Science',
studyMode: 'Part-Time'

).save()

def Student1 = New Student (

name: 'Todd Vella',
email: 'b5022349@my.shu.ac.uk',
username: 'b5022349',
password: 'password',
studentID: '25022349',
course: Course1

).save()

def Student2 = New Student (

name: 'Matt Vella',
email: 'E5022348@my.shu.ac.uk',
username: 'b5022348',
password: 'password',
studentID: '55022348',
course: Course2

).save()

def Book1 = New Book ( 

title: 'A Song of Ice and Fire A Game of Thrones',
subject: 'Science',
author: 'George R R Martin',
isbn: 'A001',
dateBorrowed: New Date ('21/03/2017'),
returnDate: New Date ('21/06/2017'),
student: Student1,
overdue: false

).save()

def Book2 = New Book ( 

title: 'A Song of Ice and Fire A Clash of Kings',
subject: 'Science',
author: 'George R R Martin',
isbn: 'A002',
dateBorrowed: New Date ('24/02/2017'),
returnDate: New Date ('24/05/2017'),
student: Student2,
overdue: false

).save()

def BookReview1 = New BookReview (

book: Book1,
dateCreated: New Date ('01/02/2017'),
student: Student1,
review: 'Good book mate, read it'

).save()

def BookReview2 = New BookReview (

book: Book2,
dateCreated: New Date ('02/03/2017'),
student: Student2,
review: 'Not as good as the first one, still read it'

).save()

    }
    def destroy = {
    }
}
