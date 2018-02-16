## Collatz-List
 Write, from scratch, a function in Racket that takes a positive integer n0 as input and returns a list by recursively applying the following operation, starting with the input number. 
 
 
 End the recursion when (or if) the number becomes 1. Call the function collatz-list. So, collatz-list should return a list whose ﬁrst element is n0, the second element is n1, and so on. For example: 
 
:arrow_right: (collatz-list 5)  
 `'(5 16 8 4 2 1)`  
 
 :arrow_right: (collatz-list 9)  
 `'(9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1)`  
 
 :arrow_right: (collatz-list 2)  
 `'(2 1)`
 
 ## Collatz Conjecture:
 The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined as follows: start with any positive integer n. Then each term is obtained from the previous term as follows: if the previous term is even, the next term is one half the previous term. Otherwise, the next term is 3 times the previous term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.

The conjecture is named after [Lothar Collatz](https://en.wikipedia.org/wiki/Lothar_Collatz), who introduced the idea in 1937.
 
 ## References:
 * [Collatz Conjecture](https://en.wikipedia.org/wiki/Collatz_conjecture)
