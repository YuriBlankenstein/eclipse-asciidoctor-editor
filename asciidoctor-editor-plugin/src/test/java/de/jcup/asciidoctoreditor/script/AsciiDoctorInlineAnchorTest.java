/*
 * Copyright 2018 Albert Tregnaghi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package de.jcup.asciidoctoreditor.script;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsciiDoctorInlineAnchorTest {

	@Test
	public void label_alpha_has_alpha_as_id() {
		assertEquals("alpha", new AsciiDoctorInlineAnchor("[[alpha]]", -1, -1).getId());
	}

	@Test
	public void label_alpha_hyphen_rocks_da_house_has_alpha_hyphen_rocks_da_house_as_id() {
		assertEquals("alpha-rocksdahouse", new AsciiDoctorInlineAnchor("[[alpha-rocksdahouse]]", -1, -1).getId());
	}

	@Test
	public void label_null_has_null_id() {
		assertNull(new AsciiDoctorInlineAnchor(null, -1, -1).getId());
	}

}
