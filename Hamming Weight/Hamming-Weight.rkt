#lang racket
;takes in a list and returns the number of non zero elements
(define (hamming-weight l)
  ;using filter positive to get rid of all the numbers that aren't positive i.e. zeros
  (apply +(filter positive? l))) ;then using apply to get the sum of the remaining numbers in the list

;expected result: 5
(hamming-weight (list 1 0 1 0 1 1 1 0))

;expected result: 0
(hamming-weight (list 0 0 0 0 0))