package com.vestlane.backend_demo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document
data class Book(
  val title: String,

  val pages: Int,

  val editor: String,

  val isbn: String,

  @DocumentReference(lazy = true)
  val authors: List<Author>
) {
  @Id
  var id: String? = null
}