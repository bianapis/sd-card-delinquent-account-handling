/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardDelinquentAccountHandlingApiService {

	PaymentWithIdAndRoot executePostPayments(String crReferenceId, Payment request);
	
	PaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, Payment request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	DelinquentAccountWithIdAndRoot requestPost(DelinquentAccount request);
	
	DelinquentAccountWithIdAndRoot requestPut(String crReferenceId, DelinquentAccount request);
	
	AssessmentWithIdAndRoot retrieveAssessments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ContactWithIdAndRoot retrieveContacts(String crReferenceId, String bqReferenceId);
	
	DelinquentAccountWithIdAndRoot retrieve(String crReferenceId);
	
	PaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	ResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId);
	
	DelinquentAccountWithIdAndRoot update(String crReferenceId, DelinquentAccount request);
	
}
