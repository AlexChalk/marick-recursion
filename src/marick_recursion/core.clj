(ns marick-recursion.core)

(def factorial
  (fn [arg]
    (if (> 2 arg)
      1 
      (* arg (factorial (- arg 1))))))

(def factorial2-1
  (fn [arg memo]
    (if (> 2 arg)
      memo
      (recur (dec arg)
             (* arg memo)))))

(def factorial2
  (fn [arg]
    (factorial2-1 arg 1)))

(def recursive-add
  (fn [arg memo]
    (if (empty? arg)
      memo
      (recur (rest arg)
             (+ memo (first arg))))))
