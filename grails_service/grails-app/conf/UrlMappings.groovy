class UrlMappings {

	static mappings = {
		"/ping"{
			controller = "ping"
			action = "ping"
		}
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
