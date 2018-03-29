#lang racket
;takes in three integer lists and returns a list containing a 1 where two or more
;of the lists contain 1's, and 0 otherwise.
(define (maj x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z))) ;check if the 3 lists are the same size
      (map (lambda (x y z) ;map through the 3 lists
             (if (> (+ x y z) 1) 1 0)) x y z)) ;if the sum is greater than 1, add 1 to the list otherwise add 0

;create lists
(define x(list 0 0 0 0 1 1 1 1))
(define y(list 0 0 1 1 0 0 1 1))
(define z(list 0 1 0 1 0 1 0 1))

;'(0 0 0 1 0 1 1 1)
(maj x y z)