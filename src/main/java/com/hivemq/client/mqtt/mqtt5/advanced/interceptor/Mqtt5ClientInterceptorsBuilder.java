/*
 * Copyright 2018-present HiveMQ and the HiveMQ Community
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

package com.hivemq.client.mqtt.mqtt5.advanced.interceptor;

import com.hivemq.client.annotations.CheckReturnValue;
import com.hivemq.client.annotations.DoNotImplement;
import org.jetbrains.annotations.NotNull;

/**
 * Builder for a {@link Mqtt5ClientInterceptors}.
 *
 * @author Silvio Giebl
 * @since 1.0
 */
@DoNotImplement
public interface Mqtt5ClientInterceptorsBuilder
        extends Mqtt5ClientInterceptorsBuilderBase<Mqtt5ClientInterceptorsBuilder> {

    /**
     * Builds the {@link Mqtt5ClientInterceptors}.
     *
     * @return the built {@link Mqtt5ClientInterceptors}.
     */
    @CheckReturnValue
    @NotNull Mqtt5ClientInterceptors build();

    /**
     * Builder for a {@link Mqtt5ClientInterceptors} that is applied to a parent.
     *
     * @param <P> the type of the result when the built {@link Mqtt5ClientInterceptors} is applied to the parent.
     */
    @DoNotImplement
    interface Nested<P> extends Mqtt5ClientInterceptorsBuilderBase<Nested<P>> {

        /**
         * Builds the {@link Mqtt5ClientInterceptors} and applies it to the parent.
         *
         * @return the result when the built {@link Mqtt5ClientInterceptors} is applied to the parent.
         */
        @NotNull P applyInterceptors();
    }
}
