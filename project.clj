(defproject clojure.gdx.dev-loop "-SNAPSHOT"
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [org.clj-commons/pretty "3.2.0"]
                 [nrepl "0.9.0"]
                 [org.clojure/tools.namespace "1.3.0"]]
  :plugins [[lein-codox "0.10.8"]]
  :codox {:source-uri "https://github.com/damn/moon/blob/main/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
