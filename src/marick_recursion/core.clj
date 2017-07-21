(ns marick-recursion.core)

(def factorial
  (fn [arg]
    (if (> 2 arg)
      1 
      (* arg
         (factorial
           (- arg 1))))))
