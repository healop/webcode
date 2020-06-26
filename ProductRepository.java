package kr.ac.hansung.cse.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	Optional<Product> findById(int id); //id로 찾기 메소드
	//List<Product> findById(int id); //id로 찾기 메소드
	Optional<Product> findByCategory(String category); //category로 찾기 메소드
	//List<Product> findAll(); 
}