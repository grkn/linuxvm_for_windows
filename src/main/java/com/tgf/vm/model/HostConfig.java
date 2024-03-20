package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.DeviceMapping;
import com.tgf.vm.model.DeviceRequest;
import com.tgf.vm.model.HostConfigAllOfLogConfig;
import com.tgf.vm.model.Mount;
import com.tgf.vm.model.PortBinding;
import com.tgf.vm.model.ResourcesBlkioWeightDeviceInner;
import com.tgf.vm.model.ResourcesUlimitsInner;
import com.tgf.vm.model.RestartPolicy;
import com.tgf.vm.model.ThrottleDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Container configuration that depends on the host we are running on
 */

@Schema(name = "HostConfig", description = "Container configuration that depends on the host we are running on")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class HostConfig {

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

  @Valid
  private List<String> binds;

  private String containerIDFile;

  private HostConfigAllOfLogConfig logConfig;

  private String networkMode;

  @Valid
  private Map<String, List<@Valid PortBinding>> portBindings = new HashMap<>();

  private RestartPolicy restartPolicy;

  private Boolean autoRemove;

  private String volumeDriver;

  @Valid
  private List<String> volumesFrom;

  @Valid
  private List<@Valid Mount> mounts;

  @Valid
  private JsonNullable<List<@Min(0)Integer>> consoleSize = JsonNullable.<List<@Min(0)Integer>>undefined();

  @Valid
  private Map<String, String> annotations = new HashMap<>();

  @Valid
  private List<String> capAdd;

  @Valid
  private List<String> capDrop;

  /**
   * cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. 
   */
  public enum CgroupnsModeEnum {
    PRIVATE("private"),
    
    HOST("host");

    private String value;

    CgroupnsModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CgroupnsModeEnum fromValue(String value) {
      for (CgroupnsModeEnum b : CgroupnsModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CgroupnsModeEnum cgroupnsMode;

  @Valid
  private List<String> dns;

  @Valid
  private List<String> dnsOptions;

  @Valid
  private List<String> dnsSearch;

  @Valid
  private List<String> extraHosts;

  @Valid
  private List<String> groupAdd;

  private String ipcMode;

  private String cgroup;

  @Valid
  private List<String> links;

  private Integer oomScoreAdj;

  private String pidMode;

  private Boolean privileged;

  private Boolean publishAllPorts;

  private Boolean readonlyRootfs;

  @Valid
  private List<String> securityOpt;

  @Valid
  private Map<String, String> storageOpt = new HashMap<>();

  @Valid
  private Map<String, String> tmpfs = new HashMap<>();

  private String utSMode;

  private String usernsMode;

  private Long shmSize;

  @Valid
  private Map<String, String> sysctls = new HashMap<>();

  private String runtime;

  /**
   * Isolation technology of the container. (Windows only) 
   */
  public enum IsolationEnum {
    DEFAULT("default"),
    
    PROCESS("process"),
    
    HYPERV("hyperv");

    private String value;

    IsolationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsolationEnum fromValue(String value) {
      for (IsolationEnum b : IsolationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IsolationEnum isolation;

  @Valid
  private List<String> maskedPaths;

  @Valid
  private List<String> readonlyPaths;

  public HostConfig cpuShares(Integer cpuShares) {
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

  public HostConfig memory(Long memory) {
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

  public HostConfig cgroupParent(String cgroupParent) {
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

  public HostConfig blkioWeight(Integer blkioWeight) {
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

  public HostConfig blkioWeightDevice(List<@Valid ResourcesBlkioWeightDeviceInner> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
    return this;
  }

  public HostConfig addBlkioWeightDeviceItem(ResourcesBlkioWeightDeviceInner blkioWeightDeviceItem) {
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

  public HostConfig blkioDeviceReadBps(List<@Valid ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
    return this;
  }

  public HostConfig addBlkioDeviceReadBpsItem(ThrottleDevice blkioDeviceReadBpsItem) {
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

  public HostConfig blkioDeviceWriteBps(List<@Valid ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    return this;
  }

  public HostConfig addBlkioDeviceWriteBpsItem(ThrottleDevice blkioDeviceWriteBpsItem) {
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

  public HostConfig blkioDeviceReadIOps(List<@Valid ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    return this;
  }

  public HostConfig addBlkioDeviceReadIOpsItem(ThrottleDevice blkioDeviceReadIOpsItem) {
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

  public HostConfig blkioDeviceWriteIOps(List<@Valid ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    return this;
  }

  public HostConfig addBlkioDeviceWriteIOpsItem(ThrottleDevice blkioDeviceWriteIOpsItem) {
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

  public HostConfig cpuPeriod(Long cpuPeriod) {
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

  public HostConfig cpuQuota(Long cpuQuota) {
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

  public HostConfig cpuRealtimePeriod(Long cpuRealtimePeriod) {
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

  public HostConfig cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
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

  public HostConfig cpusetCpus(String cpusetCpus) {
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

  public HostConfig cpusetMems(String cpusetMems) {
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

  public HostConfig devices(List<@Valid DeviceMapping> devices) {
    this.devices = devices;
    return this;
  }

  public HostConfig addDevicesItem(DeviceMapping devicesItem) {
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

  public HostConfig deviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
    return this;
  }

  public HostConfig addDeviceCgroupRulesItem(String deviceCgroupRulesItem) {
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

  public HostConfig deviceRequests(List<@Valid DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
    return this;
  }

  public HostConfig addDeviceRequestsItem(DeviceRequest deviceRequestsItem) {
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

  public HostConfig kernelMemoryTCP(Long kernelMemoryTCP) {
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

  public HostConfig memoryReservation(Long memoryReservation) {
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

  public HostConfig memorySwap(Long memorySwap) {
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

  public HostConfig memorySwappiness(Long memorySwappiness) {
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

  public HostConfig nanoCpus(Long nanoCpus) {
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

  public HostConfig oomKillDisable(Boolean oomKillDisable) {
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

  public HostConfig init(Boolean init) {
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

  public HostConfig pidsLimit(Long pidsLimit) {
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

  public HostConfig ulimits(List<@Valid ResourcesUlimitsInner> ulimits) {
    this.ulimits = ulimits;
    return this;
  }

  public HostConfig addUlimitsItem(ResourcesUlimitsInner ulimitsItem) {
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

  public HostConfig cpuCount(Long cpuCount) {
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

  public HostConfig cpuPercent(Long cpuPercent) {
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

  public HostConfig ioMaximumIOps(Long ioMaximumIOps) {
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

  public HostConfig ioMaximumBandwidth(Long ioMaximumBandwidth) {
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

  public HostConfig binds(List<String> binds) {
    this.binds = binds;
    return this;
  }

  public HostConfig addBindsItem(String bindsItem) {
    if (this.binds == null) {
      this.binds = new ArrayList<>();
    }
    this.binds.add(bindsItem);
    return this;
  }

  /**
   * A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - `host-src:container-dest[:options]` to bind-mount a host path   into the container. Both `host-src`, and `container-dest` must   be an _absolute_ path. - `volume-name:container-dest[:options]` to bind-mount a volume   managed by a volume driver into the container. `container-dest`   must be an _absolute_ path.  `options` is an optional, comma-delimited list of:  - `nocopy` disables automatic copying of data from the container   path to the volume. The `nocopy` flag only applies to named volumes. - `[ro|rw]` mounts a volume read-only or read-write, respectively.   If omitted or set to `rw`, volumes are mounted read-write. - `[z|Z]` applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - `z`: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - `Z`: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container's processes from using the content. By       default, the labels set by the host operating system are not       modified. - `[[r]shared|[r]slave|[r]private]` specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to `shared`.   For slave volumes, the mount must be set to either `shared` or   `slave`. 
   * @return binds
  */
  
  @Schema(name = "Binds", description = "A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - `host-src:container-dest[:options]` to bind-mount a host path   into the container. Both `host-src`, and `container-dest` must   be an _absolute_ path. - `volume-name:container-dest[:options]` to bind-mount a volume   managed by a volume driver into the container. `container-dest`   must be an _absolute_ path.  `options` is an optional, comma-delimited list of:  - `nocopy` disables automatic copying of data from the container   path to the volume. The `nocopy` flag only applies to named volumes. - `[ro|rw]` mounts a volume read-only or read-write, respectively.   If omitted or set to `rw`, volumes are mounted read-write. - `[z|Z]` applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - `z`: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - `Z`: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container's processes from using the content. By       default, the labels set by the host operating system are not       modified. - `[[r]shared|[r]slave|[r]private]` specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to `shared`.   For slave volumes, the mount must be set to either `shared` or   `slave`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Binds")
  public List<String> getBinds() {
    return binds;
  }

  public void setBinds(List<String> binds) {
    this.binds = binds;
  }

  public HostConfig containerIDFile(String containerIDFile) {
    this.containerIDFile = containerIDFile;
    return this;
  }

  /**
   * Path to a file where the container ID is written
   * @return containerIDFile
  */
  
  @Schema(name = "ContainerIDFile", description = "Path to a file where the container ID is written", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerIDFile")
  public String getContainerIDFile() {
    return containerIDFile;
  }

  public void setContainerIDFile(String containerIDFile) {
    this.containerIDFile = containerIDFile;
  }

  public HostConfig logConfig(HostConfigAllOfLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Get logConfig
   * @return logConfig
  */
  @Valid 
  @Schema(name = "LogConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogConfig")
  public HostConfigAllOfLogConfig getLogConfig() {
    return logConfig;
  }

  public void setLogConfig(HostConfigAllOfLogConfig logConfig) {
    this.logConfig = logConfig;
  }

  public HostConfig networkMode(String networkMode) {
    this.networkMode = networkMode;
    return this;
  }

  /**
   * Network mode to use for this container. Supported standard values are: `bridge`, `host`, `none`, and `container:<name|id>`. Any other value is taken as a custom network's name to which this container should connect to. 
   * @return networkMode
  */
  
  @Schema(name = "NetworkMode", description = "Network mode to use for this container. Supported standard values are: `bridge`, `host`, `none`, and `container:<name|id>`. Any other value is taken as a custom network's name to which this container should connect to. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkMode")
  public String getNetworkMode() {
    return networkMode;
  }

  public void setNetworkMode(String networkMode) {
    this.networkMode = networkMode;
  }

  public HostConfig portBindings(Map<String, List<@Valid PortBinding>> portBindings) {
    this.portBindings = portBindings;
    return this;
  }

  public HostConfig putPortBindingsItem(String key, List<@Valid PortBinding> portBindingsItem) {
    if (this.portBindings == null) {
      this.portBindings = new HashMap<>();
    }
    this.portBindings.put(key, portBindingsItem);
    return this;
  }

  /**
   * PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. 
   * @return portBindings
  */
  @Valid 
  @Schema(name = "PortBindings", example = "{443/tcp=[{HostIp=127.0.0.1, HostPort=4443}], 80/tcp=[{HostIp=0.0.0.0, HostPort=80}, {HostIp=0.0.0.0, HostPort=8080}], 80/udp=[{HostIp=0.0.0.0, HostPort=80}], 53/udp=[{HostIp=0.0.0.0, HostPort=53}]}", description = "PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PortBindings")
  public Map<String, List<@Valid PortBinding>> getPortBindings() {
    return portBindings;
  }

  public void setPortBindings(Map<String, List<@Valid PortBinding>> portBindings) {
    this.portBindings = portBindings;
  }

  public HostConfig restartPolicy(RestartPolicy restartPolicy) {
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

  public HostConfig autoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
    return this;
  }

  /**
   * Automatically remove the container when the container's process exits. This has no effect if `RestartPolicy` is set. 
   * @return autoRemove
  */
  
  @Schema(name = "AutoRemove", description = "Automatically remove the container when the container's process exits. This has no effect if `RestartPolicy` is set. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoRemove")
  public Boolean getAutoRemove() {
    return autoRemove;
  }

  public void setAutoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
  }

  public HostConfig volumeDriver(String volumeDriver) {
    this.volumeDriver = volumeDriver;
    return this;
  }

  /**
   * Driver that this container uses to mount volumes.
   * @return volumeDriver
  */
  
  @Schema(name = "VolumeDriver", description = "Driver that this container uses to mount volumes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumeDriver")
  public String getVolumeDriver() {
    return volumeDriver;
  }

  public void setVolumeDriver(String volumeDriver) {
    this.volumeDriver = volumeDriver;
  }

  public HostConfig volumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
    return this;
  }

  public HostConfig addVolumesFromItem(String volumesFromItem) {
    if (this.volumesFrom == null) {
      this.volumesFrom = new ArrayList<>();
    }
    this.volumesFrom.add(volumesFromItem);
    return this;
  }

  /**
   * A list of volumes to inherit from another container, specified in the form `<container name>[:<ro|rw>]`. 
   * @return volumesFrom
  */
  
  @Schema(name = "VolumesFrom", description = "A list of volumes to inherit from another container, specified in the form `<container name>[:<ro|rw>]`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumesFrom")
  public List<String> getVolumesFrom() {
    return volumesFrom;
  }

  public void setVolumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
  }

  public HostConfig mounts(List<@Valid Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public HostConfig addMountsItem(Mount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Specification for mounts to be added to the container. 
   * @return mounts
  */
  @Valid 
  @Schema(name = "Mounts", description = "Specification for mounts to be added to the container. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mounts")
  public List<@Valid Mount> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid Mount> mounts) {
    this.mounts = mounts;
  }

  public HostConfig consoleSize(List<@Min(0)Integer> consoleSize) {
    this.consoleSize = JsonNullable.of(consoleSize);
    return this;
  }

  public HostConfig addConsoleSizeItem(Integer consoleSizeItem) {
    if (this.consoleSize == null || !this.consoleSize.isPresent()) {
      this.consoleSize = JsonNullable.of(new ArrayList<>());
    }
    this.consoleSize.get().add(consoleSizeItem);
    return this;
  }

  /**
   * Initial console size, as an `[height, width]` array. 
   * @return consoleSize
  */
  @Size(min = 2, max = 2) 
  @Schema(name = "ConsoleSize", description = "Initial console size, as an `[height, width]` array. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConsoleSize")
  public JsonNullable<List<@Min(0)Integer>> getConsoleSize() {
    return consoleSize;
  }

  public void setConsoleSize(JsonNullable<List<@Min(0)Integer>> consoleSize) {
    this.consoleSize = consoleSize;
  }

  public HostConfig annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public HostConfig putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Arbitrary non-identifying metadata attached to container and provided to the runtime when the container is started. 
   * @return annotations
  */
  
  @Schema(name = "Annotations", description = "Arbitrary non-identifying metadata attached to container and provided to the runtime when the container is started. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public HostConfig capAdd(List<String> capAdd) {
    this.capAdd = capAdd;
    return this;
  }

  public HostConfig addCapAddItem(String capAddItem) {
    if (this.capAdd == null) {
      this.capAdd = new ArrayList<>();
    }
    this.capAdd.add(capAddItem);
    return this;
  }

  /**
   * A list of kernel capabilities to add to the container. Conflicts with option 'Capabilities'. 
   * @return capAdd
  */
  
  @Schema(name = "CapAdd", description = "A list of kernel capabilities to add to the container. Conflicts with option 'Capabilities'. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CapAdd")
  public List<String> getCapAdd() {
    return capAdd;
  }

  public void setCapAdd(List<String> capAdd) {
    this.capAdd = capAdd;
  }

  public HostConfig capDrop(List<String> capDrop) {
    this.capDrop = capDrop;
    return this;
  }

  public HostConfig addCapDropItem(String capDropItem) {
    if (this.capDrop == null) {
      this.capDrop = new ArrayList<>();
    }
    this.capDrop.add(capDropItem);
    return this;
  }

  /**
   * A list of kernel capabilities to drop from the container. Conflicts with option 'Capabilities'. 
   * @return capDrop
  */
  
  @Schema(name = "CapDrop", description = "A list of kernel capabilities to drop from the container. Conflicts with option 'Capabilities'. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CapDrop")
  public List<String> getCapDrop() {
    return capDrop;
  }

  public void setCapDrop(List<String> capDrop) {
    this.capDrop = capDrop;
  }

  public HostConfig cgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
    this.cgroupnsMode = cgroupnsMode;
    return this;
  }

  /**
   * cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. 
   * @return cgroupnsMode
  */
  
  @Schema(name = "CgroupnsMode", description = "cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CgroupnsMode")
  public CgroupnsModeEnum getCgroupnsMode() {
    return cgroupnsMode;
  }

  public void setCgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
    this.cgroupnsMode = cgroupnsMode;
  }

  public HostConfig dns(List<String> dns) {
    this.dns = dns;
    return this;
  }

  public HostConfig addDnsItem(String dnsItem) {
    if (this.dns == null) {
      this.dns = new ArrayList<>();
    }
    this.dns.add(dnsItem);
    return this;
  }

  /**
   * A list of DNS servers for the container to use.
   * @return dns
  */
  
  @Schema(name = "Dns", description = "A list of DNS servers for the container to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Dns")
  public List<String> getDns() {
    return dns;
  }

  public void setDns(List<String> dns) {
    this.dns = dns;
  }

  public HostConfig dnsOptions(List<String> dnsOptions) {
    this.dnsOptions = dnsOptions;
    return this;
  }

  public HostConfig addDnsOptionsItem(String dnsOptionsItem) {
    if (this.dnsOptions == null) {
      this.dnsOptions = new ArrayList<>();
    }
    this.dnsOptions.add(dnsOptionsItem);
    return this;
  }

  /**
   * A list of DNS options.
   * @return dnsOptions
  */
  
  @Schema(name = "DnsOptions", description = "A list of DNS options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DnsOptions")
  public List<String> getDnsOptions() {
    return dnsOptions;
  }

  public void setDnsOptions(List<String> dnsOptions) {
    this.dnsOptions = dnsOptions;
  }

  public HostConfig dnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
    return this;
  }

  public HostConfig addDnsSearchItem(String dnsSearchItem) {
    if (this.dnsSearch == null) {
      this.dnsSearch = new ArrayList<>();
    }
    this.dnsSearch.add(dnsSearchItem);
    return this;
  }

  /**
   * A list of DNS search domains.
   * @return dnsSearch
  */
  
  @Schema(name = "DnsSearch", description = "A list of DNS search domains.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DnsSearch")
  public List<String> getDnsSearch() {
    return dnsSearch;
  }

  public void setDnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
  }

  public HostConfig extraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
    return this;
  }

  public HostConfig addExtraHostsItem(String extraHostsItem) {
    if (this.extraHosts == null) {
      this.extraHosts = new ArrayList<>();
    }
    this.extraHosts.add(extraHostsItem);
    return this;
  }

  /**
   * A list of hostnames/IP mappings to add to the container's `/etc/hosts` file. Specified in the form `[\"hostname:IP\"]`. 
   * @return extraHosts
  */
  
  @Schema(name = "ExtraHosts", description = "A list of hostnames/IP mappings to add to the container's `/etc/hosts` file. Specified in the form `[\"hostname:IP\"]`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtraHosts")
  public List<String> getExtraHosts() {
    return extraHosts;
  }

  public void setExtraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
  }

  public HostConfig groupAdd(List<String> groupAdd) {
    this.groupAdd = groupAdd;
    return this;
  }

  public HostConfig addGroupAddItem(String groupAddItem) {
    if (this.groupAdd == null) {
      this.groupAdd = new ArrayList<>();
    }
    this.groupAdd.add(groupAddItem);
    return this;
  }

  /**
   * A list of additional groups that the container process will run as. 
   * @return groupAdd
  */
  
  @Schema(name = "GroupAdd", description = "A list of additional groups that the container process will run as. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupAdd")
  public List<String> getGroupAdd() {
    return groupAdd;
  }

  public void setGroupAdd(List<String> groupAdd) {
    this.groupAdd = groupAdd;
  }

  public HostConfig ipcMode(String ipcMode) {
    this.ipcMode = ipcMode;
    return this;
  }

  /**
   * IPC sharing mode for the container. Possible values are:  - `\"none\"`: own private IPC namespace, with /dev/shm not mounted - `\"private\"`: own private IPC namespace - `\"shareable\"`: own private IPC namespace, with a possibility to share it with other containers - `\"container:<name|id>\"`: join another (shareable) container's IPC namespace - `\"host\"`: use the host system's IPC namespace  If not specified, daemon default is used, which can either be `\"private\"` or `\"shareable\"`, depending on daemon version and configuration. 
   * @return ipcMode
  */
  
  @Schema(name = "IpcMode", description = "IPC sharing mode for the container. Possible values are:  - `\"none\"`: own private IPC namespace, with /dev/shm not mounted - `\"private\"`: own private IPC namespace - `\"shareable\"`: own private IPC namespace, with a possibility to share it with other containers - `\"container:<name|id>\"`: join another (shareable) container's IPC namespace - `\"host\"`: use the host system's IPC namespace  If not specified, daemon default is used, which can either be `\"private\"` or `\"shareable\"`, depending on daemon version and configuration. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IpcMode")
  public String getIpcMode() {
    return ipcMode;
  }

  public void setIpcMode(String ipcMode) {
    this.ipcMode = ipcMode;
  }

  public HostConfig cgroup(String cgroup) {
    this.cgroup = cgroup;
    return this;
  }

  /**
   * Cgroup to use for the container.
   * @return cgroup
  */
  
  @Schema(name = "Cgroup", description = "Cgroup to use for the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cgroup")
  public String getCgroup() {
    return cgroup;
  }

  public void setCgroup(String cgroup) {
    this.cgroup = cgroup;
  }

  public HostConfig links(List<String> links) {
    this.links = links;
    return this;
  }

  public HostConfig addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * A list of links for the container in the form `container_name:alias`. 
   * @return links
  */
  
  @Schema(name = "Links", description = "A list of links for the container in the form `container_name:alias`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Links")
  public List<String> getLinks() {
    return links;
  }

  public void setLinks(List<String> links) {
    this.links = links;
  }

  public HostConfig oomScoreAdj(Integer oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
    return this;
  }

  /**
   * An integer value containing the score given to the container in order to tune OOM killer preferences. 
   * @return oomScoreAdj
  */
  
  @Schema(name = "OomScoreAdj", example = "500", description = "An integer value containing the score given to the container in order to tune OOM killer preferences. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OomScoreAdj")
  public Integer getOomScoreAdj() {
    return oomScoreAdj;
  }

  public void setOomScoreAdj(Integer oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
  }

  public HostConfig pidMode(String pidMode) {
    this.pidMode = pidMode;
    return this;
  }

  /**
   * Set the PID (Process) Namespace mode for the container. It can be either:  - `\"container:<name|id>\"`: joins another container's PID namespace - `\"host\"`: use the host's PID namespace inside the container 
   * @return pidMode
  */
  
  @Schema(name = "PidMode", description = "Set the PID (Process) Namespace mode for the container. It can be either:  - `\"container:<name|id>\"`: joins another container's PID namespace - `\"host\"`: use the host's PID namespace inside the container ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PidMode")
  public String getPidMode() {
    return pidMode;
  }

  public void setPidMode(String pidMode) {
    this.pidMode = pidMode;
  }

  public HostConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Gives the container full access to the host.
   * @return privileged
  */
  
  @Schema(name = "Privileged", description = "Gives the container full access to the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Privileged")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public HostConfig publishAllPorts(Boolean publishAllPorts) {
    this.publishAllPorts = publishAllPorts;
    return this;
  }

  /**
   * Allocates an ephemeral host port for all of a container's exposed ports.  Ports are de-allocated when the container stops and allocated when the container starts. The allocated port might be changed when restarting the container.  The port is selected from the ephemeral port range that depends on the kernel. For example, on Linux the range is defined by `/proc/sys/net/ipv4/ip_local_port_range`. 
   * @return publishAllPorts
  */
  
  @Schema(name = "PublishAllPorts", description = "Allocates an ephemeral host port for all of a container's exposed ports.  Ports are de-allocated when the container stops and allocated when the container starts. The allocated port might be changed when restarting the container.  The port is selected from the ephemeral port range that depends on the kernel. For example, on Linux the range is defined by `/proc/sys/net/ipv4/ip_local_port_range`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishAllPorts")
  public Boolean getPublishAllPorts() {
    return publishAllPorts;
  }

  public void setPublishAllPorts(Boolean publishAllPorts) {
    this.publishAllPorts = publishAllPorts;
  }

  public HostConfig readonlyRootfs(Boolean readonlyRootfs) {
    this.readonlyRootfs = readonlyRootfs;
    return this;
  }

  /**
   * Mount the container's root filesystem as read only.
   * @return readonlyRootfs
  */
  
  @Schema(name = "ReadonlyRootfs", description = "Mount the container's root filesystem as read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReadonlyRootfs")
  public Boolean getReadonlyRootfs() {
    return readonlyRootfs;
  }

  public void setReadonlyRootfs(Boolean readonlyRootfs) {
    this.readonlyRootfs = readonlyRootfs;
  }

  public HostConfig securityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
    return this;
  }

  public HostConfig addSecurityOptItem(String securityOptItem) {
    if (this.securityOpt == null) {
      this.securityOpt = new ArrayList<>();
    }
    this.securityOpt.add(securityOptItem);
    return this;
  }

  /**
   * A list of string values to customize labels for MLS systems, such as SELinux. 
   * @return securityOpt
  */
  
  @Schema(name = "SecurityOpt", description = "A list of string values to customize labels for MLS systems, such as SELinux. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecurityOpt")
  public List<String> getSecurityOpt() {
    return securityOpt;
  }

  public void setSecurityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
  }

  public HostConfig storageOpt(Map<String, String> storageOpt) {
    this.storageOpt = storageOpt;
    return this;
  }

  public HostConfig putStorageOptItem(String key, String storageOptItem) {
    if (this.storageOpt == null) {
      this.storageOpt = new HashMap<>();
    }
    this.storageOpt.put(key, storageOptItem);
    return this;
  }

  /**
   * Storage driver options for this container, in the form `{\"size\": \"120G\"}`. 
   * @return storageOpt
  */
  
  @Schema(name = "StorageOpt", description = "Storage driver options for this container, in the form `{\"size\": \"120G\"}`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StorageOpt")
  public Map<String, String> getStorageOpt() {
    return storageOpt;
  }

  public void setStorageOpt(Map<String, String> storageOpt) {
    this.storageOpt = storageOpt;
  }

  public HostConfig tmpfs(Map<String, String> tmpfs) {
    this.tmpfs = tmpfs;
    return this;
  }

  public HostConfig putTmpfsItem(String key, String tmpfsItem) {
    if (this.tmpfs == null) {
      this.tmpfs = new HashMap<>();
    }
    this.tmpfs.put(key, tmpfsItem);
    return this;
  }

  /**
   * A map of container directories which should be replaced by tmpfs mounts, and their corresponding mount options. For example:  ``` { \"/run\": \"rw,noexec,nosuid,size=65536k\" } ``` 
   * @return tmpfs
  */
  
  @Schema(name = "Tmpfs", description = "A map of container directories which should be replaced by tmpfs mounts, and their corresponding mount options. For example:  ``` { \"/run\": \"rw,noexec,nosuid,size=65536k\" } ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tmpfs")
  public Map<String, String> getTmpfs() {
    return tmpfs;
  }

  public void setTmpfs(Map<String, String> tmpfs) {
    this.tmpfs = tmpfs;
  }

  public HostConfig utSMode(String utSMode) {
    this.utSMode = utSMode;
    return this;
  }

  /**
   * UTS namespace to use for the container.
   * @return utSMode
  */
  
  @Schema(name = "UTSMode", description = "UTS namespace to use for the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UTSMode")
  public String getUtSMode() {
    return utSMode;
  }

  public void setUtSMode(String utSMode) {
    this.utSMode = utSMode;
  }

  public HostConfig usernsMode(String usernsMode) {
    this.usernsMode = usernsMode;
    return this;
  }

  /**
   * Sets the usernamespace mode for the container when usernamespace remapping option is enabled. 
   * @return usernsMode
  */
  
  @Schema(name = "UsernsMode", description = "Sets the usernamespace mode for the container when usernamespace remapping option is enabled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UsernsMode")
  public String getUsernsMode() {
    return usernsMode;
  }

  public void setUsernsMode(String usernsMode) {
    this.usernsMode = usernsMode;
  }

  public HostConfig shmSize(Long shmSize) {
    this.shmSize = shmSize;
    return this;
  }

  /**
   * Size of `/dev/shm` in bytes. If omitted, the system uses 64MB. 
   * minimum: 0
   * @return shmSize
  */
  @Min(0L) 
  @Schema(name = "ShmSize", description = "Size of `/dev/shm` in bytes. If omitted, the system uses 64MB. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShmSize")
  public Long getShmSize() {
    return shmSize;
  }

  public void setShmSize(Long shmSize) {
    this.shmSize = shmSize;
  }

  public HostConfig sysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public HostConfig putSysctlsItem(String key, String sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new HashMap<>();
    }
    this.sysctls.put(key, sysctlsItem);
    return this;
  }

  /**
   * A list of kernel parameters (sysctls) to set in the container. For example:  ``` {\"net.ipv4.ip_forward\": \"1\"} ``` 
   * @return sysctls
  */
  
  @Schema(name = "Sysctls", description = "A list of kernel parameters (sysctls) to set in the container. For example:  ``` {\"net.ipv4.ip_forward\": \"1\"} ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sysctls")
  public Map<String, String> getSysctls() {
    return sysctls;
  }

  public void setSysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
  }

  public HostConfig runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime to use with this container.
   * @return runtime
  */
  
  @Schema(name = "Runtime", description = "Runtime to use with this container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Runtime")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public HostConfig isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  /**
   * Isolation technology of the container. (Windows only) 
   * @return isolation
  */
  
  @Schema(name = "Isolation", description = "Isolation technology of the container. (Windows only) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Isolation")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public HostConfig maskedPaths(List<String> maskedPaths) {
    this.maskedPaths = maskedPaths;
    return this;
  }

  public HostConfig addMaskedPathsItem(String maskedPathsItem) {
    if (this.maskedPaths == null) {
      this.maskedPaths = new ArrayList<>();
    }
    this.maskedPaths.add(maskedPathsItem);
    return this;
  }

  /**
   * The list of paths to be masked inside the container (this overrides the default set of paths). 
   * @return maskedPaths
  */
  
  @Schema(name = "MaskedPaths", description = "The list of paths to be masked inside the container (this overrides the default set of paths). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaskedPaths")
  public List<String> getMaskedPaths() {
    return maskedPaths;
  }

  public void setMaskedPaths(List<String> maskedPaths) {
    this.maskedPaths = maskedPaths;
  }

  public HostConfig readonlyPaths(List<String> readonlyPaths) {
    this.readonlyPaths = readonlyPaths;
    return this;
  }

  public HostConfig addReadonlyPathsItem(String readonlyPathsItem) {
    if (this.readonlyPaths == null) {
      this.readonlyPaths = new ArrayList<>();
    }
    this.readonlyPaths.add(readonlyPathsItem);
    return this;
  }

  /**
   * The list of paths to be set as read-only inside the container (this overrides the default set of paths). 
   * @return readonlyPaths
  */
  
  @Schema(name = "ReadonlyPaths", description = "The list of paths to be set as read-only inside the container (this overrides the default set of paths). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReadonlyPaths")
  public List<String> getReadonlyPaths() {
    return readonlyPaths;
  }

  public void setReadonlyPaths(List<String> readonlyPaths) {
    this.readonlyPaths = readonlyPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostConfig hostConfig = (HostConfig) o;
    return Objects.equals(this.cpuShares, hostConfig.cpuShares) &&
        Objects.equals(this.memory, hostConfig.memory) &&
        Objects.equals(this.cgroupParent, hostConfig.cgroupParent) &&
        Objects.equals(this.blkioWeight, hostConfig.blkioWeight) &&
        Objects.equals(this.blkioWeightDevice, hostConfig.blkioWeightDevice) &&
        Objects.equals(this.blkioDeviceReadBps, hostConfig.blkioDeviceReadBps) &&
        Objects.equals(this.blkioDeviceWriteBps, hostConfig.blkioDeviceWriteBps) &&
        Objects.equals(this.blkioDeviceReadIOps, hostConfig.blkioDeviceReadIOps) &&
        Objects.equals(this.blkioDeviceWriteIOps, hostConfig.blkioDeviceWriteIOps) &&
        Objects.equals(this.cpuPeriod, hostConfig.cpuPeriod) &&
        Objects.equals(this.cpuQuota, hostConfig.cpuQuota) &&
        Objects.equals(this.cpuRealtimePeriod, hostConfig.cpuRealtimePeriod) &&
        Objects.equals(this.cpuRealtimeRuntime, hostConfig.cpuRealtimeRuntime) &&
        Objects.equals(this.cpusetCpus, hostConfig.cpusetCpus) &&
        Objects.equals(this.cpusetMems, hostConfig.cpusetMems) &&
        Objects.equals(this.devices, hostConfig.devices) &&
        Objects.equals(this.deviceCgroupRules, hostConfig.deviceCgroupRules) &&
        Objects.equals(this.deviceRequests, hostConfig.deviceRequests) &&
        Objects.equals(this.kernelMemoryTCP, hostConfig.kernelMemoryTCP) &&
        Objects.equals(this.memoryReservation, hostConfig.memoryReservation) &&
        Objects.equals(this.memorySwap, hostConfig.memorySwap) &&
        Objects.equals(this.memorySwappiness, hostConfig.memorySwappiness) &&
        Objects.equals(this.nanoCpus, hostConfig.nanoCpus) &&
        Objects.equals(this.oomKillDisable, hostConfig.oomKillDisable) &&
        equalsNullable(this.init, hostConfig.init) &&
        equalsNullable(this.pidsLimit, hostConfig.pidsLimit) &&
        Objects.equals(this.ulimits, hostConfig.ulimits) &&
        Objects.equals(this.cpuCount, hostConfig.cpuCount) &&
        Objects.equals(this.cpuPercent, hostConfig.cpuPercent) &&
        Objects.equals(this.ioMaximumIOps, hostConfig.ioMaximumIOps) &&
        Objects.equals(this.ioMaximumBandwidth, hostConfig.ioMaximumBandwidth) &&
        Objects.equals(this.binds, hostConfig.binds) &&
        Objects.equals(this.containerIDFile, hostConfig.containerIDFile) &&
        Objects.equals(this.logConfig, hostConfig.logConfig) &&
        Objects.equals(this.networkMode, hostConfig.networkMode) &&
        Objects.equals(this.portBindings, hostConfig.portBindings) &&
        Objects.equals(this.restartPolicy, hostConfig.restartPolicy) &&
        Objects.equals(this.autoRemove, hostConfig.autoRemove) &&
        Objects.equals(this.volumeDriver, hostConfig.volumeDriver) &&
        Objects.equals(this.volumesFrom, hostConfig.volumesFrom) &&
        Objects.equals(this.mounts, hostConfig.mounts) &&
        equalsNullable(this.consoleSize, hostConfig.consoleSize) &&
        Objects.equals(this.annotations, hostConfig.annotations) &&
        Objects.equals(this.capAdd, hostConfig.capAdd) &&
        Objects.equals(this.capDrop, hostConfig.capDrop) &&
        Objects.equals(this.cgroupnsMode, hostConfig.cgroupnsMode) &&
        Objects.equals(this.dns, hostConfig.dns) &&
        Objects.equals(this.dnsOptions, hostConfig.dnsOptions) &&
        Objects.equals(this.dnsSearch, hostConfig.dnsSearch) &&
        Objects.equals(this.extraHosts, hostConfig.extraHosts) &&
        Objects.equals(this.groupAdd, hostConfig.groupAdd) &&
        Objects.equals(this.ipcMode, hostConfig.ipcMode) &&
        Objects.equals(this.cgroup, hostConfig.cgroup) &&
        Objects.equals(this.links, hostConfig.links) &&
        Objects.equals(this.oomScoreAdj, hostConfig.oomScoreAdj) &&
        Objects.equals(this.pidMode, hostConfig.pidMode) &&
        Objects.equals(this.privileged, hostConfig.privileged) &&
        Objects.equals(this.publishAllPorts, hostConfig.publishAllPorts) &&
        Objects.equals(this.readonlyRootfs, hostConfig.readonlyRootfs) &&
        Objects.equals(this.securityOpt, hostConfig.securityOpt) &&
        Objects.equals(this.storageOpt, hostConfig.storageOpt) &&
        Objects.equals(this.tmpfs, hostConfig.tmpfs) &&
        Objects.equals(this.utSMode, hostConfig.utSMode) &&
        Objects.equals(this.usernsMode, hostConfig.usernsMode) &&
        Objects.equals(this.shmSize, hostConfig.shmSize) &&
        Objects.equals(this.sysctls, hostConfig.sysctls) &&
        Objects.equals(this.runtime, hostConfig.runtime) &&
        Objects.equals(this.isolation, hostConfig.isolation) &&
        Objects.equals(this.maskedPaths, hostConfig.maskedPaths) &&
        Objects.equals(this.readonlyPaths, hostConfig.readonlyPaths);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, hashCodeNullable(init), hashCodeNullable(pidsLimit), ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth, binds, containerIDFile, logConfig, networkMode, portBindings, restartPolicy, autoRemove, volumeDriver, volumesFrom, mounts, hashCodeNullable(consoleSize), annotations, capAdd, capDrop, cgroupnsMode, dns, dnsOptions, dnsSearch, extraHosts, groupAdd, ipcMode, cgroup, links, oomScoreAdj, pidMode, privileged, publishAllPorts, readonlyRootfs, securityOpt, storageOpt, tmpfs, utSMode, usernsMode, shmSize, sysctls, runtime, isolation, maskedPaths, readonlyPaths);
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
    sb.append("class HostConfig {\n");
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
    sb.append("    binds: ").append(toIndentedString(binds)).append("\n");
    sb.append("    containerIDFile: ").append(toIndentedString(containerIDFile)).append("\n");
    sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
    sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
    sb.append("    portBindings: ").append(toIndentedString(portBindings)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    volumeDriver: ").append(toIndentedString(volumeDriver)).append("\n");
    sb.append("    volumesFrom: ").append(toIndentedString(volumesFrom)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    consoleSize: ").append(toIndentedString(consoleSize)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    capAdd: ").append(toIndentedString(capAdd)).append("\n");
    sb.append("    capDrop: ").append(toIndentedString(capDrop)).append("\n");
    sb.append("    cgroupnsMode: ").append(toIndentedString(cgroupnsMode)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    dnsOptions: ").append(toIndentedString(dnsOptions)).append("\n");
    sb.append("    dnsSearch: ").append(toIndentedString(dnsSearch)).append("\n");
    sb.append("    extraHosts: ").append(toIndentedString(extraHosts)).append("\n");
    sb.append("    groupAdd: ").append(toIndentedString(groupAdd)).append("\n");
    sb.append("    ipcMode: ").append(toIndentedString(ipcMode)).append("\n");
    sb.append("    cgroup: ").append(toIndentedString(cgroup)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    oomScoreAdj: ").append(toIndentedString(oomScoreAdj)).append("\n");
    sb.append("    pidMode: ").append(toIndentedString(pidMode)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    publishAllPorts: ").append(toIndentedString(publishAllPorts)).append("\n");
    sb.append("    readonlyRootfs: ").append(toIndentedString(readonlyRootfs)).append("\n");
    sb.append("    securityOpt: ").append(toIndentedString(securityOpt)).append("\n");
    sb.append("    storageOpt: ").append(toIndentedString(storageOpt)).append("\n");
    sb.append("    tmpfs: ").append(toIndentedString(tmpfs)).append("\n");
    sb.append("    utSMode: ").append(toIndentedString(utSMode)).append("\n");
    sb.append("    usernsMode: ").append(toIndentedString(usernsMode)).append("\n");
    sb.append("    shmSize: ").append(toIndentedString(shmSize)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    maskedPaths: ").append(toIndentedString(maskedPaths)).append("\n");
    sb.append("    readonlyPaths: ").append(toIndentedString(readonlyPaths)).append("\n");
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

