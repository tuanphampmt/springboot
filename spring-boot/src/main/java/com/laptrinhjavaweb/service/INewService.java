package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

public interface INewService {

    NewDTO save(NewDTO dto) throws Exception;
    void delete(long[] ids);

}
