package com.educacionit.springmvc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.springmvc.domain.Cupones;
import com.educacionit.springmvc.repository.CuponRepository;
import com.educacionit.springmvc.services.CuponService;

@Service
public class CuponServiceImpl implements CuponService {

	@Autowired
	private CuponRepository cuponRepository;
	
	@Override
	public List<Cupones> findAll() {		
		return this.cuponRepository.findAll();
	}

	@Override
	public void save(Cupones cupon) {
		this.cuponRepository.save(cupon);
	}

	@Override
	public void delete(Long id) { 
		this.cuponRepository.deleteById(id);
	}
	
	@Override
	public Cupones get(Long id) {
		return this.cuponRepository.findById(id).get();
	}
}
