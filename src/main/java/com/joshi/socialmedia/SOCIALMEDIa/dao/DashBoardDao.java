package com.joshi.socialmedia.SOCIALMEDIa.dao;

import com.joshi.socialmedia.SOCIALMEDIa.dashboard.DashboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashBoardDao extends JpaRepository<DashboardEntity,Long> {


}
