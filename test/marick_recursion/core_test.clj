(ns marick-recursion.core-test
  (:require [midje.sweet :refer :all]
            [marick-recursion.core :refer :all]))

(facts "about `factorial`"
  (fact "it returns the factorial of its argument"
    (factorial 0) => 1
    (factorial 1) => 1
    (factorial 4) => 24
    (factorial 5) => 120
    (factorial 6) => 720))

(facts "about `factorial2`"
  (fact "it returns the factorial of its argument"
    (factorial2 0) => 1
    (factorial2 1) => 1
    (factorial2 4) => 24
    (factorial2 5) => 120
    (factorial2 6) => 720))
