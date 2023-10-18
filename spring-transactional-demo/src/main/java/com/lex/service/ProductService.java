package com.lex.service;

import com.lex.model.Product;
import com.lex.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Lex Yu
 */
@Service
public class ProductService {

	private ProductRepo productRepo;

	@Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Transactional // start
	public void insertProduct() {
		// If try-catch handle exception here, will not be rolled back,
		// In order to roll back, the exception need to be propagated out of this method
//		try {
			for (int i = 1; i <= 100; i++) {
				productRepo.saveProduct(new Product(i, "P-" + i));

				if (i == 10) {
					throw new RuntimeException("Some error occurred...");
				}

			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	} // commit
}
/*
Aspect {
	1. Start the @Transactional

	2. Call Your Method

	3. Commit Transaction

	4. Close
}
 */
