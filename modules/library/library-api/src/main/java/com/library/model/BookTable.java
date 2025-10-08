/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.library.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Library_Book&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Book
 * @generated
 */
public class BookTable extends BaseTable<BookTable> {

	public static final BookTable INSTANCE = new BookTable();

	public final Column<BookTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> bookId = createColumn(
		"bookId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BookTable, String> title = createColumn(
		"title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BookTable, Integer> publicationYear = createColumn(
		"publicationYear", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> authorId = createColumn(
		"authorId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BookTable() {
		super("Library_Book", BookTable::new);
	}

}