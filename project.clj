(defproject lein-butler "0.1.0"
  :description "Butler will, when it's done, serve up the project map and form."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[robert/hooke "1.3.0"]]
  :plugins [[lein-pprint "1.1.1"]]
  :main lein-butler.core)
