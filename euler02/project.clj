(defproject org.icanttype/euler02 "0.1.2"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.icanttype/euler-utils "0.2.1"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]
                   :dependencies [[midje "1.6.0"]]}}
  :main org.icanttype.euler02.core)
