package com.educacionit.springmvc.services;

import java.util.List;

import com.educacionit.springmvc.domain.Cupones;

public interface CuponService {

	public List<Cupones> findAll();//busca todos los cupones en la db.cupones

	public void save(Cupones cupon);

	public void delete(Long id);

	public Cupones get(Long id);
}
