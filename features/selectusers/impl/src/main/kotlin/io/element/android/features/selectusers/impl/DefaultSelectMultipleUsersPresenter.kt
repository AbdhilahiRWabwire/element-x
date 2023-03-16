/*
 * Copyright (c) 2023 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.element.android.features.selectusers.impl

import com.squareup.anvil.annotations.ContributesBinding
import io.element.android.features.selectusers.api.MULTI_SELECTION_USERS_VARIANT
import io.element.android.features.selectusers.api.SelectUsersPresenter
import io.element.android.libraries.di.SessionScope
import javax.inject.Inject
import javax.inject.Named

@ContributesBinding(
    scope = SessionScope::class,
    boundType = SelectUsersPresenter::class
)
@Named(MULTI_SELECTION_USERS_VARIANT)
class DefaultSelectMultipleUsersPresenter @Inject constructor() :
    SelectUsersPresenter by DefaultSelectUsersPresenter(isMultiSelectionEnabled = true)

