(ns guestbook.env
  (:require [clojure.tools.logging :as log]))

(defn from-profiles []
  {})

(def defaults
  {:init
   (fn []
     (log/info "\n-=[guestbook started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[guestbook has shut down successfully]=-"))
   :middleware identity})
