/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.library.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuthorService}.
 *
 * @author Brian Wing Shun Chan
 * @see AuthorService
 * @generated
 */
public class AuthorServiceWrapper
	implements AuthorService, ServiceWrapper<AuthorService> {

	public AuthorServiceWrapper() {
		this(null);
	}

	public AuthorServiceWrapper(AuthorService authorService) {
		_authorService = authorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _authorService.getOSGiServiceIdentifier();
	}

	@Override
	public AuthorService getWrappedService() {
		return _authorService;
	}

	@Override
	public void setWrappedService(AuthorService authorService) {
		_authorService = authorService;
	}

	private AuthorService _authorService;

}