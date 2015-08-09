(ns testapp.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [testapp.views.not-found :as not-found]
            [testapp.views.index :as index]))


(defroutes main-routes
  (GET "/" [] (index/index))
  (route/not-found (not-found/page-404)))
