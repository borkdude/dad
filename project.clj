(defproject dad
  #=(clojure.string/trim #=(slurp "resources/version.txt"))
  :description "Small configuration management tool for Clojure"
  :url "https://github.com/liquidz/dad"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "1.0.194"]

                 [aero "1.1.6"]
                 [borkdude/sci "0.0.13-alpha.22"]
                 [camel-snake-kebab "0.4.1"]
                 [metosin/malli "0.0.1-SNAPSHOT"]]

  :main ^{:skip-aot true} dad.core
  :profiles
  {:dev {:resource-paths ["test/resources"]
         :global-vars {*warn-on-reflection* true}}
   :outdated {:dependencies [[antq "RELEASE"]]}
   :uberjar {:aot [dad.core]
             :prep-tasks ["compile"]
             :uberjar-name "dad.jar"}}
  )
