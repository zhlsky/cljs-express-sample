(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]]

  :jvm-opts ^:replace ["-Xmx1g" "-server"]

  :plugins [[lein-npm "0.6.1"]
            [lein-cljsbuild "1.1.5"]]

  :node-dependencies [[source-map-support "0.4.0"]
                      [express "4.14.0"]]


  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"

  :cljsbuild {
    :builds [{:id "server"
              :source-paths ["src"]
              :compiler {
                :main hello-world.core
                :output-to "out/main.js"
                :output-dir "out"
                :optimizations :none
                :target :nodejs
                :cache-analysis true
                :source-map true}}
             ]})
