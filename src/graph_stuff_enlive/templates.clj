(ns graph-stuff-enlive.templates
  (:require [net.cgrand.enlive-html :refer [deftemplate content]]))

(deftemplate tpl-helloworld "public/helloworld.html"
             [value]
             [:#message] (content value)
  )