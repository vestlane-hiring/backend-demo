package com.vestlane.backend_demo

import org.springframework.stereotype.Service

@Service
class BookService(
  val repository: BookRepository
) {


  fun findAll(): List<Book> {
    return repository.findAll()
  }


  fun getBooks(): List<Book> {
    return findAll().filter { it.pages <= 100 }
  }



}