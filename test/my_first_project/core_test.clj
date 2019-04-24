(ns my-first-project.core-test
  (:require [clojure.test :refer :all]
            [my-first-project.core :refer :all]))

(deftest a-test
  (testing "Haha, I've done it"
    (is (= 1 1))))