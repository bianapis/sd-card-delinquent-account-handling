/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardDelinquentAccountHandlingApiServiceImpl implements CardDelinquentAccountHandlingApiService {

	public PaymentWithIdAndRoot executePostPayments(String crReferenceId, Payment request){
		return JsonReader.read("executePost-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public PaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, Payment request){
		return JsonReader.read("executePut-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public DelinquentAccountWithIdAndRoot requestPost(DelinquentAccount request){
		return JsonReader.read("requestPost-DelinquentAccountWithIdAndRoot.json",new TypeReference<DelinquentAccountWithIdAndRoot>(){});
	}
	
	public DelinquentAccountWithIdAndRoot requestPut(String crReferenceId, DelinquentAccount request){
		return JsonReader.read("requestPut-DelinquentAccountWithIdAndRoot.json",new TypeReference<DelinquentAccountWithIdAndRoot>(){});
	}
	
	public AssessmentWithIdAndRoot retrieveAssessments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssessmentWithIdAndRoot.json",new TypeReference<AssessmentWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactWithIdAndRoot retrieveContacts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactWithIdAndRoot.json",new TypeReference<ContactWithIdAndRoot>(){});
	}
	
	public DelinquentAccountWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DelinquentAccountWithIdAndRoot.json",new TypeReference<DelinquentAccountWithIdAndRoot>(){});
	}
	
	public PaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ResolutionWithIdAndRoot.json",new TypeReference<ResolutionWithIdAndRoot>(){});
	}
	
	public DelinquentAccountWithIdAndRoot update(String crReferenceId, DelinquentAccount request){
		return JsonReader.read("update-DelinquentAccountWithIdAndRoot.json",new TypeReference<DelinquentAccountWithIdAndRoot>(){});
	}
	
}
