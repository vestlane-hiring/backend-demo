package com.vestlane.backend_demo

import org.springframework.data.mongodb.repository.MongoRepository

interface BookRepository: MongoRepository<Book, String> {

  fun findByEditor(editor: String): List<Book>

  fun findByIsbn(editor: String): Book

}