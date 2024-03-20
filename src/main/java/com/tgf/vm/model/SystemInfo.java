package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.Commit;
import com.tgf.vm.model.GenericResourcesInner;
import com.tgf.vm.model.PluginsInfo;
import com.tgf.vm.model.RegistryServiceConfig;
import com.tgf.vm.model.Runtime;
import com.tgf.vm.model.SwarmInfo;
import com.tgf.vm.model.SystemInfoDefaultAddressPoolsInner;
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
 * SystemInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemInfo {

  private String ID;

  private Integer containers;

  private Integer containersRunning;

  private Integer containersPaused;

  private Integer containersStopped;

  private Integer images;

  private String driver;

  @Valid
  private List<List<String>> driverStatus;

  private String dockerRootDir;

  private PluginsInfo plugins;

  private Boolean memoryLimit;

  private Boolean swapLimit;

  private Boolean kernelMemoryTCP;

  private Boolean cpuCfsPeriod;

  private Boolean cpuCfsQuota;

  private Boolean cpUShares;

  private Boolean cpUSet;

  private Boolean pidsLimit;

  private Boolean oomKillDisable;

  private Boolean ipv4Forwarding;

  private Boolean bridgeNfIptables;

  private Boolean bridgeNfIp6tables;

  private Boolean debug;

  private Integer nfd;

  private Integer ngoroutines;

  private String systemTime;

  private String loggingDriver;

  /**
   * The driver to use for managing cgroups. 
   */
  public enum CgroupDriverEnum {
    CGROUPFS("cgroupfs"),
    
    SYSTEMD("systemd"),
    
    NONE("none");

    private String value;

    CgroupDriverEnum(String value) {
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
    public static CgroupDriverEnum fromValue(String value) {
      for (CgroupDriverEnum b : CgroupDriverEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CgroupDriverEnum cgroupDriver = CgroupDriverEnum.CGROUPFS;

  /**
   * The version of the cgroup. 
   */
  public enum CgroupVersionEnum {
    _1("1"),
    
    _2("2");

    private String value;

    CgroupVersionEnum(String value) {
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
    public static CgroupVersionEnum fromValue(String value) {
      for (CgroupVersionEnum b : CgroupVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CgroupVersionEnum cgroupVersion = CgroupVersionEnum._1;

  private Integer neventsListener;

  private String kernelVersion;

  private String operatingSystem;

  private String osVersion;

  private String osType;

  private String architecture;

  private Integer NCPU;

  private Long memTotal;

  private String indexServerAddress = "https://index.docker.io/v1/";

  private JsonNullable<RegistryServiceConfig> registryConfig = JsonNullable.<RegistryServiceConfig>undefined();

  @Valid
  private List<@Valid GenericResourcesInner> genericResources;

  private String httpProxy;

  private String httpsProxy;

  private String noProxy;

  private String name;

  @Valid
  private List<String> labels;

  private Boolean experimentalBuild;

  private String serverVersion;

  @Valid
  private Map<String, Runtime> runtimes = new HashMap<>();

  private String defaultRuntime = "runc";

  private SwarmInfo swarm;

  private Boolean liveRestoreEnabled = false;

  /**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. 
   */
  public enum IsolationEnum {
    DEFAULT("default"),
    
    HYPERV("hyperv"),
    
    PROCESS("process");

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

  private IsolationEnum isolation = IsolationEnum.DEFAULT;

  private String initBinary;

  private Commit containerdCommit;

  private Commit runcCommit;

  private Commit initCommit;

  @Valid
  private List<String> securityOptions;

  private String productLicense;

  @Valid
  private List<@Valid SystemInfoDefaultAddressPoolsInner> defaultAddressPools;

  @Valid
  private List<String> warnings;

  public SystemInfo ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable. 
   * @return ID
  */
  
  @Schema(name = "ID", example = "7TRN:IPZB:QYBB:VPBQ:UMPP:KARE:6ZNR:XE6T:7EWV:PKF4:ZOJD:TPYS", description = "Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public SystemInfo containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Total number of containers on the host.
   * @return containers
  */
  
  @Schema(name = "Containers", example = "14", description = "Total number of containers on the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Containers")
  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }

  public SystemInfo containersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
    return this;
  }

  /**
   * Number of containers with status `\"running\"`. 
   * @return containersRunning
  */
  
  @Schema(name = "ContainersRunning", example = "3", description = "Number of containers with status `\"running\"`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainersRunning")
  public Integer getContainersRunning() {
    return containersRunning;
  }

  public void setContainersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
  }

  public SystemInfo containersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
    return this;
  }

  /**
   * Number of containers with status `\"paused\"`. 
   * @return containersPaused
  */
  
  @Schema(name = "ContainersPaused", example = "1", description = "Number of containers with status `\"paused\"`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainersPaused")
  public Integer getContainersPaused() {
    return containersPaused;
  }

  public void setContainersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
  }

  public SystemInfo containersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
    return this;
  }

  /**
   * Number of containers with status `\"stopped\"`. 
   * @return containersStopped
  */
  
  @Schema(name = "ContainersStopped", example = "10", description = "Number of containers with status `\"stopped\"`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainersStopped")
  public Integer getContainersStopped() {
    return containersStopped;
  }

  public void setContainersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
  }

  public SystemInfo images(Integer images) {
    this.images = images;
    return this;
  }

  /**
   * Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. 
   * @return images
  */
  
  @Schema(name = "Images", example = "508", description = "Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Images")
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public SystemInfo driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the storage driver in use.
   * @return driver
  */
  
  @Schema(name = "Driver", example = "overlay2", description = "Name of the storage driver in use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public SystemInfo driverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
    return this;
  }

  public SystemInfo addDriverStatusItem(List<String> driverStatusItem) {
    if (this.driverStatus == null) {
      this.driverStatus = new ArrayList<>();
    }
    this.driverStatus.add(driverStatusItem);
    return this;
  }

  /**
   * Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice. 
   * @return driverStatus
  */
  @Valid 
  @Schema(name = "DriverStatus", example = "[[Backing Filesystem, extfs], [Supports d_type, true], [Native Overlay Diff, true]]", description = "Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriverStatus")
  public List<List<String>> getDriverStatus() {
    return driverStatus;
  }

  public void setDriverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
  }

  public SystemInfo dockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
    return this;
  }

  /**
   * Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows. 
   * @return dockerRootDir
  */
  
  @Schema(name = "DockerRootDir", example = "/var/lib/docker", description = "Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DockerRootDir")
  public String getDockerRootDir() {
    return dockerRootDir;
  }

  public void setDockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
  }

  public SystemInfo plugins(PluginsInfo plugins) {
    this.plugins = plugins;
    return this;
  }

  /**
   * Get plugins
   * @return plugins
  */
  @Valid 
  @Schema(name = "Plugins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Plugins")
  public PluginsInfo getPlugins() {
    return plugins;
  }

  public void setPlugins(PluginsInfo plugins) {
    this.plugins = plugins;
  }

  public SystemInfo memoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
    return this;
  }

  /**
   * Indicates if the host has memory limit support enabled.
   * @return memoryLimit
  */
  
  @Schema(name = "MemoryLimit", example = "true", description = "Indicates if the host has memory limit support enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemoryLimit")
  public Boolean getMemoryLimit() {
    return memoryLimit;
  }

  public void setMemoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
  }

  public SystemInfo swapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
    return this;
  }

  /**
   * Indicates if the host has memory swap limit support enabled.
   * @return swapLimit
  */
  
  @Schema(name = "SwapLimit", example = "true", description = "Indicates if the host has memory swap limit support enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SwapLimit")
  public Boolean getSwapLimit() {
    return swapLimit;
  }

  public void setSwapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
  }

  public SystemInfo kernelMemoryTCP(Boolean kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
    return this;
  }

  /**
   * Indicates if the host has kernel memory TCP limit support enabled. This field is omitted if not supported.  Kernel memory TCP limits are not supported when using cgroups v2, which does not support the corresponding `memory.kmem.tcp.limit_in_bytes` cgroup. 
   * @return kernelMemoryTCP
  */
  
  @Schema(name = "KernelMemoryTCP", example = "true", description = "Indicates if the host has kernel memory TCP limit support enabled. This field is omitted if not supported.  Kernel memory TCP limits are not supported when using cgroups v2, which does not support the corresponding `memory.kmem.tcp.limit_in_bytes` cgroup. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KernelMemoryTCP")
  public Boolean getKernelMemoryTCP() {
    return kernelMemoryTCP;
  }

  public void setKernelMemoryTCP(Boolean kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
  }

  public SystemInfo cpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
    return this;
  }

  /**
   * Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host. 
   * @return cpuCfsPeriod
  */
  
  @Schema(name = "CpuCfsPeriod", example = "true", description = "Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuCfsPeriod")
  public Boolean getCpuCfsPeriod() {
    return cpuCfsPeriod;
  }

  public void setCpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
  }

  public SystemInfo cpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
    return this;
  }

  /**
   * Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host. 
   * @return cpuCfsQuota
  */
  
  @Schema(name = "CpuCfsQuota", example = "true", description = "Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CpuCfsQuota")
  public Boolean getCpuCfsQuota() {
    return cpuCfsQuota;
  }

  public void setCpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
  }

  public SystemInfo cpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
    return this;
  }

  /**
   * Indicates if CPU Shares limiting is supported by the host. 
   * @return cpUShares
  */
  
  @Schema(name = "CPUShares", example = "true", description = "Indicates if CPU Shares limiting is supported by the host. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CPUShares")
  public Boolean getCpUShares() {
    return cpUShares;
  }

  public void setCpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
  }

  public SystemInfo cpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
    return this;
  }

  /**
   * Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) 
   * @return cpUSet
  */
  
  @Schema(name = "CPUSet", example = "true", description = "Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CPUSet")
  public Boolean getCpUSet() {
    return cpUSet;
  }

  public void setCpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
  }

  public SystemInfo pidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
    return this;
  }

  /**
   * Indicates if the host kernel has PID limit support enabled.
   * @return pidsLimit
  */
  
  @Schema(name = "PidsLimit", example = "true", description = "Indicates if the host kernel has PID limit support enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PidsLimit")
  public Boolean getPidsLimit() {
    return pidsLimit;
  }

  public void setPidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
  }

  public SystemInfo oomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
    return this;
  }

  /**
   * Indicates if OOM killer disable is supported on the host.
   * @return oomKillDisable
  */
  
  @Schema(name = "OomKillDisable", description = "Indicates if OOM killer disable is supported on the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OomKillDisable")
  public Boolean getOomKillDisable() {
    return oomKillDisable;
  }

  public void setOomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
  }

  public SystemInfo ipv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
    return this;
  }

  /**
   * Indicates IPv4 forwarding is enabled.
   * @return ipv4Forwarding
  */
  
  @Schema(name = "IPv4Forwarding", example = "true", description = "Indicates IPv4 forwarding is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv4Forwarding")
  public Boolean getIpv4Forwarding() {
    return ipv4Forwarding;
  }

  public void setIpv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
  }

  public SystemInfo bridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
    return this;
  }

  /**
   * Indicates if `bridge-nf-call-iptables` is available on the host.
   * @return bridgeNfIptables
  */
  
  @Schema(name = "BridgeNfIptables", example = "true", description = "Indicates if `bridge-nf-call-iptables` is available on the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BridgeNfIptables")
  public Boolean getBridgeNfIptables() {
    return bridgeNfIptables;
  }

  public void setBridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
  }

  public SystemInfo bridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
    return this;
  }

  /**
   * Indicates if `bridge-nf-call-ip6tables` is available on the host.
   * @return bridgeNfIp6tables
  */
  
  @Schema(name = "BridgeNfIp6tables", example = "true", description = "Indicates if `bridge-nf-call-ip6tables` is available on the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BridgeNfIp6tables")
  public Boolean getBridgeNfIp6tables() {
    return bridgeNfIp6tables;
  }

  public void setBridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
  }

  public SystemInfo debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

  /**
   * Indicates if the daemon is running in debug-mode / with debug-level logging enabled. 
   * @return debug
  */
  
  @Schema(name = "Debug", example = "true", description = "Indicates if the daemon is running in debug-mode / with debug-level logging enabled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Debug")
  public Boolean getDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public SystemInfo nfd(Integer nfd) {
    this.nfd = nfd;
    return this;
  }

  /**
   * The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. 
   * @return nfd
  */
  
  @Schema(name = "NFd", example = "64", description = "The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NFd")
  public Integer getNfd() {
    return nfd;
  }

  public void setNfd(Integer nfd) {
    this.nfd = nfd;
  }

  public SystemInfo ngoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
    return this;
  }

  /**
   * The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. 
   * @return ngoroutines
  */
  
  @Schema(name = "NGoroutines", example = "174", description = "The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NGoroutines")
  public Integer getNgoroutines() {
    return ngoroutines;
  }

  public void setNgoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
  }

  public SystemInfo systemTime(String systemTime) {
    this.systemTime = systemTime;
    return this;
  }

  /**
   * Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return systemTime
  */
  
  @Schema(name = "SystemTime", example = "2017-08-08T20:28:29.06202363Z", description = "Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SystemTime")
  public String getSystemTime() {
    return systemTime;
  }

  public void setSystemTime(String systemTime) {
    this.systemTime = systemTime;
  }

  public SystemInfo loggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
    return this;
  }

  /**
   * The logging driver to use as a default for new containers. 
   * @return loggingDriver
  */
  
  @Schema(name = "LoggingDriver", description = "The logging driver to use as a default for new containers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LoggingDriver")
  public String getLoggingDriver() {
    return loggingDriver;
  }

  public void setLoggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
  }

  public SystemInfo cgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
    return this;
  }

  /**
   * The driver to use for managing cgroups. 
   * @return cgroupDriver
  */
  
  @Schema(name = "CgroupDriver", example = "cgroupfs", description = "The driver to use for managing cgroups. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CgroupDriver")
  public CgroupDriverEnum getCgroupDriver() {
    return cgroupDriver;
  }

  public void setCgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
  }

  public SystemInfo cgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
    return this;
  }

  /**
   * The version of the cgroup. 
   * @return cgroupVersion
  */
  
  @Schema(name = "CgroupVersion", example = "1", description = "The version of the cgroup. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CgroupVersion")
  public CgroupVersionEnum getCgroupVersion() {
    return cgroupVersion;
  }

  public void setCgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
  }

  public SystemInfo neventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
    return this;
  }

  /**
   * Number of event listeners subscribed.
   * @return neventsListener
  */
  
  @Schema(name = "NEventsListener", example = "30", description = "Number of event listeners subscribed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NEventsListener")
  public Integer getNeventsListener() {
    return neventsListener;
  }

  public void setNeventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
  }

  public SystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_. 
   * @return kernelVersion
  */
  
  @Schema(name = "KernelVersion", example = "4.9.38-moby", description = "Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KernelVersion")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public SystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\" 
   * @return operatingSystem
  */
  
  @Schema(name = "OperatingSystem", example = "Alpine Linux v3.5", description = "Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\" ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OperatingSystem")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public SystemInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice. 
   * @return osVersion
  */
  
  @Schema(name = "OSVersion", example = "16.04", description = "Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OSVersion")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public SystemInfo osType(String osType) {
    this.osType = osType;
    return this;
  }

  /**
   * Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://go.dev/doc/install/source#environment). 
   * @return osType
  */
  
  @Schema(name = "OSType", example = "linux", description = "Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://go.dev/doc/install/source#environment). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OSType")
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public SystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://go.dev/doc/install/source#environment). 
   * @return architecture
  */
  
  @Schema(name = "Architecture", example = "x86_64", description = "Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://go.dev/doc/install/source#environment). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public SystemInfo NCPU(Integer NCPU) {
    this.NCPU = NCPU;
    return this;
  }

  /**
   * The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. 
   * @return NCPU
  */
  
  @Schema(name = "NCPU", example = "4", description = "The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NCPU")
  public Integer getNCPU() {
    return NCPU;
  }

  public void setNCPU(Integer NCPU) {
    this.NCPU = NCPU;
  }

  public SystemInfo memTotal(Long memTotal) {
    this.memTotal = memTotal;
    return this;
  }

  /**
   * Total amount of physical memory available on the host, in bytes. 
   * @return memTotal
  */
  
  @Schema(name = "MemTotal", example = "2095882240", description = "Total amount of physical memory available on the host, in bytes. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemTotal")
  public Long getMemTotal() {
    return memTotal;
  }

  public void setMemTotal(Long memTotal) {
    this.memTotal = memTotal;
  }

  public SystemInfo indexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
    return this;
  }

  /**
   * Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. 
   * @return indexServerAddress
  */
  
  @Schema(name = "IndexServerAddress", example = "https://index.docker.io/v1/", description = "Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexServerAddress")
  public String getIndexServerAddress() {
    return indexServerAddress;
  }

  public void setIndexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
  }

  public SystemInfo registryConfig(RegistryServiceConfig registryConfig) {
    this.registryConfig = JsonNullable.of(registryConfig);
    return this;
  }

  /**
   * Get registryConfig
   * @return registryConfig
  */
  @Valid 
  @Schema(name = "RegistryConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RegistryConfig")
  public JsonNullable<RegistryServiceConfig> getRegistryConfig() {
    return registryConfig;
  }

  public void setRegistryConfig(JsonNullable<RegistryServiceConfig> registryConfig) {
    this.registryConfig = registryConfig;
  }

  public SystemInfo genericResources(List<@Valid GenericResourcesInner> genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  public SystemInfo addGenericResourcesItem(GenericResourcesInner genericResourcesItem) {
    if (this.genericResources == null) {
      this.genericResources = new ArrayList<>();
    }
    this.genericResources.add(genericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return genericResources
  */
  @Valid 
  @Schema(name = "GenericResources", example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", description = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GenericResources")
  public List<@Valid GenericResourcesInner> getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(List<@Valid GenericResourcesInner> genericResources) {
    this.genericResources = genericResources;
  }

  public SystemInfo httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

  /**
   * HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   * @return httpProxy
  */
  
  @Schema(name = "HttpProxy", example = "http://xxxxx:xxxxx@proxy.corp.example.com:8080", description = "HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HttpProxy")
  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }

  public SystemInfo httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

  /**
   * HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   * @return httpsProxy
  */
  
  @Schema(name = "HttpsProxy", example = "https://xxxxx:xxxxx@proxy.corp.example.com:4443", description = "HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HttpsProxy")
  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }

  public SystemInfo noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

  /**
   * Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
   * @return noProxy
  */
  
  @Schema(name = "NoProxy", example = "*.local, 169.254/16", description = "Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoProxy")
  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }

  public SystemInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Hostname of the host.
   * @return name
  */
  
  @Schema(name = "Name", example = "node5.corp.example.com", description = "Hostname of the host.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemInfo labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public SystemInfo addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm. 
   * @return labels
  */
  
  @Schema(name = "Labels", example = "[storage=ssd, production]", description = "User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public SystemInfo experimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
    return this;
  }

  /**
   * Indicates if experimental features are enabled on the daemon. 
   * @return experimentalBuild
  */
  
  @Schema(name = "ExperimentalBuild", example = "true", description = "Indicates if experimental features are enabled on the daemon. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExperimentalBuild")
  public Boolean getExperimentalBuild() {
    return experimentalBuild;
  }

  public void setExperimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
  }

  public SystemInfo serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * Version string of the daemon. 
   * @return serverVersion
  */
  
  @Schema(name = "ServerVersion", example = "24.0.2", description = "Version string of the daemon. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerVersion")
  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public SystemInfo runtimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
    return this;
  }

  public SystemInfo putRuntimesItem(String key, Runtime runtimesItem) {
    if (this.runtimes == null) {
      this.runtimes = new HashMap<>();
    }
    this.runtimes.put(key, runtimesItem);
    return this;
  }

  /**
   * List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here. 
   * @return runtimes
  */
  @Valid 
  @Schema(name = "Runtimes", example = "{\"runc\":{\"path\":\"runc\"},\"runc-master\":{\"path\":\"/go/bin/runc\"},\"custom\":{\"path\":\"/usr/local/bin/my-oci-runtime\",\"runtimeArgs\":[\"--debug\",\"--systemd-cgroup=false\"]}}", description = "List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Runtimes")
  public Map<String, Runtime> getRuntimes() {
    return runtimes;
  }

  public void setRuntimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
  }

  public SystemInfo defaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
    return this;
  }

  /**
   * Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. 
   * @return defaultRuntime
  */
  
  @Schema(name = "DefaultRuntime", example = "runc", description = "Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultRuntime")
  public String getDefaultRuntime() {
    return defaultRuntime;
  }

  public void setDefaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
  }

  public SystemInfo swarm(SwarmInfo swarm) {
    this.swarm = swarm;
    return this;
  }

  /**
   * Get swarm
   * @return swarm
  */
  @Valid 
  @Schema(name = "Swarm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Swarm")
  public SwarmInfo getSwarm() {
    return swarm;
  }

  public void setSwarm(SwarmInfo swarm) {
    this.swarm = swarm;
  }

  public SystemInfo liveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
    return this;
  }

  /**
   * Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. 
   * @return liveRestoreEnabled
  */
  
  @Schema(name = "LiveRestoreEnabled", example = "false", description = "Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LiveRestoreEnabled")
  public Boolean getLiveRestoreEnabled() {
    return liveRestoreEnabled;
  }

  public void setLiveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
  }

  public SystemInfo isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  /**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. 
   * @return isolation
  */
  
  @Schema(name = "Isolation", description = "Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Isolation")
  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public SystemInfo initBinary(String initBinary) {
    this.initBinary = initBinary;
    return this;
  }

  /**
   * Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. 
   * @return initBinary
  */
  
  @Schema(name = "InitBinary", example = "docker-init", description = "Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InitBinary")
  public String getInitBinary() {
    return initBinary;
  }

  public void setInitBinary(String initBinary) {
    this.initBinary = initBinary;
  }

  public SystemInfo containerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
    return this;
  }

  /**
   * Get containerdCommit
   * @return containerdCommit
  */
  @Valid 
  @Schema(name = "ContainerdCommit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerdCommit")
  public Commit getContainerdCommit() {
    return containerdCommit;
  }

  public void setContainerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
  }

  public SystemInfo runcCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
    return this;
  }

  /**
   * Get runcCommit
   * @return runcCommit
  */
  @Valid 
  @Schema(name = "RuncCommit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RuncCommit")
  public Commit getRuncCommit() {
    return runcCommit;
  }

  public void setRuncCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
  }

  public SystemInfo initCommit(Commit initCommit) {
    this.initCommit = initCommit;
    return this;
  }

  /**
   * Get initCommit
   * @return initCommit
  */
  @Valid 
  @Schema(name = "InitCommit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InitCommit")
  public Commit getInitCommit() {
    return initCommit;
  }

  public void setInitCommit(Commit initCommit) {
    this.initCommit = initCommit;
  }

  public SystemInfo securityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

  public SystemInfo addSecurityOptionsItem(String securityOptionsItem) {
    if (this.securityOptions == null) {
      this.securityOptions = new ArrayList<>();
    }
    this.securityOptions.add(securityOptionsItem);
    return this;
  }

  /**
   * List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), rootless and no-new-privileges.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. 
   * @return securityOptions
  */
  
  @Schema(name = "SecurityOptions", example = "[name=apparmor, name=seccomp,profile=default, name=selinux, name=userns, name=rootless]", description = "List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), rootless and no-new-privileges.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecurityOptions")
  public List<String> getSecurityOptions() {
    return securityOptions;
  }

  public void setSecurityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
  }

  public SystemInfo productLicense(String productLicense) {
    this.productLicense = productLicense;
    return this;
  }

  /**
   * Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included. 
   * @return productLicense
  */
  
  @Schema(name = "ProductLicense", example = "Community Engine", description = "Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductLicense")
  public String getProductLicense() {
    return productLicense;
  }

  public void setProductLicense(String productLicense) {
    this.productLicense = productLicense;
  }

  public SystemInfo defaultAddressPools(List<@Valid SystemInfoDefaultAddressPoolsInner> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
    return this;
  }

  public SystemInfo addDefaultAddressPoolsItem(SystemInfoDefaultAddressPoolsInner defaultAddressPoolsItem) {
    if (this.defaultAddressPools == null) {
      this.defaultAddressPools = new ArrayList<>();
    }
    this.defaultAddressPools.add(defaultAddressPoolsItem);
    return this;
  }

  /**
   * List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools. 
   * @return defaultAddressPools
  */
  @Valid 
  @Schema(name = "DefaultAddressPools", description = "List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultAddressPools")
  public List<@Valid SystemInfoDefaultAddressPoolsInner> getDefaultAddressPools() {
    return defaultAddressPools;
  }

  public void setDefaultAddressPools(List<@Valid SystemInfoDefaultAddressPoolsInner> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
  }

  public SystemInfo warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SystemInfo addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user. 
   * @return warnings
  */
  
  @Schema(name = "Warnings", example = "[WARNING: No memory limit support, WARNING: bridge-nf-call-iptables is disabled, WARNING: bridge-nf-call-ip6tables is disabled]", description = "List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.ID, systemInfo.ID) &&
        Objects.equals(this.containers, systemInfo.containers) &&
        Objects.equals(this.containersRunning, systemInfo.containersRunning) &&
        Objects.equals(this.containersPaused, systemInfo.containersPaused) &&
        Objects.equals(this.containersStopped, systemInfo.containersStopped) &&
        Objects.equals(this.images, systemInfo.images) &&
        Objects.equals(this.driver, systemInfo.driver) &&
        Objects.equals(this.driverStatus, systemInfo.driverStatus) &&
        Objects.equals(this.dockerRootDir, systemInfo.dockerRootDir) &&
        Objects.equals(this.plugins, systemInfo.plugins) &&
        Objects.equals(this.memoryLimit, systemInfo.memoryLimit) &&
        Objects.equals(this.swapLimit, systemInfo.swapLimit) &&
        Objects.equals(this.kernelMemoryTCP, systemInfo.kernelMemoryTCP) &&
        Objects.equals(this.cpuCfsPeriod, systemInfo.cpuCfsPeriod) &&
        Objects.equals(this.cpuCfsQuota, systemInfo.cpuCfsQuota) &&
        Objects.equals(this.cpUShares, systemInfo.cpUShares) &&
        Objects.equals(this.cpUSet, systemInfo.cpUSet) &&
        Objects.equals(this.pidsLimit, systemInfo.pidsLimit) &&
        Objects.equals(this.oomKillDisable, systemInfo.oomKillDisable) &&
        Objects.equals(this.ipv4Forwarding, systemInfo.ipv4Forwarding) &&
        Objects.equals(this.bridgeNfIptables, systemInfo.bridgeNfIptables) &&
        Objects.equals(this.bridgeNfIp6tables, systemInfo.bridgeNfIp6tables) &&
        Objects.equals(this.debug, systemInfo.debug) &&
        Objects.equals(this.nfd, systemInfo.nfd) &&
        Objects.equals(this.ngoroutines, systemInfo.ngoroutines) &&
        Objects.equals(this.systemTime, systemInfo.systemTime) &&
        Objects.equals(this.loggingDriver, systemInfo.loggingDriver) &&
        Objects.equals(this.cgroupDriver, systemInfo.cgroupDriver) &&
        Objects.equals(this.cgroupVersion, systemInfo.cgroupVersion) &&
        Objects.equals(this.neventsListener, systemInfo.neventsListener) &&
        Objects.equals(this.kernelVersion, systemInfo.kernelVersion) &&
        Objects.equals(this.operatingSystem, systemInfo.operatingSystem) &&
        Objects.equals(this.osVersion, systemInfo.osVersion) &&
        Objects.equals(this.osType, systemInfo.osType) &&
        Objects.equals(this.architecture, systemInfo.architecture) &&
        Objects.equals(this.NCPU, systemInfo.NCPU) &&
        Objects.equals(this.memTotal, systemInfo.memTotal) &&
        Objects.equals(this.indexServerAddress, systemInfo.indexServerAddress) &&
        equalsNullable(this.registryConfig, systemInfo.registryConfig) &&
        Objects.equals(this.genericResources, systemInfo.genericResources) &&
        Objects.equals(this.httpProxy, systemInfo.httpProxy) &&
        Objects.equals(this.httpsProxy, systemInfo.httpsProxy) &&
        Objects.equals(this.noProxy, systemInfo.noProxy) &&
        Objects.equals(this.name, systemInfo.name) &&
        Objects.equals(this.labels, systemInfo.labels) &&
        Objects.equals(this.experimentalBuild, systemInfo.experimentalBuild) &&
        Objects.equals(this.serverVersion, systemInfo.serverVersion) &&
        Objects.equals(this.runtimes, systemInfo.runtimes) &&
        Objects.equals(this.defaultRuntime, systemInfo.defaultRuntime) &&
        Objects.equals(this.swarm, systemInfo.swarm) &&
        Objects.equals(this.liveRestoreEnabled, systemInfo.liveRestoreEnabled) &&
        Objects.equals(this.isolation, systemInfo.isolation) &&
        Objects.equals(this.initBinary, systemInfo.initBinary) &&
        Objects.equals(this.containerdCommit, systemInfo.containerdCommit) &&
        Objects.equals(this.runcCommit, systemInfo.runcCommit) &&
        Objects.equals(this.initCommit, systemInfo.initCommit) &&
        Objects.equals(this.securityOptions, systemInfo.securityOptions) &&
        Objects.equals(this.productLicense, systemInfo.productLicense) &&
        Objects.equals(this.defaultAddressPools, systemInfo.defaultAddressPools) &&
        Objects.equals(this.warnings, systemInfo.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, containers, containersRunning, containersPaused, containersStopped, images, driver, driverStatus, dockerRootDir, plugins, memoryLimit, swapLimit, kernelMemoryTCP, cpuCfsPeriod, cpuCfsQuota, cpUShares, cpUSet, pidsLimit, oomKillDisable, ipv4Forwarding, bridgeNfIptables, bridgeNfIp6tables, debug, nfd, ngoroutines, systemTime, loggingDriver, cgroupDriver, cgroupVersion, neventsListener, kernelVersion, operatingSystem, osVersion, osType, architecture, NCPU, memTotal, indexServerAddress, hashCodeNullable(registryConfig), genericResources, httpProxy, httpsProxy, noProxy, name, labels, experimentalBuild, serverVersion, runtimes, defaultRuntime, swarm, liveRestoreEnabled, isolation, initBinary, containerdCommit, runcCommit, initCommit, securityOptions, productLicense, defaultAddressPools, warnings);
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
    sb.append("class SystemInfo {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    containersRunning: ").append(toIndentedString(containersRunning)).append("\n");
    sb.append("    containersPaused: ").append(toIndentedString(containersPaused)).append("\n");
    sb.append("    containersStopped: ").append(toIndentedString(containersStopped)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverStatus: ").append(toIndentedString(driverStatus)).append("\n");
    sb.append("    dockerRootDir: ").append(toIndentedString(dockerRootDir)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
    sb.append("    swapLimit: ").append(toIndentedString(swapLimit)).append("\n");
    sb.append("    kernelMemoryTCP: ").append(toIndentedString(kernelMemoryTCP)).append("\n");
    sb.append("    cpuCfsPeriod: ").append(toIndentedString(cpuCfsPeriod)).append("\n");
    sb.append("    cpuCfsQuota: ").append(toIndentedString(cpuCfsQuota)).append("\n");
    sb.append("    cpUShares: ").append(toIndentedString(cpUShares)).append("\n");
    sb.append("    cpUSet: ").append(toIndentedString(cpUSet)).append("\n");
    sb.append("    pidsLimit: ").append(toIndentedString(pidsLimit)).append("\n");
    sb.append("    oomKillDisable: ").append(toIndentedString(oomKillDisable)).append("\n");
    sb.append("    ipv4Forwarding: ").append(toIndentedString(ipv4Forwarding)).append("\n");
    sb.append("    bridgeNfIptables: ").append(toIndentedString(bridgeNfIptables)).append("\n");
    sb.append("    bridgeNfIp6tables: ").append(toIndentedString(bridgeNfIp6tables)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    nfd: ").append(toIndentedString(nfd)).append("\n");
    sb.append("    ngoroutines: ").append(toIndentedString(ngoroutines)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    loggingDriver: ").append(toIndentedString(loggingDriver)).append("\n");
    sb.append("    cgroupDriver: ").append(toIndentedString(cgroupDriver)).append("\n");
    sb.append("    cgroupVersion: ").append(toIndentedString(cgroupVersion)).append("\n");
    sb.append("    neventsListener: ").append(toIndentedString(neventsListener)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    NCPU: ").append(toIndentedString(NCPU)).append("\n");
    sb.append("    memTotal: ").append(toIndentedString(memTotal)).append("\n");
    sb.append("    indexServerAddress: ").append(toIndentedString(indexServerAddress)).append("\n");
    sb.append("    registryConfig: ").append(toIndentedString(registryConfig)).append("\n");
    sb.append("    genericResources: ").append(toIndentedString(genericResources)).append("\n");
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpsProxy: ").append(toIndentedString(httpsProxy)).append("\n");
    sb.append("    noProxy: ").append(toIndentedString(noProxy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    experimentalBuild: ").append(toIndentedString(experimentalBuild)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    runtimes: ").append(toIndentedString(runtimes)).append("\n");
    sb.append("    defaultRuntime: ").append(toIndentedString(defaultRuntime)).append("\n");
    sb.append("    swarm: ").append(toIndentedString(swarm)).append("\n");
    sb.append("    liveRestoreEnabled: ").append(toIndentedString(liveRestoreEnabled)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    initBinary: ").append(toIndentedString(initBinary)).append("\n");
    sb.append("    containerdCommit: ").append(toIndentedString(containerdCommit)).append("\n");
    sb.append("    runcCommit: ").append(toIndentedString(runcCommit)).append("\n");
    sb.append("    initCommit: ").append(toIndentedString(initCommit)).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(securityOptions)).append("\n");
    sb.append("    productLicense: ").append(toIndentedString(productLicense)).append("\n");
    sb.append("    defaultAddressPools: ").append(toIndentedString(defaultAddressPools)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

