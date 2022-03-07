# Motoko plugin for IntelliJ IDEA

Adds support for the Motoko language from Dfinity.

It must be first compiled .bnf and .flex and generated java sources:

1. Open project in Intellij Idea IDE
2. install plugin Grammar-Kit
3. Run Jflex generator
4. Build in terminal with gradle buildPlugin
5. Install plugin from idea-motoko-plugin/build/distributions/motoko_language_plugin-2.0.0.zip
  
(note: untilBuild in build.gradle must be changed to 213 or above IDE version)


