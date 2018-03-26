## Hamming Weight
Write a function hamming-weight in Racket that takes a list l as input and returns the number of non-zero elements in it.  
For example:

:arrow_right: (hamming-weight (list 1 0 1 0 1 1 1 0))  
5

## What is Hamming Weight:
The Hamming weight is named after [Richard Hamming](https://en.wikipedia.org/wiki/Richard_Hamming). The Hamming weight of binary numbers was already used in 1899 by [James W. L. Glaisher](https://en.wikipedia.org/wiki/James_Whitbread_Lee_Glaisher) to give a formula for the number of odd binomial coefficients in a single row of [Pascal's triangle](https://en.wikipedia.org/wiki/Pascal%27s_triangle). In it's simplicity, the Hamming weight of a string is the number of symbols that are different from the zero-symbol of the alphabet used.

## Solution:
``` scheme
(define (hamming-weight l)
  (apply +(filter positive? l)))
```

## References:
* [Hamming Weight](https://en.wikipedia.org/wiki/Hamming_weight)
