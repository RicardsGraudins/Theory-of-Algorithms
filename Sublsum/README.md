## Sublsum
Write a function sublsum in Racket that takes a list (of integers) as input and returns a list of sublists of it that sum to zero. For this problem, you can use the combinations built-in function. Note the order of the sublists and their elements doesn't matter. 

For example: 

:arrow_right: (sublsum (list 1 2 3 4 -5))  
`'((2 3 -5) (-5 1 4))`  

:arrow_right: (sublsum (list 1 2 3 4 5))  
`'()`

## Combinations Function:
Returns a list of all combinations of elements in the input list (aka the powerset of lst). If size is given, limit results to combinations of size elements.

For example: 

:arrow_right: (combinations '(1 2 3))  
`'(() (1) (2) (1 2) (3) (1 3) (2 3) (1 2 3))`

:arrow_right: (combinations '(1 2 3) 2)  
`'((1 2) (1 3) (2 3))`

## Solution:
```scheme
(define (sublsum l)
  (filter sum (cdr (combinations l))))

(define (sum l)
  (if (null? l)
      '()
      (equal? (apply + l) 0)))
```
## References:
* [Combinations](https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._combinations%29%29)
* [Java Powerset](https://stackoverflow.com/questions/4640034/calculating-all-of-the-subsets-of-a-set-of-numbers)
* [Powerset](https://en.wikipedia.org/wiki/Power_set)
