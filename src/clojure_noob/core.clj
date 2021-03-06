(ns clojure-noob.core
  (:gen-class))

(require '[clojure-noob.forms :as forms])
(require '[clojure-noob.data-structures :as data])
(require '[clojure-noob.functions :as functions])
(require '[clojure-noob.destructuring :as destructuring])
(require '[clojure-noob.hobbit :as hobbit])
(require '[clojure-noob.loops :as loops])
(require '[clojure-noob.sequence :as sequence])
(require '[clojure-noob.collection :as collection])
(require '[clojure-noob.higher-order :as higher-order])

(defn -main
  "Executes set of hello-world functions"
  [& args]
  (forms/hello)
  (data/hello)
  (functions/hello)
  (destructuring/hello)
  (println (hobbit/better-symmetrize-body-parts hobbit/asym-hobbit-body-parts))
  (println (hobbit/hit hobbit/asym-hobbit-body-parts))
  (loops/hello)
  (sequence/hello)
  (collection/hello)
  (higher-order/hello))
