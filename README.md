# Software Engineer (Backend) - taks

This codebase implements a REST API Backend based on Spring Boot. 

For each of the following tasks, please document your reasoning/choices in the SOLUTION.md file.


## Task 1 - Clean up

Take a look at the existing code, you'll notice some things are off:

* poor naming, not much is self-explaining
* no packaging of source files
* some querying so inefficient to become problematic

Fix as many of these as you can. 


## Task 2 - Implement new feature

We want to implement the concept of a Library that rents out books to users. 

We need to somehow track that a user can book up to a certain maximum of books simultaneously for a certain amount of time. For simplicity, let's assume 3 books simultaneously and 1 month, but would be nice to be able to plug in different numbers in the future (ex. maybe premium users will get more books for longer). 

When a book is not currently available, the user could reserve the book, getting added to a waitlist.

When the user currently holding the book returns it, the book gets assigned automatically to the first User in the waitlist.

Write some test for the solution. 


* You can assume the currently connected user is in a request parameter, not to have to implement jwt and the like. 
* Similarly, you can make further assumptions to avoid other boilerplate work, just document them. 
