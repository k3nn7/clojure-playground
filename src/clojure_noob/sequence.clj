(ns clojure-noob.sequence)

(defn to-sequence
    []
    (println "Vector -> seq" (seq [1 2 3]))
    (println "Map -> seq" (seq {:name "k3nn7" :commits 999}))
    (println "String -> seq" (seq "foo bar baz"))
    (println "Seq -> map" (into {} '([:name "k3nn7"] [:commits 999]))))

(defn map-examples
    []
    (println "Simple map" (map inc [1 2 3 4]))
    (println "Map over multimple vectors" (map + [1 2 3 4] [4 3 2 1]))
    (println "Map over functions"
             (map #(% 5) [#(+ % 5) #(/ % 2)]))
    (println "Get values for keyword"
             (map :age [{:name "foo" :age 123}  {:name "bar" :age 321}])))

(defn reduce-examples
    []
    (println "Transform map values"
             (reduce (fn [new-map [key val]] (assoc new-map key (inc val)))
                     {}
                     {:max 16 :min 1}))
    (println "Filter out map element based on value"
             (reduce (fn
                      [new-map [key val]]
                      (if (> val 18)
                          (assoc new-map key val)
                          new-map))
                     {}
                     {:foo 12 :bar 18 :baz 20})))

(defn take-drop-filter
    []
    (println "Take 3" (take 3 [1 2 3 4 5 6]))
    (println "Drop 3" (drop 3 [1 2 3 4 5 6]))
    (let [history [{:user "foo" :commits 1} {:user "bar" :commits 5} {:user "baz" :commits 2}]]
        (println "Take while age commits < 3"
             (take-while #(< (:commits %) 3) history))
        (println "Drop while commits < 3"
                 (drop-while #(< (:commits %) 3) history))
        (println "Filter commits > 3"
                 (filter #(> (:commits %) 3) history))
        (println "Some commits > 3?"
                 (some #(> (:commits %) 3) history))
        (println "Some commits > 3?"
                 (some #(and (> (:commits %) 3) %) history))
        (println "Sort by commits"
                 (sort-by :commits history))))

(defn even-numbers
    ([] (even-numbers 0))
    ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(defn lazy-sequences
    []
     (time (def mapped (map #(Thread/sleep (+ 10 %)) (range 0 3))))
     (time (first (map #(Thread/sleep %) (range 0 1000000))))
     (println (take 7 (repeat "foo")))
     (println (take 3 (repeatedly (fn [] (rand-int 10)))))
     (println (take 10 (even-numbers))))

(defn hello
    []
    (to-sequence)
    (map-examples)
    (reduce-examples)
    (take-drop-filter)
    (lazy-sequences))
