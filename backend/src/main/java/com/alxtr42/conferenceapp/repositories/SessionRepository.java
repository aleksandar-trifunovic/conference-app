package com.alxtr42.conferenceapp.repositories;

import com.alxtr42.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
