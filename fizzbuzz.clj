;; http://www.codinghorror.com/blog/2007/02/why-cant-programmers-program.html
;; http://weblog.raganwald.com/2007/01/dont-overthink-fizzbuzz.html
;; http://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/
;; etc.

;; Meh, feel like this could be better.  Still a clojure newb though.

(dorun
 (for [x (range 1 100)]
    (condp = 0
      (+ (rem x 3) (rem x 5)) (println (str x " = fizzbuzz"))
      (rem x 3) (println (str x " = fizz"))
      (rem x 5) (println (str x " = buzz"))
      "")))
