/*
 * semanticcms-section-style - Default style for sections nested within SemanticCMS pages and elements.
 * Copyright (C) 2016  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-section-style.
 *
 * semanticcms-section-style is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-section-style is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-section-style.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.section.style;

import com.semanticcms.core.servlet.SemanticCMS;
import com.semanticcms.section.model.Section;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("Registers the styles for sections in SemanticCMS.")
public class SectionStyleContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		SemanticCMS semanticCMS = SemanticCMS.getInstance(event.getServletContext());
		// Add our CSS file
		semanticCMS.addCssLink("/semanticcms-section-style/styles.css");
		// Add list item CSS class
		semanticCMS.addListItemCssClass(Section.class, "semanticcms-section-list-item");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Do nothing
	}
}