(ns hello-world.core
  (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(def express (node/require "express"))
(def app (express))

(defn say-hello! [req res]
  (.send res "Hello world!"))

(.get app "/" say-hello!)

(defn -main []
  (.listen app 3000 (fn []
                      (println "Server started on port 3000"))))

(set! *main-cli-fn* -main)
