package com.vestlane.backend_demo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Author(
  val fName: String,
  val lName: String,
  val birthDate: LocalDate,
  val nationality: String
) {

  @Id
  var id: String? = null

}