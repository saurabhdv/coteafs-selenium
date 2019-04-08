/**
 * Copyright (c) 2017 - 2020, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.selenium.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.ElementAction;

/**
 * @author wasiqb
 * @since Apr 8, 2019 10:17:16 PM
 */
public class EditAccountPage extends MainPage {
	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 10:20:19 PM
	 * @return account id
	 */
	public ElementAction accountId () {
		return onElement (By.name ("accountno"));
	}

	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 10:21:29 PM
	 * @return submit
	 */
	public ElementAction submit () {
		return onElement (By.name ("AccSubmit"));
	}
}