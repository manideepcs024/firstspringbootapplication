package com.pluralsight.confrence.demo.repositiries;

import com.pluralsight.confrence.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
