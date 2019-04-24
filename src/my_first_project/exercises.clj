(ns my-first-project.exercises
  (:gen-class))

(defn exercise1
  "The sum of 7654 and 1234"
  [x y]
  (+ x y))

(defn greeting 
  ([] "Hello, World!")
  ([x] (str "Hello, " x"!"))
  ([x y] (str x ", " y "!")))