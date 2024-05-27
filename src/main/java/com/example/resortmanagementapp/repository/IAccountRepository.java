package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, String> {
    //     đây là viết ra câu lệnh sql thuần'= , còn nếu ko dùng hql là bỏ nqtiveQuery
    //    @Query(nativeQuery = true, "câu lệnh sql")
    @Query(nativeQuery = true, value = "select*from account where account_name = ? ")
    Account findAccountByUserName(String username);
}
