;Collatz-List: input a positive integer and return the list of the collatz conjecture of the integer.
#lang racket

;Collatz calculation
(define (collatz num)
  (if (even? num) ;Check if num is even
      (/ num 2) ;If it is divide by 2
      (+ 1 (* num 3)))) ;If num is not even its odd, multiply by 3 and add 1

;Recursion
(define (collatz-list num)
  (cons num (if (= (- num 1) 0) ;Add to list
                empty ;If num - 1 = 0 add "empty" to list
                (collatz-list(collatz num))))) ;Otherwise do the Collatz calculation

;Testing
(collatz-list 2) ;Calcuate the collatz conjecture of 2 = '(2 1)
(collatz-list 5) ;Calcuate the collatz conjecture of 5 = '(5 16 8 4 2 1)
(collatz-list 9) ;Calcuate the collatz conjecture of 9 = '(9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1)
(collatz-list 10) ;Calcuate the collatz conjecture of 10 = '(10 5 16 8 4 2 1)