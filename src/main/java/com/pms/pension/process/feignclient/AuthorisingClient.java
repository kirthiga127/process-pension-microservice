package com.pms.pension.process.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

//@FeignClient(name = "authorization-microservice", url = "http://localhost:8400/auth/api/final")
@FeignClient(name = "authorization-microservice", url = "http://890387-pension-auth-lb-1547431204.us-east-1.elb.amazonaws.com/auth/api/final")
public interface AuthorisingClient {

	@PostMapping("/authorize")
	public boolean authorizeTheRequest(@RequestHeader(value = "Authorization", required = true) String requestTokenHeader);
}
