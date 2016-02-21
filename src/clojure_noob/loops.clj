(ns clojure-noob.loops)

(defn hello
  []
  (loop [iteration 0]
    (println "Iteration" iteration)
    (if (> iteration 3)
      (println "Goodbye!")
      (recur (inc iteration)))))
