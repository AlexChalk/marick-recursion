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

(facts "about `recursive-operate`" 
  (fact "it operates on a sequence of numbers"
    (recursive-operate + [1 2 3 4] 0) => 10
    (recursive-operate + [0 0 0 0] 0) => 0
    (recursive-operate + [-1 -2 -3 -4] 0) => -10
    (recursive-operate * [1 2 3 4] 1) => 24
    (recursive-operate * [0 0 0 0] 1) => 0
    (recursive-operate * [-1 -2 -3 -4] 1) => 24))

(facts "about `zero-assocer`" 
  (fact "with recursive-operate, it maps a list to keys with a value of 0"
    (recursive-operate zero-assocer [:a :b :c] {}) => {:a 0 :b 0 :c 0}))

(facts "about `index-assocer`" 
  (fact "with recursive-operate, it maps a list to keys with a value of their index in the list"
    (recursive-operate index-assocer [:a :b :c] {}) => {:a 0 :b 1 :c 2}))

