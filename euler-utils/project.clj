(defproject org.icanttype/euler-utils "0.3.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]
                   :dependencies [[midje "1.6.0"]]}})
