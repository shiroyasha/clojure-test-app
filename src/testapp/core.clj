(ns testapp.core)

(defn app [req]
  {:status  200
   :headers {"content-Type" "text/html"}
   :body    "Hello World!"})
