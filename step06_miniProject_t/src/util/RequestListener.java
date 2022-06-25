package util;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class RequestListener implements HttpSessionAttributeListener {

	public RequestListener() {
	}

	public void attributeAdded(HttpSessionBindingEvent se) {
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
	}

}
