import ratpack.http.MutableHeaders
import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {
        get("items"){
        	MutableHeaders headers = response.headers 
        	headers.set('Content-Type', 'application/json;charset=UTF-8') 
        	render '{ "items": ["Testability", "Scaleability", "Usability"] }'
        }

        files { dir "public" }
    }
}
