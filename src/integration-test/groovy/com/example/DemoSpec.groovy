package com.example

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class DemoSpec extends Specification {

  void "test something"() {
    expect:
    true
  }
}
