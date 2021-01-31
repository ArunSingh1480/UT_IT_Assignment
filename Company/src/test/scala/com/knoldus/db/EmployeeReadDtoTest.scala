package com.knoldus.db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class EmployeeReadDtoTest extends FunSuite(){

  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if Arun exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Arun") != None)
  }

  test("Should return true if Vinayak exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Vinayak") != None)
  }

  test("Should return false if Samar does not exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Samar") === None)
  }
}