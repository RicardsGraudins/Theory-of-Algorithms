## List-Cycles
Write, from scratch, two functions in Racket. The first is called lcycle. It takes a list as input and returns the list cyclically shifted one place to the left. The second is called rcycle, and it shifts the list cyclically shifted one place to the right.  
  
  For example:  
  
  :arrow_right: (lcycle (list 1 2 3 4 5))  
  `(2 3 4 5 1)`
  
  :arrow_right: (rcycle (list 1 2 3 4 5))  
  `(5 1 2 3 4)`
  
## Solution:
 ```scheme
(define (lcycle l)
     (if (null? l)
      '()
      (append (cdr l) (list (car l)))))

(define (rcycle l)
      (if (null? l)
      '()
      (append (cons (last l)(remove-last l)))))

(define (remove-last l)
  (if (null? (cdr l))
        '()
        (cons (car l) (remove-last (cdr l)))))
 ```
 
## References
* [Pairs and Lists](https://docs.racket-lang.org/reference/pairs.html)
* [Lcycle](https://stackoverflow.com/questions/13046017/rotate-a-list-to-the-left-in-scheme-racket)
* [Removing last element from a list](https://stackoverflow.com/questions/5006750/removing-last-element-of-a-listscheme)
