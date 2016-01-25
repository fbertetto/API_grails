package grails_service

import grails.rest.RestfulController

/**
 * This class is just to test correct functionality of the server.
 *
 * @author Fabian Bertetto
 *
 */
class PingController extends RestfulController {
	def ping = { render "pong" }
}