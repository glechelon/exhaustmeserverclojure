(ns exhaust-me-server-clojure.users)


(require '[honeysql.core :as sql]
         '[honeysql.helpers :refer :all :as helpers]
         '[exhaust-me-server-clojure.exhaust-me-server-clojure.common.db :as db]
         '[clojure.java.jdbc :as j])


(def select-all {:select [:*] :from [:USERS]})

(def select-by-id {:select [:*] :from [:users] :where [:= :id (sql/param :id)]})


(defn select-users []
  (j/query db/mysql-db (sql/format select-all) {}))