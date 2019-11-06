(ns clojure.fibo-test
    (:require [clojure.test :refer :all]
              [clojure.fibo :as fibo :refer [f1 f2]]))

(deftest fibo-f1-test
    (testing "fibo f1: fail"
        (is (= 3 (fibo/f1 4)))
        (is (= 5 (fibo/f1 5)))
        (is (= 8 (fibo/f1 6)))))

(deftest fibo-f2-test
    (testing "fibo f2: fail"
        (is (= 3 (fibo/f2 4)))
        (is (= 5 (fibo/f2 5)))
        (is (= 8 (fibo/f2 6)))))

(clojure.test/run-tests 'clojure.fibo-test)
