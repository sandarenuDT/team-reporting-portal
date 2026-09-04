package com.company.weeklyreports.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TeamMemberStatusResponse {
    private Long userId;
    private String userName;
    private Long reportId;      // null if no report exists for this week
    private String status;      // DRAFT / SUBMITTED / NEEDS_CORRECTION / APPROVED / NOT_STARTED
}