package com.vestlane.backend_demo

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class DbMigration(
  val repository: BookRepository,
  val authorRepo: AuthorRepo
) {

  @PostConstruct
  fun init() {
    val author1 = Author("John", "Doe", LocalDate.of(1999, 9, 3), "DE")
    val author2 = Author("Jane", "Dae", LocalDate.of(1995, 12, 22), "IT")
    val author3 = Author("John", "Doe", LocalDate.of(1970, 3, 11), "XY")
    authorRepo.saveAll(
      listOf(author1, author2, author3)
    )

    val book1 = Book("Some Title", 112, "Fishy Press", "XYZ-12345", listOf(author2))
    val book2 = Book("Another Title", 112, "Fishy Press", "XYZ-12345", listOf(author1, author3))
    val book3 = Book("Pragmatic Degenerative AI", 112, "Nonsense Pieces", "XYZ-12345", listOf(author2, author3))
    val book4 = Book("Weird Novel", 112, "Awful Publishing", "XYZ-12345", listOf(author1, author1))
    val book5 = Book("Absurd Story", 112, "Fishy Press", "XYZ-12345", emptyList())
    repository.saveAll(
      listOf(book1, book2, book3, book4, book5)
    )

    println("Stored Authors: ${authorRepo.findAll()}")
    println("Stored Books: ${repository.findAll()}")


  }


}