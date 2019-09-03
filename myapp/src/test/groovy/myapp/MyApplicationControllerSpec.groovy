package myapp

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class MyApplicationControllerSpec extends Specification implements ControllerUnitTest<MyApplicationController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
