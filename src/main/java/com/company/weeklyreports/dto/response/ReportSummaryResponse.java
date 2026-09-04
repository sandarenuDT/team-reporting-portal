package com.company.weeklyreports.dto.response;

import com.company.weeklyreports.entity.ReportStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

// Lightweight row shape for report history tables and the manager
// dashboard's filterable list — avoids loading full nested content.
@Getter
@Builder
@AllArgsConstructor
public class ReportSummaryResponse {
    private Long id;
    private Long userId;
    private String userName;
    private String projectName;
    private LocalDate weekStart;
    private LocalDate weekEnd;
    private ReportStatus status;
}