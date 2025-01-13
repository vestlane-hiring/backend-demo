# Backend Engineering - Tech Task

This is a small task for the Backend Engineer role.

This backend handles Books and Authors. 

For each of the following subtasks, 
please document your reasoning/choices in the SOLUTION.md file.


## Part 1 

Take a look at the existing code, you'll notice some things are off, 
- poor naming 
- absent packaging
- overly-inefficient data management
- ...
Fix as many of these as you can. 


## Part 2

Implement a Book Rental functionality, with the following business rules:

### Spec
Endpoint to rent a book:
- Ensure the book has available copies. 
- Set a dueDate (e.g., 7 days from the rental date).

Endpoint to return a book
- Mark the book as returned and increment availableCopies.
- Flag if the return is late.

Endpoint to list all books currently rented by a user.


# Part 3
Write some test, as you see fit (Integration/Unit). 