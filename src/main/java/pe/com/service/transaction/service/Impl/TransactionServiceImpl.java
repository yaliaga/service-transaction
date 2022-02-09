package pe.com.service.transaction.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.service.transaction.model.Transaction;
import pe.com.service.transaction.repository.TransactionRepository;
import pe.com.service.transaction.service.TransactionService;
import reactor.core.publisher.Flux;


@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public void createTransaction(Transaction transaction) {
		transactionRepository.save(transaction).subscribe();

	}


	@Override
	public Flux<Transaction> findAllTransaction() {
		return transactionRepository.findAll();
	}
}