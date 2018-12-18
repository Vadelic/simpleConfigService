package com.komyshenets.repository;

import com.komyshenets.domain.Config;
import com.komyshenets.domain.Template;
import org.springframework.data.repository.CrudRepository;

public interface ConfigRepository extends CrudRepository<Config, Long> {
}
