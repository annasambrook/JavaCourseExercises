package com.amal.Share_Service.persistence;

import com.amal.Share_Service.entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareDao extends JpaRepository<Share,Integer> {
}
