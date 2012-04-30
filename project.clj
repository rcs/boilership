(defproject boilership "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]
                           [de.l3s.boilerpipe/boilerpipe "1.2.0"]
                           ;Deps for boilerpipe
                           [org.clojars.pallix/xerces "2.5.0"]
                           [net.sourceforge.nekohtml/nekohtml "1.9.15"]
                          ]
            :repositories {"boilerpipe" "http://boilerpipe.googlecode.com/svn/repo/"}


            :main boilership.server)

