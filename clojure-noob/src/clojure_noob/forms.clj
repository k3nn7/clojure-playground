(ns clojure-noob.forms)

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

(defn hello
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
