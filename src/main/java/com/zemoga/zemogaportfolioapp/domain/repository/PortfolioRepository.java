package com.zemoga.zemogaportfolioapp.domain.repository;

import com.zemoga.zemogaportfolioapp.domain.model.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioEntity, Long> {
}
