package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.Address;
import com.tgf.vm.model.EndpointSettings;
import com.tgf.vm.model.PortBinding;
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
 * NetworkSettings exposes the network settings in the API
 */

@Schema(name = "NetworkSettings", description = "NetworkSettings exposes the network settings in the API")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkSettings {

  private String bridge;

  private String sandboxID;

  private Boolean hairpinMode;

  private String linkLocalIPv6Address;

  private Integer linkLocalIPv6PrefixLen;

  @Valid
  private Map<String, List<@Valid PortBinding>> ports = new HashMap<>();

  private String sandboxKey;

  @Valid
  private JsonNullable<List<@Valid Address>> secondaryIPAddresses = JsonNullable.<List<@Valid Address>>undefined();

  @Valid
  private JsonNullable<List<@Valid Address>> secondaryIPv6Addresses = JsonNullable.<List<@Valid Address>>undefined();

  private String endpointID;

  private String gateway;

  private String globalIPv6Address;

  private Integer globalIPv6PrefixLen;

  private String ipAddress;

  private Integer ipPrefixLen;

  private String ipv6Gateway;

  private String macAddress;

  @Valid
  private Map<String, EndpointSettings> networks = new HashMap<>();

  public NetworkSettings bridge(String bridge) {
    this.bridge = bridge;
    return this;
  }

  /**
   * Name of the network's bridge (for example, `docker0`).
   * @return bridge
  */
  
  @Schema(name = "Bridge", example = "docker0", description = "Name of the network's bridge (for example, `docker0`).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Bridge")
  public String getBridge() {
    return bridge;
  }

  public void setBridge(String bridge) {
    this.bridge = bridge;
  }

  public NetworkSettings sandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
    return this;
  }

  /**
   * SandboxID uniquely represents a container's network stack.
   * @return sandboxID
  */
  
  @Schema(name = "SandboxID", example = "9d12daf2c33f5959c8bf90aa513e4f65b561738661003029ec84830cd503a0c3", description = "SandboxID uniquely represents a container's network stack.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SandboxID")
  public String getSandboxID() {
    return sandboxID;
  }

  public void setSandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
  }

  public NetworkSettings hairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
    return this;
  }

  /**
   * Indicates if hairpin NAT should be enabled on the virtual interface. 
   * @return hairpinMode
  */
  
  @Schema(name = "HairpinMode", example = "false", description = "Indicates if hairpin NAT should be enabled on the virtual interface. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HairpinMode")
  public Boolean getHairpinMode() {
    return hairpinMode;
  }

  public void setHairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
  }

  public NetworkSettings linkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
    return this;
  }

  /**
   * IPv6 unicast address using the link-local prefix.
   * @return linkLocalIPv6Address
  */
  
  @Schema(name = "LinkLocalIPv6Address", example = "fe80::42:acff:fe11:1", description = "IPv6 unicast address using the link-local prefix.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LinkLocalIPv6Address")
  public String getLinkLocalIPv6Address() {
    return linkLocalIPv6Address;
  }

  public void setLinkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
  }

  public NetworkSettings linkLocalIPv6PrefixLen(Integer linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
    return this;
  }

  /**
   * Prefix length of the IPv6 unicast address.
   * @return linkLocalIPv6PrefixLen
  */
  
  @Schema(name = "LinkLocalIPv6PrefixLen", example = "64", description = "Prefix length of the IPv6 unicast address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LinkLocalIPv6PrefixLen")
  public Integer getLinkLocalIPv6PrefixLen() {
    return linkLocalIPv6PrefixLen;
  }

  public void setLinkLocalIPv6PrefixLen(Integer linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
  }

  public NetworkSettings ports(Map<String, List<@Valid PortBinding>> ports) {
    this.ports = ports;
    return this;
  }

  public NetworkSettings putPortsItem(String key, List<@Valid PortBinding> portsItem) {
    if (this.ports == null) {
      this.ports = new HashMap<>();
    }
    this.ports.put(key, portsItem);
    return this;
  }

  /**
   * PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. 
   * @return ports
  */
  @Valid 
  @Schema(name = "Ports", example = "{443/tcp=[{HostIp=127.0.0.1, HostPort=4443}], 80/tcp=[{HostIp=0.0.0.0, HostPort=80}, {HostIp=0.0.0.0, HostPort=8080}], 80/udp=[{HostIp=0.0.0.0, HostPort=80}], 53/udp=[{HostIp=0.0.0.0, HostPort=53}]}", description = "PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ports")
  public Map<String, List<@Valid PortBinding>> getPorts() {
    return ports;
  }

  public void setPorts(Map<String, List<@Valid PortBinding>> ports) {
    this.ports = ports;
  }

  public NetworkSettings sandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
    return this;
  }

  /**
   * SandboxKey identifies the sandbox
   * @return sandboxKey
  */
  
  @Schema(name = "SandboxKey", example = "/var/run/docker/netns/8ab54b426c38", description = "SandboxKey identifies the sandbox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SandboxKey")
  public String getSandboxKey() {
    return sandboxKey;
  }

  public void setSandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
  }

  public NetworkSettings secondaryIPAddresses(List<@Valid Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = JsonNullable.of(secondaryIPAddresses);
    return this;
  }

  public NetworkSettings addSecondaryIPAddressesItem(Address secondaryIPAddressesItem) {
    if (this.secondaryIPAddresses == null || !this.secondaryIPAddresses.isPresent()) {
      this.secondaryIPAddresses = JsonNullable.of(new ArrayList<>());
    }
    this.secondaryIPAddresses.get().add(secondaryIPAddressesItem);
    return this;
  }

  /**
   * 
   * @return secondaryIPAddresses
  */
  @Valid 
  @Schema(name = "SecondaryIPAddresses", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryIPAddresses")
  public JsonNullable<List<@Valid Address>> getSecondaryIPAddresses() {
    return secondaryIPAddresses;
  }

  public void setSecondaryIPAddresses(JsonNullable<List<@Valid Address>> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
  }

  public NetworkSettings secondaryIPv6Addresses(List<@Valid Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = JsonNullable.of(secondaryIPv6Addresses);
    return this;
  }

  public NetworkSettings addSecondaryIPv6AddressesItem(Address secondaryIPv6AddressesItem) {
    if (this.secondaryIPv6Addresses == null || !this.secondaryIPv6Addresses.isPresent()) {
      this.secondaryIPv6Addresses = JsonNullable.of(new ArrayList<>());
    }
    this.secondaryIPv6Addresses.get().add(secondaryIPv6AddressesItem);
    return this;
  }

  /**
   * 
   * @return secondaryIPv6Addresses
  */
  @Valid 
  @Schema(name = "SecondaryIPv6Addresses", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryIPv6Addresses")
  public JsonNullable<List<@Valid Address>> getSecondaryIPv6Addresses() {
    return secondaryIPv6Addresses;
  }

  public void setSecondaryIPv6Addresses(JsonNullable<List<@Valid Address>> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
  }

  public NetworkSettings endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * EndpointID uniquely represents a service endpoint in a Sandbox.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return endpointID
  */
  
  @Schema(name = "EndpointID", example = "b88f5b905aabf2893f3cbc4ee42d1ea7980bbc0a92e2c8922b1e1795298afb0b", description = "EndpointID uniquely represents a service endpoint in a Sandbox.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndpointID")
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }

  public NetworkSettings gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Gateway address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return gateway
  */
  
  @Schema(name = "Gateway", example = "172.17.0.1", description = "Gateway address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Gateway")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public NetworkSettings globalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * Global IPv6 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return globalIPv6Address
  */
  
  @Schema(name = "GlobalIPv6Address", example = "2001:db8::5689", description = "Global IPv6 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GlobalIPv6Address")
  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }

  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }

  public NetworkSettings globalIPv6PrefixLen(Integer globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * Mask length of the global IPv6 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return globalIPv6PrefixLen
  */
  
  @Schema(name = "GlobalIPv6PrefixLen", example = "64", description = "Mask length of the global IPv6 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GlobalIPv6PrefixLen")
  public Integer getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }

  public void setGlobalIPv6PrefixLen(Integer globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }

  public NetworkSettings ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IPv4 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return ipAddress
  */
  
  @Schema(name = "IPAddress", example = "172.17.0.4", description = "IPv4 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public NetworkSettings ipPrefixLen(Integer ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * Mask length of the IPv4 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return ipPrefixLen
  */
  
  @Schema(name = "IPPrefixLen", example = "16", description = "Mask length of the IPv4 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPPrefixLen")
  public Integer getIpPrefixLen() {
    return ipPrefixLen;
  }

  public void setIpPrefixLen(Integer ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }

  public NetworkSettings ipv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * IPv6 gateway address for this network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return ipv6Gateway
  */
  
  @Schema(name = "IPv6Gateway", example = "2001:db8:2::100", description = "IPv6 gateway address for this network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv6Gateway")
  public String getIpv6Gateway() {
    return ipv6Gateway;
  }

  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }

  public NetworkSettings macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MAC address for the container on the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 
   * @return macAddress
  */
  
  @Schema(name = "MacAddress", example = "02:42:ac:11:00:04", description = "MAC address for the container on the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0 ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MacAddress")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public NetworkSettings networks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
    return this;
  }

  public NetworkSettings putNetworksItem(String key, EndpointSettings networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Information about all networks that the container is connected to. 
   * @return networks
  */
  @Valid 
  @Schema(name = "Networks", description = "Information about all networks that the container is connected to. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Networks")
  public Map<String, EndpointSettings> getNetworks() {
    return networks;
  }

  public void setNetworks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSettings networkSettings = (NetworkSettings) o;
    return Objects.equals(this.bridge, networkSettings.bridge) &&
        Objects.equals(this.sandboxID, networkSettings.sandboxID) &&
        Objects.equals(this.hairpinMode, networkSettings.hairpinMode) &&
        Objects.equals(this.linkLocalIPv6Address, networkSettings.linkLocalIPv6Address) &&
        Objects.equals(this.linkLocalIPv6PrefixLen, networkSettings.linkLocalIPv6PrefixLen) &&
        Objects.equals(this.ports, networkSettings.ports) &&
        Objects.equals(this.sandboxKey, networkSettings.sandboxKey) &&
        equalsNullable(this.secondaryIPAddresses, networkSettings.secondaryIPAddresses) &&
        equalsNullable(this.secondaryIPv6Addresses, networkSettings.secondaryIPv6Addresses) &&
        Objects.equals(this.endpointID, networkSettings.endpointID) &&
        Objects.equals(this.gateway, networkSettings.gateway) &&
        Objects.equals(this.globalIPv6Address, networkSettings.globalIPv6Address) &&
        Objects.equals(this.globalIPv6PrefixLen, networkSettings.globalIPv6PrefixLen) &&
        Objects.equals(this.ipAddress, networkSettings.ipAddress) &&
        Objects.equals(this.ipPrefixLen, networkSettings.ipPrefixLen) &&
        Objects.equals(this.ipv6Gateway, networkSettings.ipv6Gateway) &&
        Objects.equals(this.macAddress, networkSettings.macAddress) &&
        Objects.equals(this.networks, networkSettings.networks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge, sandboxID, hairpinMode, linkLocalIPv6Address, linkLocalIPv6PrefixLen, ports, sandboxKey, hashCodeNullable(secondaryIPAddresses), hashCodeNullable(secondaryIPv6Addresses), endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, ipAddress, ipPrefixLen, ipv6Gateway, macAddress, networks);
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
    sb.append("class NetworkSettings {\n");
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    sandboxID: ").append(toIndentedString(sandboxID)).append("\n");
    sb.append("    hairpinMode: ").append(toIndentedString(hairpinMode)).append("\n");
    sb.append("    linkLocalIPv6Address: ").append(toIndentedString(linkLocalIPv6Address)).append("\n");
    sb.append("    linkLocalIPv6PrefixLen: ").append(toIndentedString(linkLocalIPv6PrefixLen)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    sandboxKey: ").append(toIndentedString(sandboxKey)).append("\n");
    sb.append("    secondaryIPAddresses: ").append(toIndentedString(secondaryIPAddresses)).append("\n");
    sb.append("    secondaryIPv6Addresses: ").append(toIndentedString(secondaryIPv6Addresses)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIPv6Address: ").append(toIndentedString(globalIPv6Address)).append("\n");
    sb.append("    globalIPv6PrefixLen: ").append(toIndentedString(globalIPv6PrefixLen)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPrefixLen: ").append(toIndentedString(ipPrefixLen)).append("\n");
    sb.append("    ipv6Gateway: ").append(toIndentedString(ipv6Gateway)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

