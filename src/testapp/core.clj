(ns testapp.core
 (:require [compojure.handler :as handler]
           [testapp.routes :as routes]))

(def app (handler/site routes/main-routes))
