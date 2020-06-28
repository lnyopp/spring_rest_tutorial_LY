package com.win.rest;

class EmployeeNotFoundException extends RuntimeException {


  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}