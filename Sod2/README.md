## Sod2
Write a function sod2 in Racket that takes three lists x, y and z of equal length and containing only 0's and 1's. It should return a list containing a 1 where the number of 1's in a given position in x, y and z contains an odd number of 1's, and 0 otherwise.

For example:  

:arrow_right: (sod2 (list 0 0 0 0 1 1 1 1) (list 0 0 1 1 0 0 1 1) (list 0 1 0 1 0 1 0 1))  
` '(0 1 1 0 1 0 0 1) `

## Solution:
``` scheme
(define (sod2 x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z)))
      (map (lambda (x y z)
             (if (equal? 0 (modulo (+ x y z) 2)) 0 1)) x y z))
```

## References:
* [Lambda](https://docs.racket-lang.org/guide/lambda.html)
* [Maj Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Maj)
* [Chse Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Chse)
