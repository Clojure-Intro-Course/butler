(ns lein-butler.core
  (require [leiningen.core.eval :only [eval-in-project]]
           [robert.hooke :only [add-hook]])))

(defn- add-wrap-eval [f project form init]
  (let [result (f project form init)]
    (println "Inside of wrap-eval")
    (println result)
    (result)
     ))

(defn hooks []
  (add-hook #'eval-in-project add-wrap-eval))

(defn -main [& args] (println "Foo"))
