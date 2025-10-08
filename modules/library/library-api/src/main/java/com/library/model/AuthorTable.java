/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.library.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Library_Author&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Author
 * @generated
 */
public class AuthorTable extends BaseTable<AuthorTable> {

	public static final AuthorTable INSTANCE = new AuthorTable();

	public final Column<AuthorTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AuthorTable, Long> authorId = createColumn(
		"authorId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AuthorTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AuthorTable, String> nationality = createColumn(
		"nationality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AuthorTable() {
		super("Library_Author", AuthorTable::new);
	}

}