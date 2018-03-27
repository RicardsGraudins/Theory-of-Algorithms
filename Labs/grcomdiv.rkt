#lang racket
;takes in two integers and returns their greatest common divisor
(define (grcomdiv a b)
  (if < a b)
   (grcomdiv b a)
   (if (= b 0)
       a
       (grcomdiv (modulo a b) b)))

;expected outcome: 5
(grcomdiv 10 15)

;expected outcome: 2
(grcomdiv 64 30)

;expected outcome: 5
(grcomdiv 25 20)

;expected outcome: 45
(grcomdiv 225 90)