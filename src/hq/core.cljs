(ns hq.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state (atom {:tagline "Aumenta la productividad de tu negocio"}))

(om/root
  (fn [app owner]
    (dom/h2 nil "nil"))
  app-state
  {:target (. js/document (getElementById "value-prop"))})
