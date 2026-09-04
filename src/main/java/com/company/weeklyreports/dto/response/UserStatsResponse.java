package com.company.weeklyreports.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

// Backs the "team member profile" page's basic-stats section.
@Getter
@Builder
@AllArgsConstructor
public class UserStatsResponse {
    private long totalReports;
    private long approvedCount;
    private long needsCorrectionCount;
    private double avgPlannedVsActualPct; // average |planned - actual| across all tasks
    private long totalBlockersRaised;
}