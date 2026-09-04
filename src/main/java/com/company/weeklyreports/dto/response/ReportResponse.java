package com.company.weeklyreports.dto.response;

import com.company.weeklyreports.entity.ReportStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

// Full detail view — used by both team member (own report) and
// manager (report detail / review page).
@Getter
@Builder
@AllArgsConstructor
public class ReportResponse {
    private Long id;
    private Long userId;
    private String userName;
    private Long projectId;
    private String projectName;
    private LocalDate weekStart;
    private LocalDate weekEnd;
    private ReportStatus status;
    private String latestReviewerComment; // convenience field for quick display
    private ReportVersionResponse currentVersion;
}