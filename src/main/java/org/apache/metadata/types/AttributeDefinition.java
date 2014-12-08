/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.metadata.types;

public final class AttributeDefinition {

    public final String name;
    public final String dataTypeName;
    public final Multiplicity multiplicity;
    public final boolean isComposite;
    /**
     * If this is a reference attribute, then the name of the attribute on the Class
     * that this refers to.
     */
    public final String reverseAttributeName;

    public AttributeDefinition(String name, String dataTypeName, Multiplicity multiplicity,
                               boolean isComposite, String reverseAttributeName) {
        this.name = name;
        this.dataTypeName = dataTypeName;
        this.multiplicity = multiplicity;
        this.isComposite = isComposite;
        this.reverseAttributeName = reverseAttributeName;
    }
}
