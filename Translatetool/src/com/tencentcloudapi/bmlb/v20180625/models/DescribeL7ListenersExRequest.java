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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL7ListenersExRequest  extends AbstractModel{

    /**
    * 返回的监听器中标识是否绑定在此流量镜像中。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 待获取监听器所在的VPC的ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 此VPC中获取负载均衡的偏移。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 此VPC中获取负载均衡的数量。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 过滤条件。
LoadBalancerId - String - （过滤条件）负载均衡ID。
LoadBalancerName - String - （过滤条件）负载均衡名称。
Vip - String - （过滤条件）VIP。
ListenerId - String - （过滤条件）监听器ID。
ListenerName -  String - （过滤条件）监听器名称。
Protocol -  String - （过滤条件）七层协议。
LoadBalancerPort -  String - （过滤条件）监听器端口。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * 获取返回的监听器中标识是否绑定在此流量镜像中。
     * @return TrafficMirrorId 返回的监听器中标识是否绑定在此流量镜像中。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * 设置返回的监听器中标识是否绑定在此流量镜像中。
     * @param TrafficMirrorId 返回的监听器中标识是否绑定在此流量镜像中。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * 获取待获取监听器所在的VPC的ID。
     * @return VpcId 待获取监听器所在的VPC的ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置待获取监听器所在的VPC的ID。
     * @param VpcId 待获取监听器所在的VPC的ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取此VPC中获取负载均衡的偏移。
     * @return Offset 此VPC中获取负载均衡的偏移。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置此VPC中获取负载均衡的偏移。
     * @param Offset 此VPC中获取负载均衡的偏移。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取此VPC中获取负载均衡的数量。
     * @return Limit 此VPC中获取负载均衡的数量。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置此VPC中获取负载均衡的数量。
     * @param Limit 此VPC中获取负载均衡的数量。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取过滤条件。
LoadBalancerId - String - （过滤条件）负载均衡ID。
LoadBalancerName - String - （过滤条件）负载均衡名称。
Vip - String - （过滤条件）VIP。
ListenerId - String - （过滤条件）监听器ID。
ListenerName -  String - （过滤条件）监听器名称。
Protocol -  String - （过滤条件）七层协议。
LoadBalancerPort -  String - （过滤条件）监听器端口。
     * @return Filters 过滤条件。
LoadBalancerId - String - （过滤条件）负载均衡ID。
LoadBalancerName - String - （过滤条件）负载均衡名称。
Vip - String - （过滤条件）VIP。
ListenerId - String - （过滤条件）监听器ID。
ListenerName -  String - （过滤条件）监听器名称。
Protocol -  String - （过滤条件）七层协议。
LoadBalancerPort -  String - （过滤条件）监听器端口。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
LoadBalancerId - String - （过滤条件）负载均衡ID。
LoadBalancerName - String - （过滤条件）负载均衡名称。
Vip - String - （过滤条件）VIP。
ListenerId - String - （过滤条件）监听器ID。
ListenerName -  String - （过滤条件）监听器名称。
Protocol -  String - （过滤条件）七层协议。
LoadBalancerPort -  String - （过滤条件）监听器端口。
     * @param Filters 过滤条件。
LoadBalancerId - String - （过滤条件）负载均衡ID。
LoadBalancerName - String - （过滤条件）负载均衡名称。
Vip - String - （过滤条件）VIP。
ListenerId - String - （过滤条件）监听器ID。
ListenerName -  String - （过滤条件）监听器名称。
Protocol -  String - （过滤条件）七层协议。
LoadBalancerPort -  String - （过滤条件）监听器端口。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

