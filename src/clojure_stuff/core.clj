(ns clojure-stuff.core
  (:require [clj-http.client :as client]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (client/get "http://api.github.com/users/newton3" {:as :json})))
