#lang racket
;takes in three integer lists and returns a list containing a 1 where the number of 1's in a
;given position in x, y, z contains an odd number of 1's, and 0 otherwise.
(define (sod2 x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z))) ;check if the 3 lists are the same size
      (map (lambda (x y z) ;map through the 3 lists
             (if (equal? 0 (modulo (+ x y z) 2)) 0 1)) x y z)) ;sum up x, y and z, check if the sum modulus 2 is equal to 0
                                                               ;if equal to 0 its even, add 0 to the list otherwise add 1

;create lists
(define x(list 0 0 0 0 1 1 1 1))
(define y(list 0 0 1 1 0 0 1 1))
(define z(list 0 1 0 1 0 1 0 1))

;'(0 1 1 0 1 0 0 1)
(sod2 x y z)