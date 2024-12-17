package com.vestlane.backend_demo

import org.springframework.stereotype.Service

@Service
class AuthorService(
  val repo: AuthorRepo
) {

  fun findAuthorWithNationalities(vararg nationalities: String): List<Author> {
    val result = mutableListOf<Author>()
    for (n in nationalities) {
      result += repo.findAuthorByNationality(n)
    }
    return result
  }

}