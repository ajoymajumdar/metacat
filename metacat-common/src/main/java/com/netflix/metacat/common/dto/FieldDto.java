/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.metacat.common.dto;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Field DTO.
 */
@ApiModel(description = "Table field/column metadata")
@SuppressWarnings("unused")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class FieldDto extends BaseDto {
    private static final long serialVersionUID = 9096928516299407324L;

    @ApiModelProperty(value = "Comment of the field/column")
    private String comment;
    @ApiModelProperty(value = "Name of the field/column", required = true)
    private String name;
    @ApiModelProperty(value = "Is it a partition Key. If true, it is a partition key.")
    @SuppressWarnings("checkstyle:membername")
    private boolean partition_key;
    @ApiModelProperty(value = "Position of the field/column", required = true)
    private Integer pos;
    @ApiModelProperty(value = "Source type of the field/column")
    @SuppressWarnings("checkstyle:membername")
    private String source_type;
    @ApiModelProperty(value = "Type of the field/column", required = true)
    private String type;
    @ApiModelProperty(value = "Type of the field/column in JSON format",
        accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private JsonNode jsonType;
    @ApiModelProperty(value = "Can the field/column be null")
    private Boolean isNullable;
    @ApiModelProperty(value = "Size of the field/column")
    private Integer size;
    @ApiModelProperty(value = "Default value of the column")
    private String defaultValue;
    @ApiModelProperty(value = "Is the column a sorted key")
    private Boolean isSortKey;
    @ApiModelProperty(value = "Is the column an index key")
    private Boolean isIndexKey;

    @SuppressWarnings("checkstyle:methodname")
    public String getSource_type() {
        return source_type;
    }
    @SuppressWarnings("checkstyle:methodname")
    public void setSource_type(final String sourceType) {
        this.source_type = sourceType;
    }

    @SuppressWarnings("checkstyle:methodname")
    public boolean isPartition_key() {
        return partition_key;
    }
    @SuppressWarnings("checkstyle:methodname")
    public void setPartition_key(final boolean partitionKey) {
        this.partition_key = partitionKey;
    }
}
