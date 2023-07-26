package com.taxOrbit.taxOrbitAPI.repositories;

import com.taxOrbit.taxOrbitAPI.modules.TestModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<TestModule,Integer> {
}
