(ns clojure-noob.data-structures)

; Data structures
(defn hello-ratio
    "Prints example ratio"
    []
    (println "Ratio:" (+ 2 1/3)))

(defn hello-maps
    "Prints example maps"
    []
    (println "Empty map:" {})
    (println "Map" {"add" +})
    (println "Other map" (hash-map :a 1 :b 2))
    (println "Get map element" (get {:a 1 :b 2} :b))
    (println "Get map element #2" ({:a 1 :b 2} :a))
    (println "Get map element #3 Recommended!" (:a {:a 1 :b 2}))
    (println "Get nested element" (get (get {:a 1 :b {:c 10}} :b) :c))
    (println "Get nested element #2" (get-in {:a 1 :b {:c 10}} [:b :c])))

(defn hello-vectors
    "Prints example vectors"
    []
    (println "Empty vector" [])
    (println "Some vector" [1 2 3 4 5])
    (println "Get vector 4rd element:" ([1 2 3 4 5] 3))
    (println "Append element to vector" (conj [1 2 3 4 5] 10)))

(defn hello-lists
    "Prints example lists"
    []
    (println "Empty list" '())
    (println "Some list" '(1 2 3 4))
    (println "Get list 3rd element" (nth '(1 2 3 4) 2))
    (println "Prepend list with element" (conj '(1 2 3 4) 5)))

(defn hello-sets
    "Prints example sets"
    []
    (println "Empty set" #{})
    (println "Some set" #{1 3 "abc" :foo})
    (println "Set with duplicates" (hash-set 1 1 2 2))
    (println "Set from vector" (set [1 1 2 2 3 3]))
    (println "Contains?" (contains? #{1 3 5} 4)))

(defn hello
    "Data structures examples"
    []
    (hello-ratio)
    (hello-maps)
    (hello-vectors)
    (hello-lists)
    (hello-sets))
