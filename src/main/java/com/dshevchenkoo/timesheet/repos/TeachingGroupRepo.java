package com.dshevchenkoo.timesheet.repos;

import com.dshevchenkoo.timesheet.domain.TeachingGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeachingGroupRepo extends CrudRepository<TeachingGroup, Long> {

    List<TeachingGroup> findByNumber(String number);
}
