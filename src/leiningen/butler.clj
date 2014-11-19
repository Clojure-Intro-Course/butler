(ns leiningen.butler
	(require [leiningen.core.eval :only [eval-in-project]]
           [robert.hooke :only [add-hook]])))

(defn- add-wrap-eval [f project form init]
  (let [result (f project form init)]
    (println "Inside of wrap-eval")
    (println result)
    (result)
     ))

(defn lein-butler.plugin/hooks []
  (add-hook #'eval-in-project add-wrap-eval))

(defn butler "An experimental plugin, that may or may not be a grue." [project & keys] (println "main ran"))


