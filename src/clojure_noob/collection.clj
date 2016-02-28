(ns clojure-noob.collection)

(defn hello-into
    []
    (println (into {} [[:abc "foo"]]))
    (println (into {:foo "foo"} [[:bar "bar"]]))
    (println (into [1 2 3] [3 4 5]))
    (println (into #{1 2 3} #{3 4 5})))

(defn hello-conj
    []
    (println (conj [1] [2]))
    (println (conj [1] 2 3 4 5)))

(defn hello
    []
    (hello-into)
    (hello-conj))
