package pe.com.service.transaction.service;


import pe.com.service.transaction.model.Transaction;
import reactor.core.publisher.Flux;

public interface TransactionService {
	
void createTransaction(Transaction transaction);
    
 
    Flux<Transaction> findAllTransaction();
 
}

