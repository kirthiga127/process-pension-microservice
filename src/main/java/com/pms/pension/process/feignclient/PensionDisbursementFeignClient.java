package com.pms.pension.process.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.pension.process.exception.AadharNumberNotFound;
import com.pms.pension.process.exception.AuthorizationException;
import com.pms.pension.process.model.ProcessPensionInput;
import com.pms.pension.process.model.ProcessPensionResponse;

//@FeignClient(name = "pensiondisbursement-microservice",url = "http://localhost:8300/disbursement/api/final")
@FeignClient(name = "pensiondisbursement-microservice",url = "http://890387-pension-disbursement-lb-109636833.us-east-1.elb.amazonaws.com/disbursement/api/final")
public interface PensionDisbursementFeignClient {
	
	@PostMapping("/disbursePension")
	public ProcessPensionResponse getResponse(
			@RequestHeader(value = "Authorization", required = true) String requestTokenHeader,
			@RequestBody ProcessPensionInput processpensionInput) throws AuthorizationException, AadharNumberNotFound;
	
}
