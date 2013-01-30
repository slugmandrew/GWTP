/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.mvp.client;

/**
 * When a class implementing the PreBootstrapper interface and annotated with
 * {@link com.gwtplatform.mvp.client.annotations.PreBootstrap} is found, the ApplicationController
 * will call onPreBootstrap() before GWTP is initialized.
 * Because of this fact, <em>no injection can be provided</em> for this class.
 * @see https://github.com/ArcBees/GWTP/wiki/Bootstrapping-in-GWTP
 */
public interface PreBootstrapper {
    void onPreBootstrap();
}