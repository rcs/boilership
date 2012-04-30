(ns boilership.views.welcome
  (:require [boilership.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defn extract-article
  ([url]
   (.process
     (de.l3s.boilerpipe.sax.HTMLHighlighter/newExtractingInstance)
     (new java.net.URL url)
     de.l3s.boilerpipe.extractors.CommonExtractors/ARTICLE_EXTRACTOR)))


(defpage "/boil/*" {url :*}
         (html
           (extract-article url)))
