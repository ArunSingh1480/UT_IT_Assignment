package com.knoldus.db
import org.scalatest.FunSuite
class UserReadDtoTest  extends FunSuite {
  val userReadDtoObject = new UserReadDto()

  test("Should return true if Arun exist"){
    assert(userReadDtoObject.getUserByName("Arun") != None)
  }

  test("Should return true if Vinayak exist"){
    assert(userReadDtoObject.getUserByName("Vinayak") != None)
  }

  test("Should return false if Sam does not exist"){
    assert(userReadDtoObject.getUserByName("Sam") === None)
  }
}
