package pe.com.service.transaction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pe.com.service.transaction.model.Transaction;
import pe.com.service.transaction.service.Impl.TransactionServiceImpl;
import reactor.core.publisher.Flux;



@RestController
@RequiredArgsConstructor
@RequestMapping("/transaction")
public class TransactionController {
	
	private final TransactionServiceImpl transactionServiceImpl; //inyecciondedepen
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createTransaction(@RequestBody Transaction transaction) {
		transactionServiceImpl.createTransaction(transaction);
	}

	@GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	@ResponseBody
	public Flux<Transaction> findAll() {
		return transactionServiceImpl.findAllTransaction();
	}

	
}
