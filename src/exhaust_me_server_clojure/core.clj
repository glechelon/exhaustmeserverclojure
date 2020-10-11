(ns exhaust-me-server-clojure.core
  (:gen-class))

(require '[exhaust-me-server-clojure.users :as users])

;;clojure comment
(defn -main
  [& args]
  (println (users/select-users))

  )




