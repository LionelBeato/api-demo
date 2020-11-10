package com.wozu.Api2.Repostories;

import com.wozu.Api2.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog,Long> {}
