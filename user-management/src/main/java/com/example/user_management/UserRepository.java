package com.example.user_management;


    import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {}


