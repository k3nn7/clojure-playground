(ns clojure-noob.destructuring)

(defn first-element
  [[first-thing]]
  (println "First thing:" first-thing))

(defn hello-user
  [{name :name email :email}]
  (println "User:" name "email:" email))

(defn hello-user-2
  [{:keys [name email]}]
  (println "User2:" name "email:" email))

(defn hello
  []
  (first-element ["foo" "bar" "baz"])
  (hello-user {:name "k3nn7" :email "k3nn7@example.com"})
  (hello-user-2 {:name "foo" :email "foo@example.com"}))
