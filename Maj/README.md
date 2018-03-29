## Maj
Write a function maj in Racket that takes three lists x, y and z of equal length and containing only 0's and 1's. It should return a list containing a 1 where two or more of x, y and z contain 1's, and 0 otherwise.

For example:  

:arrow_right: (maj (list 0 0 0 0 1 1 1 1) (list 0 0 1 1 0 0 1 1) (list 0 1 0 1 0 1 0 1)  
`'(0 0 0 1 0 1 1 1)`

## Majority Function (Maj):
Majority function (sometimes quorum function) is a threshold function that produces a 1 if and only if the majority of the inputs are 1. Otherwise, the output is 0. This function is only defined for three or more odd inputs. The majority function can be found in various applications such as adders, subtractors, hash functions, and Muller C-element.

## Lambda Function
A lambda expression creates a function. In the simplest case, a lambda expression has the form:

``` scheme
(lambda (arg-id ...)
body...+)
```

A lambda form with n arg-ids accepts n arguments:  

``` scheme
> ((lambda (x) x)
   1)
1

> ((lambda (x y) (+ x y))
   1 2)
3
```

## Solution:
``` scheme
(define (maj x y z)
  (and(equal? (length x)(length y))(equal? (length x)(length z)))
      (map (lambda (x y z)
             (if (> (+ x y z) 1) 1 0)) x y z))
```

## References:
* [Lambda](https://docs.racket-lang.org/guide/lambda.html)
* [Majority Function](https://en.wikichip.org/wiki/boolean_algebra/majority_function)
