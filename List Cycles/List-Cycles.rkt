#lang racket
;takes in a list as input and returns the list cyclically shifted one place to the left
(define (lcycle l)
     (if (null? l) ;if the list is null
      '() ;output null
      (append (cdr l) (list (car l))))) ;otherwise append first element to the list

;takes in a list as input and returns the list cyclically shifted one place to the right
(define (rcycle l)
      (if (null? l) ;if the list is null
      '() ;output null
      (append (cons (last l)(remove-last l))))) ;otherwise call remove-last to remove last element and append the list

;takes in a list and removes the last element
(define (remove-last l)
  (if (null? (cdr l)) ;if list contains only 1 element
        '() ;output null
        (cons (car l) (remove-last (cdr l))))) ;otherwise remove last element

;(1 2 3 4 5) -> (2 3 4 5 1)
(lcycle(list 1 2 3 4 5))

;(1 2 3 4 5) -> (1 2 3 4)
(remove-last(list 1 2 3 4 5))

;(1 2 3 4 5) -> (5 1 2 3 4)
(rcycle(list 1 2 3 4 5))