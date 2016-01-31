(ns clojure-noob.core
  (:gen-class))

; Forms
(defn hello-world
    "Simple hello world"
    []
    (println "Hello world!"))

(defn hello-if
    "if-else example"
    [bool]
    (println (if bool
        "I got true"
        "I got false")))

(defn if-do
    "if with do"
    [bool]
    (println (if bool
        (do
            (println "Printing true")
            "returning true")
        "returning false")))

(defn hello-when
    "when operator example"
    [bool]
    (println (str "hello-when: " (when bool
        (println "hello-when!")
        "true"))))

(defn hello-nil
    "Print message when got nil"
    [value]
    (when (nil? value)
        (println "I got nil!")))

(defn hello-ten
    "Print message when got number 10"
    [value]
    (when (= value 10)
        (println "I got number 10!")))

(defn hello-truth
    "Print if value evaluates to true or false"
    [value]
    (if value
        (println (str "Value: " value " evaluates to true"))
        (println (str "Value: " value " evaluates to false"))))

(defn hello-and
    "Print message when and condition evaluates to true"
    [a b]
    (when (and (= a 10) (= b 20))
        (println "Got expected values 10 and 20!")))

(defn hello-or
    "Print message when or condition evaluates to true"
    [a b]
    (when (or (= a 10) (= b 20))
        (println "Got a = 10 or b = 20")))

(def twenty 20)

(defn hello-forms
    "Forms examples"
    []
    (do
      (hello-world)
      (hello-if true)
      (hello-if false)
      (if-do true)
      (if-do false)
      (hello-when true)
      (hello-when false)
      (hello-nil nil)
      (hello-ten 99)
      (hello-ten 10)
      (hello-truth 10)
      (hello-truth "abc")
      (hello-truth true)
      (hello-truth false)
      (hello-truth nil)
      (hello-truth "")
      (hello-and 10 20)
      (hello-and 11 21)
      (hello-or 10 5)
      (hello-or 0 0)
      (hello-or 0 20)))

; Data structures
(defn hello-ratio
    "Prints example ratio"
    []
    (println "Ratio:" (+ 2 1/3)))

(defn hello-maps
    "Prints example maps"
    []
    (do
        (println "Empty map:" {})
        (println "Map" {"add" +})
        (println "Other map" (hash-map :a 1 :b 2))
        (println "Get map element" (get {:a 1 :b 2} :b))
        (println "Get map element #2" ({:a 1 :b 2} :a))
        (println "Get map element #3 Recommended!" (:a {:a 1 :b 2}))
        (println "Get nested element" (get (get {:a 1 :b {:c 10}} :b) :c))
        (println "Get nested element #2" (get-in {:a 1 :b {:c 10}} [:b :c]))
        ))

(defn hello-vectors
    "Prints example vectors"
    []
    (do
        (println "Empty vector" [])
        (println "Some vector" [1 2 3 4 5])
        (println "Get vector 3rd element:" ([1 2 3 4 5] 3))
        (println "Append element to vector" (conj [1 2 3 4 5] 10))))

(defn hello-data-structures
    "Data structures examples"
    []
    (do
        (hello-ratio)
        (hello-maps)
        (hello-vectors)))

(defn -main
  "Executes set of hello-world functions"
  [& args]
  (do
      (hello-forms)
      (hello-data-structures)))
