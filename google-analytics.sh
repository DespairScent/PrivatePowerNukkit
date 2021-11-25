#!/usr/bin/env sh
find . -type f -name "*.html" -exec sed -ri 's/^<!-- Generated by (javadoc|the JDiff) [^-]+-->$/\<\!\-\- Global site tag \(gtag\.js\) \- Google Analytics \-\-\> \<script async src\="https\:\/\/www\.googletagmanager\.com\/gtag\/js\?id\=UA\-172727144\-3"\>\<\/script\> \<script\> window\.dataLayer \= window\.dataLayer \|\| \[\]; function gtag\(\)\{dataLayer\.push\(arguments\);\} gtag\("js", new Date\(\)\); gtag\("config", "UA\-172727144\-3"\); \<\/script\>/g' {} \;