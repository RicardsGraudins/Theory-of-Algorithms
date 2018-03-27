## Hamming Distance
Write a function hamming-distance in Racket that takes two lists and returns the number of positions in which they differ.  
For example:  

:arrow_right: (hamming-distance (list 1 0 1 0 1 1 1 0) (list 1 1 1 1 0 0 0 0))  
5

## What is Hamming distance:
The Hamming distance is named after [Richard Hamming](https://en.wikipedia.org/wiki/Richard_Hamming), who introduced the concept in his fundamental paper on Hamming codes *Error detecting and error correcting codes* in 1950. In information theory, the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different. In other words, it measures the minimum number of substitutions required to change one string into the other, or the minimum number of errors that could have transformed one string into the other. In a more general context, the Hamming distance is one of several string metrics for measuring the edit distance between two sequences.

## Solution:
```scheme
(define(hamming-distance list1 list2)
  (if (null? list1)
      0
      (if (null? list2)
      0
      (if (= (car list1)(car list2))
             (hamming-distance (cdr list1)(cdr list2))
             (+ 1 (hamming-distance (cdr list1)(cdr list2)))))))
```

## References:
* [Hamming Distance](https://en.wikipedia.org/wiki/Hamming_distance)
