package com.tutorial.api.repositories;

import com.tutorial.api.modules.TestModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<TestModule,Integer> {
}
