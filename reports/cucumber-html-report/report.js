$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/translate.feature");
formatter.feature({
  "name": "translate",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "translate a word",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "a source as \"\u003csource\u003e\", a target as \"\u003ctarget\u003e\" and a word as \"\u003cword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "i translate the word",
  "keyword": "When "
});
formatter.step({
  "name": "i can view the translated word as \"\u003ctranslated word\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "source",
        "target",
        "word",
        "translated word"
      ]
    },
    {
      "cells": [
        "spanish",
        "english",
        "familia",
        "family"
      ]
    }
  ]
});
formatter.scenario({
  "name": "translate a word",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a source as \"spanish\", a target as \"english\" and a word as \"familia\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TranslateTest.a_source_as_a_target_as_and_a_word_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i translate the word",
  "keyword": "When "
});
formatter.match({
  "location": "TranslateTest.i_translate_the_word()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i can view the translated word as \"family\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TranslateTest.i_can_view_the_translated_word(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});