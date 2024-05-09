package com.YumFusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YumFusion.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
