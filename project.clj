(defproject org.clojars.ashenwolf/clj-gae-datastore "0.5"
  :description      "clojure dsl for accessing the appengine datastore"
  :url "http://github.com/ashenwolf/clj-gae-datastore"
  :license {:name "GNU Lesser General Public License"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :dependencies     [[clj-time "0.5.1"]
                     [com.google.appengine/appengine-api-1.0-sdk "1.8.3"]
                     [com.google.appengine/appengine-api-labs "1.8.3"]
                     [com.google.appengine/appengine-api-stubs "1.8.3"]
                     [compojure "1.1.3"]
                     [hiccup "1.0.1"]
                     [org.clojure/clojure "1.5.1"]
                     [org.clojure/tools.logging "0.2.4"]
                     [ring/ring-core "1.1.5" :exclusions [[org.clojure/clojure-contrib]]]
                     [ring/ring-devel "1.1.5"]]
  :profiles {:dev {:dependencies [[com.google.appengine/appengine-local-runtime "1.7.0"]
                                  [ring/ring-jetty-adapter "1.1.8"]]}})
