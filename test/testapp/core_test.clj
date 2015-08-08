(ns testapp.core-test
  (:require [clojure.test :refer :all]
            [testapp.core :refer :all]
            [ring.mock.request :as mock]))

(deftest HelloWorld
  (testing "Hello World controller returns hello world"
    (let [response (app (mock/request :get "/") )]
      (is (= (:status response) 200)))))
