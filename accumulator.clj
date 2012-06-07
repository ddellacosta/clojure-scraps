;; http://weblog.raganwald.com/2007/01/closures-and-higher-order-functions.html

;; Raganwald's ruby
;;
;;   folder = lambda { |default_value, binary_function, list|
;;     fold_with_acc = lambda { |acc, list|
;;       if list.empty?
;;         acc
;;       else
;;         fold_with_acc.call(binary_function.call(acc, list.first), list[1..-1])
;;       end
;;     }
;;     fold_with_acc.call(default_value, list)
;;   }
;;

(defn accumulator [operator acc list]
  (if (empty? list)
    acc
    (accumulator operator (operator acc (first list)) (subvec list 1))))

;; Ruby:
;;
;;    folder.call(0, lambda { |a, b| a + b }, [1, 2, 3, 4, 5])
;;    folder.call(1, lambda { |a, b| a * b }, [1, 2, 3, 4, 5])
;;
;;
;; (this Clojure code includes a bit extra for printing, natch')

(println)
(println ";; Using my accumulator function:")
(println)

(println "=> (accumulator #(+ %1 %2) 0 [1 2 3 4 5]))")

(println (str "=> "
 (accumulator #(+ %1 %2) 0 [1 2 3 4 5])))
 
(println "=> (accumulator #(* %1 %2) 1 [1 2 3 4 5]))")

(println (str "=> "
 (accumulator #(* %1 %2) 1 [1 2 3 4 5])))

;; Also known as...

(println)
(println ";; Using Clojure's reduce function:")
(println)

(println "=> (reduce #(+ %1 %2) [1 2 3 4 5]))")

(println (str "=> "
 (reduce #(+ %1 %2) [1 2 3 4 5])))

(println "=> (reduce #(* %1 %2) [1 2 3 4 5]))")

(println (str "=> "
 (reduce #(* %1 %2) [1 2 3 4 5])))
(println)

;; I assume that when Raganwald said:

;; Actually, there's a far simpler way to avoid having to remember the
;; default value when you want to fold over addition. But let's just play
;; along so that we don’t have to come up with an entirely new set of
;; examples to demonstrate the value of functions as first-class values.

;; ...he meant that you basically don't pass in the initial value
;; but start from the first value of the array, as reduce does?
