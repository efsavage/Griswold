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
 *   affiliated with, employed by, or related to Shopify beyond being a 
 *   registered partner and satisfied customer.
 *   
 */
package com.efsavage.griswold;

import java.util.List;

import com.efsavage.griswold.model.Metafield;
import com.efsavage.griswold.model.Product;
import com.efsavage.griswold.request.ProductListRequest;

/**
 * Defines all available operations that this client library supports.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
public interface ShopifyClient {

	/**
	 * Returns a list of all products without any criteria. This will use
	 * defaults for some parameters, notably limit=50 and page=1.
	 * 
	 * @return List of all products.
	 * @throws ShopifyClientException
	 *             If there was an error that came from the server.
	 * @throws ShopifyServerException
	 *             If there was an error on the client, typically a
	 *             configuration issue.
	 */
	List<Product> getProducts() throws ShopifyServerException, ShopifyClientException;

	/**
	 * Returns a list of all products without any criteria.
	 * 
	 * @param productListRequest
	 *            The parameters for the request.
	 * @return List of all products.
	 * @throws ShopifyClientException
	 *             If there was an error that came from the server.
	 * @throws ShopifyServerException
	 *             If there was an error on the client, typically a
	 *             configuration issue.
	 */
	List<Product> getProducts(final ProductListRequest productListRequest) throws ShopifyServerException, ShopifyClientException;

	/**
	 * Returns a list of the {@link Metafield}s for a {@link Product}.
	 * 
	 * @param product
	 *            The product requested.
	 * @return List of meta fields for a product, may be empty but will not be
	 *         null.
	 * @throws ShopifyClientException
	 *             If there was an error that came from the server.
	 * @throws ShopifyServerException
	 *             If there was an error on the client, typically a
	 *             configuration issue.
	 */
	List<Metafield> getProductMetafields(final Product product) throws ShopifyServerException, ShopifyClientException;

	/**
	 * Returns a list of the {@link Metafield}s for a {@link Product}.
	 * 
	 * @param productId
	 *            The Shopify ID of the product requested.
	 * @return List of meta fields for a product, may be empty but will not be
	 *         null.
	 * @throws ShopifyClientException
	 *             If there was an error that came from the server.
	 * @throws ShopifyServerException
	 *             If there was an error on the client, typically a
	 *             configuration issue.
	 */
	List<Metafield> getProductMetafields(final String productId) throws ShopifyServerException, ShopifyClientException;

}
