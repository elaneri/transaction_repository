package com.transaction.tax_processor.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.tax_processor.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByBatchTransactionId(String batchTransactionId, Pageable pageable);

	Transaction findByTransactionId(String transactionId);


}
