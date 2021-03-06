package com.newbiest.base.repository;

import com.newbiest.base.repository.custom.IRepository;
import com.newbiest.security.model.NBOrg;
import org.springframework.stereotype.Repository;

/**
 * Created by guoxunbo on 2018/7/11.
 */
@Repository
public interface OrgRepository extends IRepository<NBOrg, Long> {

}
