/*
 * Copyright 2002-2007 the original author or authors.
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

package org.suren.autotest.web.framework.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.surenpi.autotest.webui.Page;

/**
 * 自动化处理localStorage
 * @author <a href="http://surenpi.com">suren</a>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoLocalStorage
{
    /**
     * @return Page类
     */
    Class<? extends Page> pageClazz();

    /**
     * @return Page类中代表的属性名称
     */
    String sessionKey();
    
    /**
     * @return 自定义选项，将会覆盖了localStorage中的选项
     */
    AutoItem[] overItems() default {};

    /**
     * @return 是否跳过目标方法
     */
    boolean skipMethod() default true;
}
