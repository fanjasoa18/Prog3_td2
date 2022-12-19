package com.example.foot.repository;

import com.example.foot.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<Sponsor, String> {
}
