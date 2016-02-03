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
        (println "Get vector 4rd element:" ([1 2 3 4 5] 3))
        (println "Append element to vector" (conj [1 2 3 4 5] 10))))

(defn hello-lists
    "Prints example lists"
    []
    (do
        (println "Empty list" '())
        (println "Some list" '(1 2 3 4))
        (println "Get list 3rd element" (nth '(1 2 3 4) 2))
        (println "Prepend list with element" (conj '(1 2 3 4) 5))
        ))

(defn hello-sets
    "Prints example sets"
    []
    (do
        (println "Empty set" #{})
        (println "Some set" #{1 3 "abc" :foo})
        (println "Set with duplicates" (hash-set 1 1 2 2))
        (println "Set from vector" (set [1 1 2 2 3 3]))
        (println "Contains?" (contains? #{1 3 5} 4))))

(defn hello-data-structures
    "Data structures examples"
    []
    (do
        (hello-ratio)
        (hello-maps)
        (hello-vectors)
        (hello-lists)
        (hello-sets)))


;Functions
(defn map-example
    "Prints example result of map function"
    []
    (println "map result:" (map inc [1 2 3 4])))

(defn hello-name
    "Says hello to given recipient"
    [recipient]
    (println (str "Hello " recipient "!")))

(defn multi-arity
  "2 arguments"
  ([a b]
    (println "I got 2 arguments" a b))
  ([a b c]
    (println "I got 3 arugments" a b c)))

(defn hello-default
  "Greet given name"
  ([name]
    (println (str "Hello " name "!")))
  ([]
    (hello-default "World")))

(defn greet-all
  [& people]
  (map hello-default people))

(defn equipment
  [name & items]
  (println name "has in backpack:"
    (clojure.string/join ", " items)))

(defn hello-anonymous
  [greeting & people]
  (println (map
    (fn [name] (str greeting " " name))
    people)))

(defn hello-anonymous-short
  [greeting & people]
  (println (map
    #(str greeting " " %)
    people)))

(defn hello-functions
    "Varioud functions examples"
    []
    (do
        (map-example)
        (hello-name "K3nn7")
        (multi-arity 1 2)
        (multi-arity 1 2 3)
        (hello-default)
        (hello-default "K3nn7")
        (greet-all "K3nn7" "Foo" "Bar")
        (equipment "K3nn7" "axe" "shield" "armor")
        (hello-anonymous "Hi" "foo" "bar" "baz")
        (hello-anonymous-short "Welcome" "baz" "bar" "foo")))

; Destructuring
(defn first-element
  [[first-thing]]
  (println "First thing:" first-thing))

(defn hello-user
  [{name :name email :email}]
  (println "User:" name "email:" email))

(defn hello-user-2
  [{:keys [name email]}]
  (println "User2:" name "email:" email))

(defn destructuring
  []
  (first-element ["foo" "bar" "baz"])
  (hello-user {:name "k3nn7" :email "k3nn7@example.com"})
  (hello-user-2 {:name "foo" :email "foo@example.com"}))

;Hobbit example
(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
          (into final-body-parts (set [part (matching-part part)])))))))

(defn better-symmetrize-body-parts
  [asym-body-parts]
  (let [f (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))]
    (reduce f [] asym-body-parts)
  ))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symmetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
      (loop [[part & remaining] sym-parts
             accumulated-size (:size part)]
           (if (> accumulated-size target)
             part
             (recur remaining (+ accumulated-size (:size (first remaining))))))))

;Looping
(defn loop-example
  []
  (loop [iteration 0]
    (println "Iteration" iteration)
    (if (> iteration 3)
      (println "Goodbye!")
      (recur (inc iteration)))))

(defn -main
  "Executes set of hello-world functions"
  [& args]
  (do
      (hello-forms)
      (hello-data-structures)
      (hello-functions)
      (destructuring)
      (println (better-symmetrize-body-parts asym-hobbit-body-parts))
      (println (hit asym-hobbit-body-parts))
      (loop-example)))
