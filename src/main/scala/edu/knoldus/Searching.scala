package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    @scala.annotation.tailrec
    def bsearch(array: Array[Int], elem: Int, start: Int, end: Int): Boolean = {
      if (start > end) {
        false
      }
      else {
        val mid = start + (end - start + 1) / 2
        array match {
          case array: Array[Int] if array(mid) == elem => true
          case array: Array[Int] if array(mid) > elem => bsearch(array, elem, start, mid - 1)
          case array: Array[Int] if array(mid) < elem => bsearch(array, elem, mid + 1, end)
        }
      }
    }
    bsearch(array, elem, 0, array.length - 1)
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    @scala.annotation.tailrec
    def lsearch(array: Array[Int], elem: Int, left: Int): Boolean = {
      if (left == array.length - 1) {
        false
      }
      else {
        if (array(left) == elem) {
          true
        }
        else {
          lsearch(array, elem, left + 1)
        }
      }
    }
    lsearch(array, elem, 0)
  }

}
