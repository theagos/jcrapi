/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("org.mili.generator")
public class TeamClan {

    @SerializedName("tag")
    private String tag;

    @SerializedName("name")
    private String name;

    @SerializedName("badge")
    private Badge badge;

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
    public Badge getBadge() {
        return badge;
    }
    
    public String toString() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("TeamClan{");
        s.append("tag=");
        s.append(tag);
        s.append(", ");
        s.append("name=");
        s.append(name);
        s.append(", ");
        s.append("badge=");
        s.append(badge);
        s.append("}");
        return s.toString();
    }

}