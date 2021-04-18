package com.joshi.socialmedia.SOCIALMEDIa.dao;

import com.joshi.socialmedia.SOCIALMEDIa.userinfo.USER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface USERDao extends JpaRepository<USER,Long> {

    @Query("SELECT u from USER u where u.emailAddress=?1 and u.password=?2")
    USER findByEmailAndPassword(String email_address,String password);

}
