#lang racket
;takes in three integer lists and returns a list containing the elements of y in the
;positions where x is 1 and the elements of z otherwise.
(define (chse x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z))) ;check if the 3 lists are the same size
      (map (lambda (x y z) ;map through the 3 lists
           (if (= x 1) y z)) x y z)) ;check if x = 1, if #t add y element to list otherwise add z element to list

;create lists
(define x(list 0 0 0 0 1 1 1 1))
(define y(list 0 0 1 1 0 0 1 1))
(define z(list 0 1 0 1 0 1 0 1))

;'(0 1 0 1 0 0 1 1)
(chse x y z)