(ns status-im.ui.components.checkbox.styles
  (:require-macros [status-im.utils.styles :refer [defnstyle]])
  (:require [status-im.ui.components.styles :as st]))

(def wrapper
  {:padding 16})

(defnstyle icon-check-container [checked?]
  {:background-color (if checked? st/color-light-blue st/color-gray5)
   :alignItems     :center
   :justifyContent :center
   :android        {:border-radius 2
                    :width         17
                    :height        17}
   :ios            {:border-radius 50
                    :width         24
                    :height        24}})

(def check-icon
  {:width  12
   :height 12})