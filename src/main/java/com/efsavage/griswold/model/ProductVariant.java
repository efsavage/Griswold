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
 * A variation on a product.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
@Data
public class ProductVariant {

	@JsonProperty("compare_at_price")
	String compareAtPrice;

	@JsonProperty("created_at")
	Date createdAt;

	@JsonProperty("fulfillment_service")
	String fulfillmentService;

	Integer grams;

	String id;

	@JsonProperty("inventory_management")
	String inventoryManagement;

	@JsonProperty("inventory_policy")
	String inventoryPolicy;

	String option1;
	String option2;
	String option3;

	String position;
	String price;
	String product_id;
	String requires_shipping;
	String sku;
	String taxable;
	String title;

	@JsonProperty("updated_at")
	Date updatedAt;

	@JsonProperty("inventory_quantity")
	Date inventoryQuantity;

}
