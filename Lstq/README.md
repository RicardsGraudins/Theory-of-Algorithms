## Lstq
Write a function lstq in Racket that takes as arguments two lists l and m of equal length and containing numbers. It should return *d*, the distance given by the sum of the square residuals between the numbers in the lists:


<p align="center">
  <img width="315" height="101" src="https://github.com/RicardsGraudins/Theory-of-Algorithms/blob/master/Resources/Lstq_formula.PNG">
</p>

This means take the *ith* element of m from the *ith* element of l and square the result for all *i*. Then add all of those to get *d*.

For example:  

:arrow_right: (lstq (list 4.5 5.1 6.2 7.8) (list 1.1 -0.1 6.1 3.8))  
`54.61`

## Solution:
```scheme
(define (lstq l m)
  (apply + (map (lambda (l m)(square ( - m l))) l m)))

(define (square x)
  (* x x))
```

## References:
* [Lambda](https://docs.racket-lang.org/guide/lambda.html)
* [Maj Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Maj)
* [Chse Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Chse)
* [Sod2 Exercise](https://github.com/RicardsGraudins/Theory-of-Algorithms/tree/master/Sod2)
