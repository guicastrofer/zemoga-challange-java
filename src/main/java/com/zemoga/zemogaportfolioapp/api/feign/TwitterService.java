package com.zemoga.zemogaportfolioapp.api.feign;

import com.zemoga.zemogaportfolioapp.api.config.ClientConfig;
import com.zemoga.zemogaportfolioapp.api.model.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "twitter-service", url = "${tbgr.consulta.regras.host}", decode404 = true, configuration = ClientConfig.class)
public interface TwitterService {
    @GetMapping("/referenceNumber/{codeTable}")
    ResponseEntity<BaseResponse<Long>> getReferenceNumber(@PathVariable String codeTable,
                                                          @RequestHeader("Authorization") String jwt,
                                                          @RequestHeader("x-transaction-id") String xTransactionId);
}



