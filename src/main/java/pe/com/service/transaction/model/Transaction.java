package pe.com.service.transaction.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Document(collection = "transaction")
public class Transaction {
	
	 @Id
	    private String id;
	    private String nameTransaction;
	    private String amountTransaction;
	    @DateTimeFormat(pattern = "yyyy-mm-dd")
	    private Date createDate;

}
