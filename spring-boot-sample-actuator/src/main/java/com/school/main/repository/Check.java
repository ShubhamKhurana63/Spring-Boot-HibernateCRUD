package com.school.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.main.dto.CheckDTO;

public class Check implements CrudRepository<CheckDTO,Integer> {

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CheckDTO arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends CheckDTO> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<CheckDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CheckDTO> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheckDTO findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CheckDTO> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CheckDTO> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
