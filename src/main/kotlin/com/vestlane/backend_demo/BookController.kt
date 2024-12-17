package com.vestlane.backend_demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val bookService: BookService,
                     val authorService: AuthorService) {

  @GetMapping("/book")
  fun getAllBooks(): List<Book> {
    return bookService.findAll()
  }

  @GetMapping("/short-books")
  fun getShortBooks(): List<Book> {
    return bookService.getBooks()
  }

  @GetMapping("/authors")
  fun getAuthors(): List<Author> {
    return authorService.findAuthorWithNationalities("DE")
  }

}