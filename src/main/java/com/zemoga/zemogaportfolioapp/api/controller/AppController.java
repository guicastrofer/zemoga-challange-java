package com.zemoga.zemogaportfolioapp.api.controller;

import com.zemoga.zemogaportfolioapp.api.model.request.PortfolioRequestDTO;
import com.zemoga.zemogaportfolioapp.api.model.response.PortfolioResponseDTO;
import com.zemoga.zemogaportfolioapp.domain.model.PortfolioEntity;
import com.zemoga.zemogaportfolioapp.domain.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/portfolios")
public class AppController {

    private final PortfolioService portfolioService;

    @Autowired
    public AppController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/{idPortfolio}")
    public ResponseEntity<PortfolioResponseDTO> findById(@PathVariable Long idPortfolio) {
        Optional<PortfolioEntity> portfolio = portfolioService.findById(idPortfolio);

        if (portfolio.isPresent()) {
            var portfolioEntity = portfolio.get();
            return ResponseEntity.ok(portfolioService.toResponse(portfolioEntity));
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping(value = "/{idPortfolio}")
    public ResponseEntity<PortfolioEntity> update(@Valid @PathVariable Long idPortfolio, @RequestBody PortfolioRequestDTO portfolioRequestDTO) {
        if (!portfolioService.existsById(idPortfolio)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(portfolioService.save(portfolioService.toEntity(portfolioRequestDTO)));
    }

}
