package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.employee.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, String> {
    //     đây là viết ra câu lệnh sql thuần'= , còn nếu ko dùng hql là bỏ nqtiveQuery
    //    @Query(nativeQuery = true, "câu lệnh sql")
    @Query(nativeQuery = true, value = "select*from account where username = ? ")
    Account findAllByUsername(String username);
}
