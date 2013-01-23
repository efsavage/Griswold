/*
 *  Copyright 2013 Eric F. Savage, code@efsavage.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *   
 *   This product is designed for use with the Shopify API, but is not 
 *   certified, endorsed or sponsored by Shopify.   Eric F. Savage is not 
 *   affiliated with, employed by, or related to Shopify beyond than being a 
 *   registered partner and satisfied customer.
 *   
 */
package com.efsavage.griswold.model;

import java.util.Date;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metafield attached to a shop or product.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
@Data
public class Metafield {

	@JsonProperty("created_at")
	Date createdAt;

	String description;
	String id;
	String key;
	String namespace;

	@JsonProperty("owner_id")
	String ownerId;

	@JsonProperty("updated_at")
	String updatedAt;

	String value;

	@JsonProperty("value_type")
	String valueType;

	@JsonProperty("owner_resource")
	String ownerResource;

}
