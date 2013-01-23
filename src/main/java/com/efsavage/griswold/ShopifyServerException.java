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

/**
 * Thrown when an unexpected error occurs on the server. These typically cannot
 * be mitigated client-side.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 */
public class ShopifyServerException extends Exception {

	/**
	 * Public constructor.
	 * 
	 * @param t
	 *            The cause of the error.
	 * @see Exception#Exception(Throwable)
	 */
	public ShopifyServerException(final Throwable t) {
		super(t);
	}

}
