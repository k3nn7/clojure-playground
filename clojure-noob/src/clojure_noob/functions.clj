(ns clojure-noob.functions)

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

(defn hello
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
