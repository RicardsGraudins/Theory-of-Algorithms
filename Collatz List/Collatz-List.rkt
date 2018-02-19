;Collatz-List: input a positive integer and return the list of the collatz conjecture of the integer.
#lang racket
;Empty list to hold the numbers
(define nums(list))

;Collatz calculation
(define (collatz num)
  (if (even? num) ;Check if num is even
      (/ num 2) ;If it divide by 2
      (+ 1 (* num 3)))) ;If num is not even its odd, multiply by 3 and add 1

;Recursion
(define (collatz-list num)
  (if (= num 1) ;If num = 1 stop executing
      (display "Completed!\n")
      (begin ;Execute in sequence
        (cons nums(list num)) ;Add num to nums list
        (collatz-list (collatz num))))) ;Recursion

(collatz-list 10) ;Calcuate the collatz conjecture of 10
nums ;Print out the nums list