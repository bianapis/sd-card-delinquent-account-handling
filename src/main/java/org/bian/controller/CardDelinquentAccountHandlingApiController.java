/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardDelinquentAccountHandlingApiController {

	@Autowired
	CardDelinquentAccountHandlingApiService service;
	
	@BQ("payments")
	@Process.ExecutePost
	public BianResponse<PaymentWithIdAndRoot> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Payment> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.ExecutePut
	public BianResponse<PaymentWithIdAndRoot> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Payment> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<DelinquentAccountWithIdAndRoot> requestPost(@RequestBody BianRequest<DelinquentAccount> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<DelinquentAccountWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DelinquentAccount> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assessments")
	@Process.Retrieve
	public BianResponse<AssessmentWithIdAndRoot> retrieveAssessments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssessments(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("contacts")
	@Process.Retrieve
	public BianResponse<ContactWithIdAndRoot> retrieveContacts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContacts(crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<DelinquentAccountWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("payments")
	@Process.Retrieve
	public BianResponse<PaymentWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("resolutions")
	@Process.Retrieve
	public BianResponse<ResolutionWithIdAndRoot> retrieveResolutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<DelinquentAccountWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DelinquentAccount> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
