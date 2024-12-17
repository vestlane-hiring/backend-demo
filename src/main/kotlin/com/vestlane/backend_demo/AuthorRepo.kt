package com.vestlane.backend_demo

import org.springframework.data.mongodb.repository.MongoRepository

interface AuthorRepo : MongoRepository<Author, String> {

  fun findAuthorByNationality(nationality: String): List<Author>

}