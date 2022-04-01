package com.zemoga.zemogaportfolioapp.domain.service;

import com.zemoga.zemogaportfolioapp.api.model.request.PortfolioRequestDTO;
import com.zemoga.zemogaportfolioapp.api.model.response.PortfolioResponseDTO;
import com.zemoga.zemogaportfolioapp.domain.model.PortfolioEntity;
import com.zemoga.zemogaportfolioapp.domain.repository.PortfolioRepository;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public PortfolioService(PortfolioRepository portfolioRepository, ModelMapper modelMapper) {
        this.portfolioRepository = portfolioRepository;
        this.modelMapper = modelMapper;
    }


    public Optional<PortfolioEntity> findById(Long idPortfolio) {
          return portfolioRepository.findById(idPortfolio);
    }

    public boolean existsById(Long idPortfolio) {
        return portfolioRepository.existsById(idPortfolio);
    }

    public PortfolioEntity save(PortfolioEntity portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public PortfolioEntity toEntity(PortfolioRequestDTO portfolioRequestDTO) {
        return modelMapper.map(portfolioRequestDTO, PortfolioEntity.class);
    }

    public PortfolioResponseDTO toResponse(PortfolioEntity portfolioEntity) {
        return modelMapper.map(portfolioEntity, PortfolioResponseDTO.class);
    }
}
