(ns lein-sinker.plugin
  ;;The only nesscessary namespaces are robert.hooke and whatever leiningen.$somthing namespaces you need.
  (:require [leiningen.core.eval :as leineval]
            [robert.hooke :as hooke]
            [leiningen.core.main :as leinmain]))

(defn print-stuff [f & args]
    ;;This doesn't actually work.
    (try
      (apply f args)
      (catch Exception e "We found an error in the code")))


(defn hooks []
  (hooke/add-hook #'leineval/eval-in #'print-stuff))
