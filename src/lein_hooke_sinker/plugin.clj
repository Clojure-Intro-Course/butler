(ns lein-hooke-sinker.plugin
  (:require [leiningen.core.eval :as leval]
            [robert.hooke :as hooke]
            [leiningen.core.main :as lmain]))

(defn print-stuff [f & args]
    (try
      (apply f args)
      (catch Exception e "We found an error in the code")))

;(defn- add-wrap-eval [f project form init]
;  (let [result (f project form init)]
;    (println "Inside of wrap-eval")
;    (println result)
;    (result)
;     ))


(defn hooks []
  (hooke/add-hook #'leval/eval-in #'test-stuff))
