/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsWeightRule  extends AbstractModel{

    /**
    * 负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改权重的后端机器列表
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * 转发规则的ID，七层规则时需要此参数，4层规则不需要
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标规则的域名，提供LocationId参数时本参数不生效
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标规则的URL，提供LocationId参数时本参数不生效
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 后端服务新的转发权重，取值范围：0~100。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
     * 获取负载均衡监听器 ID
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取要修改权重的后端机器列表
     * @return Targets 要修改权重的后端机器列表
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * 设置要修改权重的后端机器列表
     * @param Targets 要修改权重的后端机器列表
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * 获取转发规则的ID，七层规则时需要此参数，4层规则不需要
     * @return LocationId 转发规则的ID，七层规则时需要此参数，4层规则不需要
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置转发规则的ID，七层规则时需要此参数，4层规则不需要
     * @param LocationId 转发规则的ID，七层规则时需要此参数，4层规则不需要
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 获取目标规则的域名，提供LocationId参数时本参数不生效
     * @return Domain 目标规则的域名，提供LocationId参数时本参数不生效
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置目标规则的域名，提供LocationId参数时本参数不生效
     * @param Domain 目标规则的域名，提供LocationId参数时本参数不生效
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取目标规则的URL，提供LocationId参数时本参数不生效
     * @return Url 目标规则的URL，提供LocationId参数时本参数不生效
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置目标规则的URL，提供LocationId参数时本参数不生效
     * @param Url 目标规则的URL，提供LocationId参数时本参数不生效
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取后端服务新的转发权重，取值范围：0~100。
     * @return Weight 后端服务新的转发权重，取值范围：0~100。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置后端服务新的转发权重，取值范围：0~100。
     * @param Weight 后端服务新的转发权重，取值范围：0~100。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}
