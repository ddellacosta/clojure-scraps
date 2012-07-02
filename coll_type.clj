;;
;; Determine the type of collection we were passed in, recursively.
;;
;; I entered the Code Golf competition on 4clojure.com, and this was a humbling 137th place.
;; Slightly below average it would seem. *sigh*
;;
;; I'll have to come back and refactor this one once I get more experience w/Clojure.
;; I suspect...well, I know that I'm not using all the core functions as well as I could be.
;;

(defn colltype [coll]
  (let [s (conj (conj coll [:val1 1]) [:val2 2])
        f (first s)
        fc (count (flatten s))]
    (cond
     (= f [:val2 2]) (if (= fc 0) :map :list)
     (= fc 0) :set
     :else :vector)))


(println (str {:a 1, :b 2}))
(println (str (colltype {:a 1, :b 2})))
(println (str (= :map (colltype {:a 1, :b 2}))))
(println "")

(println (range (rand-int 20)))
(println (str (colltype (range (rand-int 20)))))
(println (str (= :list (colltype (range (rand-int 20))))))
(println "")

(println (str [1 2 3 4 5 6]))
(println (str (colltype [1 2 3 4 5 6])))
(println (str (= :vector (colltype [1 2 3 4 5 6]))))
(println "")

(println (str #{10 (rand-int 5)}))
(println (str (colltype #{10 (rand-int 5)})))
(println (str (= :set (colltype #{10 (rand-int 5)}))))
(println "")

(println (str [{} #{} [] ()]))
(println (map colltype [{} #{} [] ()]))
(println (str (= [:map :set :vector :list] (map colltype [{} #{} [] ()]))))
(println "")
