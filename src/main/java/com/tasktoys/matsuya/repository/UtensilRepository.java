package com.tasktoys.matsuya.repository;

import com.tasktoys.matsuya.domain.Utensil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Takumi on 2016/03/09.
 */
/* */
@Repository
public interface UtensilRepository extends CrudRepository<Utensil, Long> {

}
/* */