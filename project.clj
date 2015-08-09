(defproject testapp "0.1.0-SNAPSHOT"
  :description "TestApp for Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [ring/ring-mock "0.2.0"]]

  :plugins [[lein-ring "0.9.6"]]

  :ring {:handler testapp.core/app})
