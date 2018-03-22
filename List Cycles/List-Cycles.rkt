#lang racket
;takes in a list as input and returns the list cyclically shifted one place to the left
(define (lcycle l)
     (if (null? l) ;if the list is null
      '() ;output null
      (append (cdr l) (list (car l))))) ;otherwise append first element to the list

;(1 2 3 4 5) -> (2 3 4 5 1)
(lcycle(list 1 2 3 4 5))