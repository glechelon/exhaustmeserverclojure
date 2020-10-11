(ns exhaust-me-server-clojure.exhaust-me-server-clojure.common.db)

(require '[clojure.java.jdbc :as j])


(def mysql-db {:dbtype "mysql"
               :host "localhost"
               :dbname "EXHAUST_ME"
               :user "exhaustMeServer"
               :password "pwdExhaustMeServer"})