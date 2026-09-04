package com.company.weeklyreports.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

// Used for BOTH creating a new draft and editing an existing one —
// the full fixed report structure the assignment requires every
// user's report to share, in the same order, with no customization.
@Getter
@Setter
public class ReportContentRequest {

    @NotNull
    private Long projectId;

    @NotNull
    private LocalDate weekStart; // weekEnd is derived (weekStart + 6 days) in the service

    @Valid
    private List<TaskRequest> tasks;

    private String tasksPlannedNextWeek;

    @Valid
    private List<BlockerRequest> blockers;

    @Valid
    private List<AchievementRequest> achievements;

    @Valid
    private List<HoursByTaskTypeRequest> hoursByTaskType; // optional per spec

    private String notes;
}