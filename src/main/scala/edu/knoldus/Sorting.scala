package edu.knoldus

class Sorting {

//  def insertionSort(array: Array[Int]): Array[Int] = {
//    array
//  }
//
//  def selectionSort(array: Array[Int]): Array[Int] = {
//    array
//  }

  def bubbleSort(array: Array[Int]): Array[Int] = {

    def swap(array:Array[Int], smaller:Int, greater:Int): Array[Int] ={
      val temp:Int = array(smaller)
      array(smaller) = array(greater)
      array(greater) = temp
      array
    }

    def bubble(array: Array[Int], size:Int): Array[Int] = {
      for(iterate <- 0 until size-1) {
        if(array(iterate) > array(iterate + 1)){
          swap(array, iterate, iterate + 1)
        }
        bubble(array, size-1)
      }
      array
    }

    bubble(array, array.length)
    array
  }

}
