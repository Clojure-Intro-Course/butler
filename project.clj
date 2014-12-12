(defproject lein-sinker "0.2.0"
  :description "A platform for experimenting with Leiningen and Robert Hooke"
  :url "https://github.com/Clojure-Intro-Course/lein-hooke-sinker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  ;;You don't need a dependency on clojure - you use Leiningen's version of clojure.
  ;;(1.6.0 as of lein 2.5)
  ;;All other dependencies in Leiningen are available as well.
  :dependencies [[robert/hooke "1.3.0"]]
  )

