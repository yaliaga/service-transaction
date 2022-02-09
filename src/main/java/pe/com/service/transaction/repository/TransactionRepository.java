package pe.com.service.transaction.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import pe.com.service.transaction.model.Transaction;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String>{

}
