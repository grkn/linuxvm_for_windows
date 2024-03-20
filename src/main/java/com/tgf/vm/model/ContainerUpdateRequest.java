package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.DeviceMapping;
import com.tgf.vm.model.DeviceRequest;
import com.tgf.vm.model.ResourcesBlkioWeightDeviceInner;
import com.tgf.vm.model.ResourcesUlimitsInner;
import com.tgf.vm.model.RestartPolicy;
import com.tgf.vm.model.ThrottleDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContainerUpdateRequest
 */

@JsonTypeName("ContainerUpdate_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerUpdateRequest {

  private Integer cpuShares;

  private Long memory = 0l;

  private String cgroupParent;

  private Integer blkioWeight;

  @Valid
  private List<@Valid ResourcesBlkioWeightDeviceInner> blkioWeightDevice;

  @Valid
  private List<@Valid ThrottleDevice> blkioDeviceReadBps;

  @Valid
  private List<@Valid ThrottleDevice> blkioDeviceWriteBps;

  @Valid
  private List<@Valid ThrottleDevice> blkioDeviceReadIOps;

  @Valid
  private List<@Valid ThrottleDevice> blkioDeviceWriteIOps;

  private Long cpuPeriod;

  private Long cpuQuota;

  private Long cpuRealtimePeriod;

  private Long cpuRealtimeRuntime;

  private String cpusetCpus;

  private String cpusetMems;

  @Valid
  private List<@Valid DeviceMapping> devices;

  @Valid
  private List<String> deviceCgroupRules;

  @Valid
  private List<@Valid DeviceRequest> deviceRequests;

  private Long kernelMemoryTCP;

  private Long memoryReservation;

  private Long memorySwap;

  private Long memorySwappiness;

  private Long nanoCpus;

  private Boolean oomKillDisable;

  private JsonNullable<Boolean> init = JsonNullable.<Boolean>undefined();

  private JsonNullable<Long> pidsLimit = JsonNullable.<Long>undefined();

  @Valid
  private List<@Valid ResourcesUlimitsInner> ulimits;

  private Long cpuCount;

  private Long cpuPercent;

  private Long ioMaximumIOps;

  private Long ioMaximumBandwidth;

  private RestartPolicy restartPolicy;

  public ContainerUpdateRequest cpuShares(Integer cpuShares) {
    this.cpuShares = cpuShares;
    return this;
  }

  /**
   * An integer value representing this container's relative CPU weight versus other containers. 
   * @return cpuShares
  */
  
  @Schema(name = "CpuShares", description = "An integer value representing this container's relative CPU weight versus other containers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuShares")
  public Integer getCpuShares() {
    return cpuShares;
  }

  public void setCpuShares(Integer cpuShares) {
    this.cpuShares = cpuShares;
  }

  public ContainerUpdateRequest memory(Long memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Memory limit in bytes.
   * @return memory
  */
  
  @Schema(name = "Memory", description = "Memory limit in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Memory")
  public Long getMemory() {
    return memory;
  }

  public void setMemory(Long memory) {
    this.memory = memory;
  }

  public ContainerUpdateRequest cgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
    return this;
  }

  /**
   * Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist. 
   * @return cgroupParent
  */
  
  @Schema(name = "CgroupParent", description = "Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CgroupParent")
  public String getCgroupParent() {
    return cgroupParent;
  }

  public void setCgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
  }

  public ContainerUpdateRequest blkioWeight(Integer blkioWeight) {
    this.blkioWeight = blkioWeight;
    return this;
  }

  /**
   * Block IO weight (relative weight).
   * minimum: 0
   * maximum: 1000
   * @return blkioWeight
  */
  @Min(0) @Max(1000) 
  @Schema(name = "BlkioWeight", description = "Block IO weight (relative weight).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioWeight")
  public Integer getBlkioWeight() {
    return blkioWeight;
  }

  public void setBlkioWeight(Integer blkioWeight) {
    this.blkioWeight = blkioWeight;
  }

  public ContainerUpdateRequest blkioWeightDevice(List<@Valid ResourcesBlkioWeightDeviceInner> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
    return this;
  }

  public ContainerUpdateRequest addBlkioWeightDeviceItem(ResourcesBlkioWeightDeviceInner blkioWeightDeviceItem) {
    if (this.blkioWeightDevice == null) {
      this.blkioWeightDevice = new ArrayList<>();
    }
    this.blkioWeightDevice.add(blkioWeightDeviceItem);
    return this;
  }

  /**
   * Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ``` 
   * @return blkioWeightDevice
  */
  @Valid 
  @Schema(name = "BlkioWeightDevice", description = "Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioWeightDevice")
  public List<@Valid ResourcesBlkioWeightDeviceInner> getBlkioWeightDevice() {
    return blkioWeightDevice;
  }

  public void setBlkioWeightDevice(List<@Valid ResourcesBlkioWeightDeviceInner> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
  }

  public ContainerUpdateRequest blkioDeviceReadBps(List<@Valid ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
    return this;
  }

  public ContainerUpdateRequest addBlkioDeviceReadBpsItem(ThrottleDevice blkioDeviceReadBpsItem) {
    if (this.blkioDeviceReadBps == null) {
      this.blkioDeviceReadBps = new ArrayList<>();
    }
    this.blkioDeviceReadBps.add(blkioDeviceReadBpsItem);
    return this;
  }

  /**
   * Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceReadBps
  */
  @Valid 
  @Schema(name = "BlkioDeviceReadBps", description = "Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioDeviceReadBps")
  public List<@Valid ThrottleDevice> getBlkioDeviceReadBps() {
    return blkioDeviceReadBps;
  }

  public void setBlkioDeviceReadBps(List<@Valid ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
  }

  public ContainerUpdateRequest blkioDeviceWriteBps(List<@Valid ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    return this;
  }

  public ContainerUpdateRequest addBlkioDeviceWriteBpsItem(ThrottleDevice blkioDeviceWriteBpsItem) {
    if (this.blkioDeviceWriteBps == null) {
      this.blkioDeviceWriteBps = new ArrayList<>();
    }
    this.blkioDeviceWriteBps.add(blkioDeviceWriteBpsItem);
    return this;
  }

  /**
   * Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceWriteBps
  */
  @Valid 
  @Schema(name = "BlkioDeviceWriteBps", description = "Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioDeviceWriteBps")
  public List<@Valid ThrottleDevice> getBlkioDeviceWriteBps() {
    return blkioDeviceWriteBps;
  }

  public void setBlkioDeviceWriteBps(List<@Valid ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
  }

  public ContainerUpdateRequest blkioDeviceReadIOps(List<@Valid ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    return this;
  }

  public ContainerUpdateRequest addBlkioDeviceReadIOpsItem(ThrottleDevice blkioDeviceReadIOpsItem) {
    if (this.blkioDeviceReadIOps == null) {
      this.blkioDeviceReadIOps = new ArrayList<>();
    }
    this.blkioDeviceReadIOps.add(blkioDeviceReadIOpsItem);
    return this;
  }

  /**
   * Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceReadIOps
  */
  @Valid 
  @Schema(name = "BlkioDeviceReadIOps", description = "Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioDeviceReadIOps")
  public List<@Valid ThrottleDevice> getBlkioDeviceReadIOps() {
    return blkioDeviceReadIOps;
  }

  public void setBlkioDeviceReadIOps(List<@Valid ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
  }

  public ContainerUpdateRequest blkioDeviceWriteIOps(List<@Valid ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    return this;
  }

  public ContainerUpdateRequest addBlkioDeviceWriteIOpsItem(ThrottleDevice blkioDeviceWriteIOpsItem) {
    if (this.blkioDeviceWriteIOps == null) {
      this.blkioDeviceWriteIOps = new ArrayList<>();
    }
    this.blkioDeviceWriteIOps.add(blkioDeviceWriteIOpsItem);
    return this;
  }

  /**
   * Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceWriteIOps
  */
  @Valid 
  @Schema(name = "BlkioDeviceWriteIOps", description = "Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlkioDeviceWriteIOps")
  public List<@Valid ThrottleDevice> getBlkioDeviceWriteIOps() {
    return blkioDeviceWriteIOps;
  }

  public void setBlkioDeviceWriteIOps(List<@Valid ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
  }

  public ContainerUpdateRequest cpuPeriod(Long cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
    return this;
  }

  /**
   * The length of a CPU period in microseconds.
   * @return cpuPeriod
  */
  
  @Schema(name = "CpuPeriod", description = "The length of a CPU period in microseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuPeriod")
  public Long getCpuPeriod() {
    return cpuPeriod;
  }

  public void setCpuPeriod(Long cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
  }

  public ContainerUpdateRequest cpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
    return this;
  }

  /**
   * Microseconds of CPU time that the container can get in a CPU period. 
   * @return cpuQuota
  */
  
  @Schema(name = "CpuQuota", description = "Microseconds of CPU time that the container can get in a CPU period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuQuota")
  public Long getCpuQuota() {
    return cpuQuota;
  }

  public void setCpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
  }

  public ContainerUpdateRequest cpuRealtimePeriod(Long cpuRealtimePeriod) {
    this.cpuRealtimePeriod = cpuRealtimePeriod;
    return this;
  }

  /**
   * The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks. 
   * @return cpuRealtimePeriod
  */
  
  @Schema(name = "CpuRealtimePeriod", description = "The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuRealtimePeriod")
  public Long getCpuRealtimePeriod() {
    return cpuRealtimePeriod;
  }

  public void setCpuRealtimePeriod(Long cpuRealtimePeriod) {
    this.cpuRealtimePeriod = cpuRealtimePeriod;
  }

  public ContainerUpdateRequest cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
    this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    return this;
  }

  /**
   * The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks. 
   * @return cpuRealtimeRuntime
  */
  
  @Schema(name = "CpuRealtimeRuntime", description = "The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuRealtimeRuntime")
  public Long getCpuRealtimeRuntime() {
    return cpuRealtimeRuntime;
  }

  public void setCpuRealtimeRuntime(Long cpuRealtimeRuntime) {
    this.cpuRealtimeRuntime = cpuRealtimeRuntime;
  }

  public ContainerUpdateRequest cpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
    return this;
  }

  /**
   * CPUs in which to allow execution (e.g., `0-3`, `0,1`). 
   * @return cpusetCpus
  */
  
  @Schema(name = "CpusetCpus", example = "0-3", description = "CPUs in which to allow execution (e.g., `0-3`, `0,1`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpusetCpus")
  public String getCpusetCpus() {
    return cpusetCpus;
  }

  public void setCpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
  }

  public ContainerUpdateRequest cpusetMems(String cpusetMems) {
    this.cpusetMems = cpusetMems;
    return this;
  }

  /**
   * Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems. 
   * @return cpusetMems
  */
  
  @Schema(name = "CpusetMems", description = "Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpusetMems")
  public String getCpusetMems() {
    return cpusetMems;
  }

  public void setCpusetMems(String cpusetMems) {
    this.cpusetMems = cpusetMems;
  }

  public ContainerUpdateRequest devices(List<@Valid DeviceMapping> devices) {
    this.devices = devices;
    return this;
  }

  public ContainerUpdateRequest addDevicesItem(DeviceMapping devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * A list of devices to add to the container.
   * @return devices
  */
  @Valid 
  @Schema(name = "Devices", description = "A list of devices to add to the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Devices")
  public List<@Valid DeviceMapping> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid DeviceMapping> devices) {
    this.devices = devices;
  }

  public ContainerUpdateRequest deviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
    return this;
  }

  public ContainerUpdateRequest addDeviceCgroupRulesItem(String deviceCgroupRulesItem) {
    if (this.deviceCgroupRules == null) {
      this.deviceCgroupRules = new ArrayList<>();
    }
    this.deviceCgroupRules.add(deviceCgroupRulesItem);
    return this;
  }

  /**
   * a list of cgroup rules to apply to the container
   * @return deviceCgroupRules
  */
  
  @Schema(name = "DeviceCgroupRules", description = "a list of cgroup rules to apply to the container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceCgroupRules")
  public List<String> getDeviceCgroupRules() {
    return deviceCgroupRules;
  }

  public void setDeviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
  }

  public ContainerUpdateRequest deviceRequests(List<@Valid DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
    return this;
  }

  public ContainerUpdateRequest addDeviceRequestsItem(DeviceRequest deviceRequestsItem) {
    if (this.deviceRequests == null) {
      this.deviceRequests = new ArrayList<>();
    }
    this.deviceRequests.add(deviceRequestsItem);
    return this;
  }

  /**
   * A list of requests for devices to be sent to device drivers. 
   * @return deviceRequests
  */
  @Valid 
  @Schema(name = "DeviceRequests", description = "A list of requests for devices to be sent to device drivers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceRequests")
  public List<@Valid DeviceRequest> getDeviceRequests() {
    return deviceRequests;
  }

  public void setDeviceRequests(List<@Valid DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
  }

  public ContainerUpdateRequest kernelMemoryTCP(Long kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
    return this;
  }

  /**
   * Hard limit for kernel TCP buffer memory (in bytes). Depending on the OCI runtime in use, this option may be ignored. It is no longer supported by the default (runc) runtime.  This field is omitted when empty. 
   * @return kernelMemoryTCP
  */
  
  @Schema(name = "KernelMemoryTCP", description = "Hard limit for kernel TCP buffer memory (in bytes). Depending on the OCI runtime in use, this option may be ignored. It is no longer supported by the default (runc) runtime.  This field is omitted when empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KernelMemoryTCP")
  public Long getKernelMemoryTCP() {
    return kernelMemoryTCP;
  }

  public void setKernelMemoryTCP(Long kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
  }

  public ContainerUpdateRequest memoryReservation(Long memoryReservation) {
    this.memoryReservation = memoryReservation;
    return this;
  }

  /**
   * Memory soft limit in bytes.
   * @return memoryReservation
  */
  
  @Schema(name = "MemoryReservation", description = "Memory soft limit in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemoryReservation")
  public Long getMemoryReservation() {
    return memoryReservation;
  }

  public void setMemoryReservation(Long memoryReservation) {
    this.memoryReservation = memoryReservation;
  }

  public ContainerUpdateRequest memorySwap(Long memorySwap) {
    this.memorySwap = memorySwap;
    return this;
  }

  /**
   * Total memory limit (memory + swap). Set as `-1` to enable unlimited swap. 
   * @return memorySwap
  */
  
  @Schema(name = "MemorySwap", description = "Total memory limit (memory + swap). Set as `-1` to enable unlimited swap. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemorySwap")
  public Long getMemorySwap() {
    return memorySwap;
  }

  public void setMemorySwap(Long memorySwap) {
    this.memorySwap = memorySwap;
  }

  public ContainerUpdateRequest memorySwappiness(Long memorySwappiness) {
    this.memorySwappiness = memorySwappiness;
    return this;
  }

  /**
   * Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100. 
   * minimum: 0
   * maximum: 100
   * @return memorySwappiness
  */
  @Min(0L) @Max(100L) 
  @Schema(name = "MemorySwappiness", description = "Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemorySwappiness")
  public Long getMemorySwappiness() {
    return memorySwappiness;
  }

  public void setMemorySwappiness(Long memorySwappiness) {
    this.memorySwappiness = memorySwappiness;
  }

  public ContainerUpdateRequest nanoCpus(Long nanoCpus) {
    this.nanoCpus = nanoCpus;
    return this;
  }

  /**
   * CPU quota in units of 10<sup>-9</sup> CPUs.
   * @return nanoCpus
  */
  
  @Schema(name = "NanoCpus", description = "CPU quota in units of 10<sup>-9</sup> CPUs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NanoCpus")
  public Long getNanoCpus() {
    return nanoCpus;
  }

  public void setNanoCpus(Long nanoCpus) {
    this.nanoCpus = nanoCpus;
  }

  public ContainerUpdateRequest oomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
    return this;
  }

  /**
   * Disable OOM Killer for the container.
   * @return oomKillDisable
  */
  
  @Schema(name = "OomKillDisable", description = "Disable OOM Killer for the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OomKillDisable")
  public Boolean getOomKillDisable() {
    return oomKillDisable;
  }

  public void setOomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
  }

  public ContainerUpdateRequest init(Boolean init) {
    this.init = JsonNullable.of(init);
    return this;
  }

  /**
   * Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. 
   * @return init
  */
  
  @Schema(name = "Init", description = "Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Init")
  public JsonNullable<Boolean> getInit() {
    return init;
  }

  public void setInit(JsonNullable<Boolean> init) {
    this.init = init;
  }

  public ContainerUpdateRequest pidsLimit(Long pidsLimit) {
    this.pidsLimit = JsonNullable.of(pidsLimit);
    return this;
  }

  /**
   * Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change. 
   * @return pidsLimit
  */
  
  @Schema(name = "PidsLimit", description = "Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PidsLimit")
  public JsonNullable<Long> getPidsLimit() {
    return pidsLimit;
  }

  public void setPidsLimit(JsonNullable<Long> pidsLimit) {
    this.pidsLimit = pidsLimit;
  }

  public ContainerUpdateRequest ulimits(List<@Valid ResourcesUlimitsInner> ulimits) {
    this.ulimits = ulimits;
    return this;
  }

  public ContainerUpdateRequest addUlimitsItem(ResourcesUlimitsInner ulimitsItem) {
    if (this.ulimits == null) {
      this.ulimits = new ArrayList<>();
    }
    this.ulimits.add(ulimitsItem);
    return this;
  }

  /**
   * A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ``` 
   * @return ulimits
  */
  @Valid 
  @Schema(name = "Ulimits", description = "A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ulimits")
  public List<@Valid ResourcesUlimitsInner> getUlimits() {
    return ulimits;
  }

  public void setUlimits(List<@Valid ResourcesUlimitsInner> ulimits) {
    this.ulimits = ulimits;
  }

  public ContainerUpdateRequest cpuCount(Long cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. 
   * @return cpuCount
  */
  
  @Schema(name = "CpuCount", description = "The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuCount")
  public Long getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Long cpuCount) {
    this.cpuCount = cpuCount;
  }

  public ContainerUpdateRequest cpuPercent(Long cpuPercent) {
    this.cpuPercent = cpuPercent;
    return this;
  }

  /**
   * The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. 
   * @return cpuPercent
  */
  
  @Schema(name = "CpuPercent", description = "The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuPercent")
  public Long getCpuPercent() {
    return cpuPercent;
  }

  public void setCpuPercent(Long cpuPercent) {
    this.cpuPercent = cpuPercent;
  }

  public ContainerUpdateRequest ioMaximumIOps(Long ioMaximumIOps) {
    this.ioMaximumIOps = ioMaximumIOps;
    return this;
  }

  /**
   * Maximum IOps for the container system drive (Windows only)
   * @return ioMaximumIOps
  */
  
  @Schema(name = "IOMaximumIOps", description = "Maximum IOps for the container system drive (Windows only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IOMaximumIOps")
  public Long getIoMaximumIOps() {
    return ioMaximumIOps;
  }

  public void setIoMaximumIOps(Long ioMaximumIOps) {
    this.ioMaximumIOps = ioMaximumIOps;
  }

  public ContainerUpdateRequest ioMaximumBandwidth(Long ioMaximumBandwidth) {
    this.ioMaximumBandwidth = ioMaximumBandwidth;
    return this;
  }

  /**
   * Maximum IO in bytes per second for the container system drive (Windows only). 
   * @return ioMaximumBandwidth
  */
  
  @Schema(name = "IOMaximumBandwidth", description = "Maximum IO in bytes per second for the container system drive (Windows only). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IOMaximumBandwidth")
  public Long getIoMaximumBandwidth() {
    return ioMaximumBandwidth;
  }

  public void setIoMaximumBandwidth(Long ioMaximumBandwidth) {
    this.ioMaximumBandwidth = ioMaximumBandwidth;
  }

  public ContainerUpdateRequest restartPolicy(RestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Get restartPolicy
   * @return restartPolicy
  */
  @Valid 
  @Schema(name = "RestartPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestartPolicy")
  public RestartPolicy getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(RestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerUpdateRequest containerUpdateRequest = (ContainerUpdateRequest) o;
    return Objects.equals(this.cpuShares, containerUpdateRequest.cpuShares) &&
        Objects.equals(this.memory, containerUpdateRequest.memory) &&
        Objects.equals(this.cgroupParent, containerUpdateRequest.cgroupParent) &&
        Objects.equals(this.blkioWeight, containerUpdateRequest.blkioWeight) &&
        Objects.equals(this.blkioWeightDevice, containerUpdateRequest.blkioWeightDevice) &&
        Objects.equals(this.blkioDeviceReadBps, containerUpdateRequest.blkioDeviceReadBps) &&
        Objects.equals(this.blkioDeviceWriteBps, containerUpdateRequest.blkioDeviceWriteBps) &&
        Objects.equals(this.blkioDeviceReadIOps, containerUpdateRequest.blkioDeviceReadIOps) &&
        Objects.equals(this.blkioDeviceWriteIOps, containerUpdateRequest.blkioDeviceWriteIOps) &&
        Objects.equals(this.cpuPeriod, containerUpdateRequest.cpuPeriod) &&
        Objects.equals(this.cpuQuota, containerUpdateRequest.cpuQuota) &&
        Objects.equals(this.cpuRealtimePeriod, containerUpdateRequest.cpuRealtimePeriod) &&
        Objects.equals(this.cpuRealtimeRuntime, containerUpdateRequest.cpuRealtimeRuntime) &&
        Objects.equals(this.cpusetCpus, containerUpdateRequest.cpusetCpus) &&
        Objects.equals(this.cpusetMems, containerUpdateRequest.cpusetMems) &&
        Objects.equals(this.devices, containerUpdateRequest.devices) &&
        Objects.equals(this.deviceCgroupRules, containerUpdateRequest.deviceCgroupRules) &&
        Objects.equals(this.deviceRequests, containerUpdateRequest.deviceRequests) &&
        Objects.equals(this.kernelMemoryTCP, containerUpdateRequest.kernelMemoryTCP) &&
        Objects.equals(this.memoryReservation, containerUpdateRequest.memoryReservation) &&
        Objects.equals(this.memorySwap, containerUpdateRequest.memorySwap) &&
        Objects.equals(this.memorySwappiness, containerUpdateRequest.memorySwappiness) &&
        Objects.equals(this.nanoCpus, containerUpdateRequest.nanoCpus) &&
        Objects.equals(this.oomKillDisable, containerUpdateRequest.oomKillDisable) &&
        equalsNullable(this.init, containerUpdateRequest.init) &&
        equalsNullable(this.pidsLimit, containerUpdateRequest.pidsLimit) &&
        Objects.equals(this.ulimits, containerUpdateRequest.ulimits) &&
        Objects.equals(this.cpuCount, containerUpdateRequest.cpuCount) &&
        Objects.equals(this.cpuPercent, containerUpdateRequest.cpuPercent) &&
        Objects.equals(this.ioMaximumIOps, containerUpdateRequest.ioMaximumIOps) &&
        Objects.equals(this.ioMaximumBandwidth, containerUpdateRequest.ioMaximumBandwidth) &&
        Objects.equals(this.restartPolicy, containerUpdateRequest.restartPolicy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, hashCodeNullable(init), hashCodeNullable(pidsLimit), ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth, restartPolicy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerUpdateRequest {\n");
    sb.append("    cpuShares: ").append(toIndentedString(cpuShares)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cgroupParent: ").append(toIndentedString(cgroupParent)).append("\n");
    sb.append("    blkioWeight: ").append(toIndentedString(blkioWeight)).append("\n");
    sb.append("    blkioWeightDevice: ").append(toIndentedString(blkioWeightDevice)).append("\n");
    sb.append("    blkioDeviceReadBps: ").append(toIndentedString(blkioDeviceReadBps)).append("\n");
    sb.append("    blkioDeviceWriteBps: ").append(toIndentedString(blkioDeviceWriteBps)).append("\n");
    sb.append("    blkioDeviceReadIOps: ").append(toIndentedString(blkioDeviceReadIOps)).append("\n");
    sb.append("    blkioDeviceWriteIOps: ").append(toIndentedString(blkioDeviceWriteIOps)).append("\n");
    sb.append("    cpuPeriod: ").append(toIndentedString(cpuPeriod)).append("\n");
    sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
    sb.append("    cpuRealtimePeriod: ").append(toIndentedString(cpuRealtimePeriod)).append("\n");
    sb.append("    cpuRealtimeRuntime: ").append(toIndentedString(cpuRealtimeRuntime)).append("\n");
    sb.append("    cpusetCpus: ").append(toIndentedString(cpusetCpus)).append("\n");
    sb.append("    cpusetMems: ").append(toIndentedString(cpusetMems)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    deviceCgroupRules: ").append(toIndentedString(deviceCgroupRules)).append("\n");
    sb.append("    deviceRequests: ").append(toIndentedString(deviceRequests)).append("\n");
    sb.append("    kernelMemoryTCP: ").append(toIndentedString(kernelMemoryTCP)).append("\n");
    sb.append("    memoryReservation: ").append(toIndentedString(memoryReservation)).append("\n");
    sb.append("    memorySwap: ").append(toIndentedString(memorySwap)).append("\n");
    sb.append("    memorySwappiness: ").append(toIndentedString(memorySwappiness)).append("\n");
    sb.append("    nanoCpus: ").append(toIndentedString(nanoCpus)).append("\n");
    sb.append("    oomKillDisable: ").append(toIndentedString(oomKillDisable)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    pidsLimit: ").append(toIndentedString(pidsLimit)).append("\n");
    sb.append("    ulimits: ").append(toIndentedString(ulimits)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
    sb.append("    ioMaximumIOps: ").append(toIndentedString(ioMaximumIOps)).append("\n");
    sb.append("    ioMaximumBandwidth: ").append(toIndentedString(ioMaximumBandwidth)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

