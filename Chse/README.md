## Chse
Write a function chse in Racket that takes three lists x, y and z of equal length and containing only 0's and 1's. It should return a list containing the elements of y in the positions where x is 1 and the elements of z otherwise.

For example:  

:arrow_right:  (chse (list 0 0 0 0 1 1 1 1) (list 0 0 1 1 0 0 1 1) (list 0 1 0 1 0 1 0 1))  
`'(0 1 0 1 0 0 1 1)`

## Solution
``` scheme
(define (chse x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z)))
      (map (lambda (x y z)
           (if (= x 1) y z)) x y z))
```

## References
* [Lambda](https://docs.racket-lang.org/guide/lambda.html)
* [Maj Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Maj)
