package com.spring.model.commonrequest;

import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ActivityLogs {

    public String companyId;
    public String userId;
    public Integer userType;
    public Integer logType;
    public String title;
    public String description;
    public String ipAddress;
    public Map<String, Object> deviceInfo;
    public Map<String, Object> metaData;
    public Long lat;
    public Long lng;
}