package important_interfaces.ApplicationRunnerExample.service;

import org.springframework.stereotype.Service;

@Service
public class MessageProviderService {

	public String message() {
		return "Hey! It's me.";
	}
}
