(ns my_first_project.exercises-test
  (:require [clojure.test :refer :all]
           [my-first-project.exercises :refer :all]))

(deftest sum
  (testing "The sum of 7654 1234"
    (is (= 8888 (exercise1 7654 1234)))))