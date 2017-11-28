/*
 * Copyright (c) 2015, EMC Corporation.
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * + Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * + Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * + The name of EMC Corporation may not be used to endorse or promote
 *   products derived from this software without specific prior written
 *   permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.emc.object.s3.bean;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketPolicyStatement {
    private String sId;
    private List<Condition> conditions = new ArrayList<Condition>();
    //private Map<ConditionOperator, Condition> conditions = new HashMap<ConditionOperator, Condition>();
    private Effect effect;
    private String principal;
    private List<BucketPolicyAction> action = new ArrayList<BucketPolicyAction>();

    public BucketPolicyStatement() {}

    public BucketPolicyStatement withSid(String sId) {
        setSid(sId);
        return this;
    }

    @XmlElement(name = "Sid", namespace = "")
    public String getSid() { return sId; }

    public void setSid(String sId) { this.sId = sId; }

    @XmlElement(name = "Effect", namespace = "")
    public Effect getEffect() { return effect; }

    public void setEffect(Effect effect) { this.effect = effect; }

    @XmlElement(name = "Principal", namespace = "")
    public String getPrincipal() { return principal; }

    public void setPrincipal(String principal) { this.principal= principal; }

    @XmlElement(name = "Condition", namespace = "")
    public List<Condition> getConditions() { return conditions; }

    public void setConditions(List<Condition> conditions) { this.conditions = conditions; }

    @XmlElement(name = "Action", namespace = "")
    public List<BucketPolicyAction> getAction() { return action; }

    public void setAction(List<BucketPolicyAction> action) { this.action = action; }

    @XmlEnum
    public static enum Effect {
        Allow, Deny
    }
}