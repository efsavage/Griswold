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
package com.efsavage.griswold;

/**
 * Defines base URLs for the Shopify API.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
public class ShopifyApi {

	/**
	 * Base URL for product list.
	 * 
	 * @see <a
	 *      href="http://api.shopify.com/product.html#index">http://api.shopify.com/product.html#index</a>
	 */
	public final static String BASE_URL_PRODUCT_LIST = "/admin/products.json";

	/**
	 * Base URL for single product.
	 * 
	 * @see <a
	 *      href="http://api.shopify.com/product.html#show">http://api.shopify.com/product.html#show</a>
	 */
	public final static String BASE_URL_PRODUCT = "/admin/products/{id}.json";

	/**
	 * Base URL for a list of product metafields.
	 * 
	 * @see <a
	 *      href="http://api.shopify.com/metafield.html#index">http://api.shopify.com/metafield.html#index</a>
	 */
	public final static String BASE_URL_PRODUCT_META = "/admin/products/{id}/metafields.json";

}
