/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.caching.configuration;

import org.gradle.api.Incubating;

/**
 * Configuration object for the local directory build cache.
 *
 * @since 3.5
 */
@Incubating
public interface LocalBuildCache extends BuildCache {
    /**
     * Sets the directory to use to store the build cache. Defaults to {@code $GRADLE_HOME/.caches/build-cache}.
     */
    void setDirectory(Object cacheDirectory);
}
