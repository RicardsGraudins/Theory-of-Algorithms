;Decide-Prime: check if a number is a prime number by passing in a positive integer
;Adapted from https://stackoverflow.com/questions/3345626/finding-a-prime-number-in-scheme-using-natural-recursion
#lang racket
;Decide-Prime is the name of the function where num is the passed in integer
;Returns true(#t) if num is prime number and false(#f) if num is not a prime number 
(define (Decide-Prime num)
  ;Define function non-divisible-by
  (define (non-divisible-by n d)
    (cond
      ;If d = 1 return true
      ((= d 1) #t)
      ;Else if remainder = 0 return false
      (else (if(= (remainder n d) 0)
               #f
               (non-divisible-by n (- d 1))))))
  ;If num is equal to 1 pass - num 1 into the non-divisible-by function
  (if (= num 1)
      #t
      (non-divisible-by num(- num 1))))

;Testing for prime numbers
(Decide-Prime 2) ;#t - divisible by 1 and itself
(Decide-Prime 4) ;#f - divisible by 1,itself and 2
(Decide-Prime 5) ;#t - divisible by 1 and itself
(Decide-Prime 6) ;#f - divisible by 1,itself, 2 and 3