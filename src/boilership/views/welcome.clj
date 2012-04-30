(ns boilership.views.welcome
  (:require [boilership.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to boilership"]))
(defpage "/my-page" []
         (html
           (.process
             (de.l3s.boilerpipe.sax.HTMLHighlighter/newExtractingInstance)
             (new java.net.URL "http://www.cnn.com/2012/04/28/world/bin-laden-death-anniversary/index.html?hpt=hp_c1")
             de.l3s.boilerpipe.extractors.CommonExtractors/ARTICLE_EXTRACTOR
             )
           ))

