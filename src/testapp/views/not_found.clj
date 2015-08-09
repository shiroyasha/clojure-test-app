(ns testapp.views.pages
  (use [hiccup core page]))

(defn page-404 []
  (html5
    [:head
     [:title "TestApp"]]
    [:body
     [:h1 "Page not found!"]]))
