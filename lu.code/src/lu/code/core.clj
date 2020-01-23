(ns lu.code.core
  (:require
    [yada.yada :as yada]
    [integrant.core :as ig]))

(defmethod ig/init-key ::resource
  [_ x]
  (yada/as-resource x))
