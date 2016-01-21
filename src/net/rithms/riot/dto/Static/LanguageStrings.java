/*
 * Copyright 2014 Taylor Caldwell
 *
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
 */

package net.rithms.riot.dto.Static;

import java.io.Serializable;

public class LanguageStrings implements Serializable {

	private static final long serialVersionUID = -5097401216029512928L;
	private LanguageStringsData data;
	private String type, version;

	public LanguageStringsData getData() {
		return data;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}
}