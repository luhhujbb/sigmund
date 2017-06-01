(defproject luhhujbb/sigmund "0.2.1"
  :description "System analytics for Clojure"
  :url "https://github.com/zcaudate/sigmund"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.hyperic/sigar "1.6.5.132"]
                 [stask/sigar-native-deps "1.6.4"]]
  :aol :all
  :profiles {:dev {:dependencies [[midje "1.5.0"]]}})
