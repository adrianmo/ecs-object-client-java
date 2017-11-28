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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum ConditionKey {
    @XmlEnumValue("aws:CurrentTime")
    CurrentTime("aws:CurrentTime"),
    @XmlEnumValue("aws:EpochTime")
    EpochTime("aws:EpochTime"),
    @XmlEnumValue("aws:principalType")
    PrincipalType("aws:principalType"),
    @XmlEnumValue("aws:SourceIp")
    SourceIp("aws:SourceIp"),
    @XmlEnumValue("aws:UserAgent")
    UserAgent("aws:UserAgent"),
    @XmlEnumValue("aws:username")
    UserName("aws:username"),
    @XmlEnumValue("s3:x-amz-acl")
    Acl("s3:x-amz-acl"),
    @XmlEnumValue("s3:x-amz-server-side-encryption")
    ServerSideEncryption("s3:x-amz-server-side-encryption"),
    @XmlEnumValue("s3:VersionId")
    VersionId("s3:VersionId"),
    @XmlEnumValue("s3:x-amz-grant-permission")
    GrantPermission("s3:x-amz-grant-permission"),
    @XmlEnumValue("s3:prefix")
    Prefix("s3:prefix"),
    @XmlEnumValue("s3:delimiter")
    Delimiter("s3:delimiter"),
    @XmlEnumValue("s3:max-keys")
    MaxKeys("s3:max-keys");

    private String conditionKey;

    ConditionKey(String actionName) {
        this.conditionKey = conditionKey;
    }

    //@XmlTransient
    public String getConditionKey() {
        return conditionKey;
    }
}
