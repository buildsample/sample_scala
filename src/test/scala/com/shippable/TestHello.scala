package com.shippable

import org.scalatest.junit.JUnitSuite
import junit.framework.Assert._
import org.junit.Test

class TestStuff extends JUnitSuite {
 val calc = new HelloWorld

 @ Test def oneIsOne {
    assertEquals(2, calc square 1)
  }

  @ Test def twoIsTwo {
    assertEquals(5, calc multiple (2,3))
  }
}
