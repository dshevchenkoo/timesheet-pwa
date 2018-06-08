package com.example.sweater.repos;

import com.example.sweater.domain.Timesheet;
import org.springframework.data.repository.CrudRepository;

public interface TimesheetRepo extends CrudRepository<Timesheet, Long> {
    Iterable<Timesheet> findByNumberGroup(String filter);
}
