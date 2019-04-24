(ns my_first_project.exercises-test
  (:require [clojure.test :refer :all]
           [my-first-project.exercises :refer :all]))

(deftest simple-sum
  (testing "The sum of 7654 1234"
    (is (= 8888 (exercise1 7654 1234)))))

(deftest multi-arity-greeting-test
  (testing "Greeting on multi-arity function"
    (is (= "Hello, World!" (greeting))
    (is (= "Hello, Clojure!" (greeting "Clojure"))
    (is (= "Good morning, Clojure!" (greeting "Good morning" "Clojure")))))))

