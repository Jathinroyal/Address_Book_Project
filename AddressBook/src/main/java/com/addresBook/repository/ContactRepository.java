package com.addresBook.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import com.addresBook.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

