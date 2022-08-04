// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditAndroidContext {

  @SerializedName("udid")
  private String udid;
  @SerializedName("did")
  private String did;
  @SerializedName("app_ver")
  private String appVer;
  @SerializedName("ver")
  private String ver;
  @SerializedName("region")
  private String region;
  @SerializedName("id_i")
  private String idI;
  @SerializedName("id_r")
  private String idR;
  @SerializedName("hw_brand")
  private String hwBrand;
  @SerializedName("hw_manuf")
  private String hwManuf;
  @SerializedName("wifip")
  private String wifip;
  @SerializedName("route_iip")
  private String routeIip;
  @SerializedName("route_gip")
  private String routeGip;
  @SerializedName("env_su")
  private String envSu;
  @SerializedName("env_tz")
  private String envTz;
  @SerializedName("env_ml")
  private String envMl;
  @SerializedName("location")
  private String location;
  @SerializedName("active_ip")
  private String activeIp;
  @SerializedName("active_ip_detail")
  private String activeIpDetail;
  @SerializedName("cell_base_station")
  private String cellBaseStation;
  @SerializedName("IP")
  private String iP;

  // builder 开始
  public AuditAndroidContext() {
  }

  public AuditAndroidContext(Builder builder) {
    this.udid = builder.udid;
    this.did = builder.did;
    this.appVer = builder.appVer;
    this.ver = builder.ver;
    this.region = builder.region;
    this.idI = builder.idI;
    this.idR = builder.idR;
    this.hwBrand = builder.hwBrand;
    this.hwManuf = builder.hwManuf;
    this.wifip = builder.wifip;
    this.routeIip = builder.routeIip;
    this.routeGip = builder.routeGip;
    this.envSu = builder.envSu;
    this.envTz = builder.envTz;
    this.envMl = builder.envMl;
    this.location = builder.location;
    this.activeIp = builder.activeIp;
    this.activeIpDetail = builder.activeIpDetail;
    this.cellBaseStation = builder.cellBaseStation;
    this.iP = builder.iP;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUdid() {
    return this.udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public String getDid() {
    return this.did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public String getAppVer() {
    return this.appVer;
  }

  public void setAppVer(String appVer) {
    this.appVer = appVer;
  }

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getIdI() {
    return this.idI;
  }

  public void setIdI(String idI) {
    this.idI = idI;
  }

  public String getIdR() {
    return this.idR;
  }

  public void setIdR(String idR) {
    this.idR = idR;
  }

  public String getHwBrand() {
    return this.hwBrand;
  }

  public void setHwBrand(String hwBrand) {
    this.hwBrand = hwBrand;
  }

  public String getHwManuf() {
    return this.hwManuf;
  }

  public void setHwManuf(String hwManuf) {
    this.hwManuf = hwManuf;
  }

  public String getWifip() {
    return this.wifip;
  }

  public void setWifip(String wifip) {
    this.wifip = wifip;
  }

  public String getRouteIip() {
    return this.routeIip;
  }

  public void setRouteIip(String routeIip) {
    this.routeIip = routeIip;
  }

  public String getRouteGip() {
    return this.routeGip;
  }

  public void setRouteGip(String routeGip) {
    this.routeGip = routeGip;
  }

  public String getEnvSu() {
    return this.envSu;
  }

  public void setEnvSu(String envSu) {
    this.envSu = envSu;
  }

  public String getEnvTz() {
    return this.envTz;
  }

  public void setEnvTz(String envTz) {
    this.envTz = envTz;
  }

  public String getEnvMl() {
    return this.envMl;
  }

  public void setEnvMl(String envMl) {
    this.envMl = envMl;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getActiveIp() {
    return this.activeIp;
  }

  public void setActiveIp(String activeIp) {
    this.activeIp = activeIp;
  }

  public String getActiveIpDetail() {
    return this.activeIpDetail;
  }

  public void setActiveIpDetail(String activeIpDetail) {
    this.activeIpDetail = activeIpDetail;
  }

  public String getCellBaseStation() {
    return this.cellBaseStation;
  }

  public void setCellBaseStation(String cellBaseStation) {
    this.cellBaseStation = cellBaseStation;
  }

  public String getIP() {
    return this.iP;
  }

  public void setIP(String iP) {
    this.iP = iP;
  }

  public static class Builder {

    private String udid;
    private String did;
    private String appVer;
    private String ver;
    private String region;
    private String idI;
    private String idR;
    private String hwBrand;
    private String hwManuf;
    private String wifip;
    private String routeIip;
    private String routeGip;
    private String envSu;
    private String envTz;
    private String envMl;
    private String location;
    private String activeIp;
    private String activeIpDetail;
    private String cellBaseStation;
    private String iP;

    public Builder udid(String udid) {
      this.udid = udid;
      return this;
    }

    public Builder did(String did) {
      this.did = did;
      return this;
    }

    public Builder appVer(String appVer) {
      this.appVer = appVer;
      return this;
    }

    public Builder ver(String ver) {
      this.ver = ver;
      return this;
    }

    public Builder region(String region) {
      this.region = region;
      return this;
    }

    public Builder idI(String idI) {
      this.idI = idI;
      return this;
    }

    public Builder idR(String idR) {
      this.idR = idR;
      return this;
    }

    public Builder hwBrand(String hwBrand) {
      this.hwBrand = hwBrand;
      return this;
    }

    public Builder hwManuf(String hwManuf) {
      this.hwManuf = hwManuf;
      return this;
    }

    public Builder wifip(String wifip) {
      this.wifip = wifip;
      return this;
    }

    public Builder routeIip(String routeIip) {
      this.routeIip = routeIip;
      return this;
    }

    public Builder routeGip(String routeGip) {
      this.routeGip = routeGip;
      return this;
    }

    public Builder envSu(String envSu) {
      this.envSu = envSu;
      return this;
    }

    public Builder envTz(String envTz) {
      this.envTz = envTz;
      return this;
    }

    public Builder envMl(String envMl) {
      this.envMl = envMl;
      return this;
    }

    public Builder location(String location) {
      this.location = location;
      return this;
    }

    public Builder activeIp(String activeIp) {
      this.activeIp = activeIp;
      return this;
    }

    public Builder activeIpDetail(String activeIpDetail) {
      this.activeIpDetail = activeIpDetail;
      return this;
    }

    public Builder cellBaseStation(String cellBaseStation) {
      this.cellBaseStation = cellBaseStation;
      return this;
    }

    public Builder iP(String iP) {
      this.iP = iP;
      return this;
    }


    public AuditAndroidContext build() {
      return new AuditAndroidContext(this);
    }
  }
}
