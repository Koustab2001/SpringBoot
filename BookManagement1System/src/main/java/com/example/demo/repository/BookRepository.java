package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends JpaRepository<Book, Integer> {

}
