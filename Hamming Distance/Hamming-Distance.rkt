#lang racket
;takes in 2 lists and returns the number of positions in which they differ
(define(hamming-distance list1 list2)
  (if (null? list1) ;if list1 is null
      0 ;output 0
      (if (null? list2) ;if list2 is null
      0 ;output 0
      (if (= (car list1)(car list2)) ;otherwise check if the elements of list1 and list2 are equal
             (hamming-distance (cdr list1)(cdr list2)) ;if equal call hamming-distance
             (+ 1 (hamming-distance (cdr list1)(cdr list2))))))) ;otherwise increment distance

;create lists
(define list1(list 1 0 1 0 1 1 1 0))
(define list2(list 1 1 1 1 0 0 0 0))

;expected result: 5
(hamming-distance list1 list2)