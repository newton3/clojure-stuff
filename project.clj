(defproject clojure-stuff "0.1.0-SNAPSHOT"
  :description "learning clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.2.0"]]
  :main ^:skip-aot clojure-stuff.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
