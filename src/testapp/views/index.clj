(ns testapp.views.index
  (use [hiccup core page]))

(defn index []
  (html5
    [:head
     [:title "TestApp"]]
    [:body
     [:h1 "Hello World!"]]))
