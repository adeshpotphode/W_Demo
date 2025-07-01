
package com.example.demo.repository;

import com.example.demo.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactForm, Long> {
}
