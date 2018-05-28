package com.dshevchenkoo.timesheet.repos;

import com.dshevchenkoo.timesheet.domain.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepo extends CrudRepository<Group, Long> {
}
