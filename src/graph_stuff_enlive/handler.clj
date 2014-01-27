(ns graph-stuff-enlive.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [graph-stuff-enlive.templates :as template]))

(defroutes app-routes
  (GET "/" []  (template/tpl-helloworld "Hello world?"))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
