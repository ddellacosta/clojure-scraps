;; Feel like this could be better...

(defn fibonacci [n]
 (next
 (loop [t [0 1]]
   (if (> (count t) n)
     t
     (recur
      (conj t
            (+ (nth t (- (count t) 2)) (last t))))))))

(println (fibonacci 3))
(println (fibonacci 5))
(println (fibonacci 10))
(println (fibonacci 20))
