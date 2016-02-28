(ns clojure-noob.higher-order)

(defn hello-apply
    []
    (println (apply max [1 2 3 4])))

(def add10 (partial + 10))

(def add-water (partial conj ["water"]))

(defn hello-partial
    []
    (println (add10 5))
    (println (add-water "fire")))

(defn is-even
    [number]
    (= (mod number 2) 0))

(def is-odd (complement is-even))

(defn hello-complement
    []
    (println (map is-even [1 2 3 4 5]))
    (println (map is-odd [1 2 3 4 5])))

(defn hello
    []
    (hello-apply)
    (hello-partial)
    (hello-complement))
