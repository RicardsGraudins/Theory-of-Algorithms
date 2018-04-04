#lang racket
;takes in 2 integer lists and returns the distance given by the sum of the square
;residuals between the numbers in the lists i.e take the ith element of m from the
;ith element of l and square the result, then sum all of those results to get distance
(define (lstq l m)
  (apply + (map (lambda (l m)(square ( - m l))) l m))) ;map through both lists take 2 elements
                                                       ;substract m from l and square the result
                                                       ;using apply sum up all the results to get distance

;square the passed in number
(define (square x)
  (* x x))

;create lists
(define l(list 4.5 5.1 6.2 7.8))
(define m(list 1.1 -0.1 6.1 3.8))

;expected outcome 54.61
(lstq l m)