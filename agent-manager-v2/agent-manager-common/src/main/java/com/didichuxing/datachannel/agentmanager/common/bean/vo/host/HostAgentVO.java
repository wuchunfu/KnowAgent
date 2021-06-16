package com.didichuxing.datachannel.agentmanager.common.bean.vo.host;

import com.didichuxing.datachannel.agentmanager.common.bean.vo.service.ServiceVO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HostAgentVO {

    @ApiModelProperty(value = "主机对象id")
    private Long hostId;

    @ApiModelProperty(value = "Agent对象id")
    private Long agentId;

    @ApiModelProperty(value = "主机名")
    private String hostName;

    @ApiModelProperty(value = "主机ip")
    private String ip;

    @ApiModelProperty(value = "主机类型 0：主机 1：容器")
    private Integer container;

    @ApiModelProperty(value = "承载服务集")
    private List<ServiceVO> serviceList;

    @ApiModelProperty(value = "Agent版本号")
    private String agentVersion;

    @ApiModelProperty(value = "Agent健康度 0：红 1：黄 2：绿")
    private Integer agentHealthLevel;

    @ApiModelProperty(value = "主机所属机器单元")
    private String machineZone;

    @ApiModelProperty(value = "主机所属部门")
    private String department;

    @ApiModelProperty(value = "主机创建时间 格式：unix 13 位时间戳")
    private Long hostCreateTime;

    @ApiModelProperty(value = "针对容器场景，表示容器对应宿主机名")
    private String parentHostName;

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public void setAgentHealthLevel(Integer agentHealthLevel) {
        this.agentHealthLevel = agentHealthLevel;
    }

    public void setMachineZone(String machineZone) {
        this.machineZone = machineZone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setParentHostName(String parentHostName) {
        this.parentHostName = parentHostName;
    }

    public Long getHostId() {
        return hostId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public String getHostName() {
        return hostName;
    }

    public String getIp() {
        return ip;
    }

    public String getAgentVersion() {
        return agentVersion;
    }

    public Integer getAgentHealthLevel() {
        return agentHealthLevel;
    }

    public String getMachineZone() {
        return machineZone;
    }

    public String getDepartment() {
        return department;
    }

    public void setHostCreateTime(Long hostCreateTime) {
        this.hostCreateTime = hostCreateTime;
    }

    public Long getHostCreateTime() {
        return hostCreateTime;
    }

    public String getParentHostName() {
        return parentHostName;
    }

    public Integer getContainer() {
        return container;
    }

    public void setContainer(Integer container) {
        this.container = container;
    }

    public void setServiceList(List<ServiceVO> serviceList) {
        this.serviceList = serviceList;
    }

    public List<ServiceVO> getServiceList() {
        return serviceList;
    }
}
