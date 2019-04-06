/*
 * Copyright 2011 the original author or authors.
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
package org.springframework.security.samples.cas.modules;

import geb.*
import org.springframework.security.samples.cas.pages.*

/**
 * Represents the navigation for the CAS Sample application
 *
 * @author Rob Winch
 */
class NavModule extends Module {
	static content = {
		home(to: HomePage) { $("a", text: "Home") }
		logout(to: LocalLogoutPage) { $("a", text: "Logout") }
	}
}