#lang racket
;takes in a list and returns a list of sublists of it that sum to 0
(define (sublsum l)
  ;using combinations which returns the powerset of a list
  ;using cdr since the first element of the list is null and filter for sublists that are true (sum to 0)
  (filter sum (cdr (combinations l))))

;takes in a list and calculates the sum of elements
(define (sum l)
  (if (null? l) ;if the list is null
      '() ;output null
      (equal? (apply + l) 0)));otherwise calculate the sum of the list using apply and then check if its equal to 0

;create lists
(define list1(list 1 2 3 4 -5))
(define list2(list 1 2 3 4 5))

;'((2 3 -5) (1 4 -5))
(sublsum list1)

;'()
(sublsum list2)