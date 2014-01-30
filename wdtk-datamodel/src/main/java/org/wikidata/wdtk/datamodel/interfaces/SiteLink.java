package org.wikidata.wdtk.datamodel.interfaces;

/*
 * #%L
 * Wikidata Toolkit Data Model
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.List;

/**
 * A site link in Wikibase specifies a link to an article on another MediaWiki
 * site, and a list of "badges" that this article holds. Badges are specific
 * tags used on Wikimedia project sites for some articles, most prominently for
 * "featured articles".
 * 
 * @author Markus Kroetzsch
 * 
 */
public interface SiteLink {

	/**
	 * Get the string title of the linked article.
	 * 
	 * @return
	 */
	public String getArticleTitle();

	/**
	 * Get the string key of the linked site.
	 * 
	 * @return
	 */
	public String getSiteKey();

	/**
	 * Get the full IRI (URL) of the linked article.
	 * 
	 * @return
	 */
	public String getUrl();

	/**
	 * Get the list of badges of the linked article.
	 * 
	 * TODO This feature is not used yet in Wikibase. This interface might
	 * change when more details are known.
	 * 
	 * @return
	 */
	public List<String> getBadges();

}
