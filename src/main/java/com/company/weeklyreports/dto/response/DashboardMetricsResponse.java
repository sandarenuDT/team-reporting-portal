package com.company.weeklyreports.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class DashboardMetricsResponse {
    private long totalMembers;
    private long submittedThisWeek;
    private long pendingThisWeek;      // not yet started for this week
    private long lateThisWeek;         // draft/needs_correction past week end
    private long needsCorrectionCount;
    private long openBlockersCount;
    private double complianceRatePct;  // submitted+approved / totalMembers, rounded
}