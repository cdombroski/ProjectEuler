(defproject org.icanttype/euler05 "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.icanttype/euler-utils "0.3.0"]]
  :profiles {:dev {:plugins      [[lein-midje "3.1.1"]]
                   :dependencies [[midje "1.6.0"]]}}
  :main org.icanttype.euler05.core)