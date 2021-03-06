/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ma.auth.service;

import com.baidu.rigel.biplatform.ma.auth.bo.ProductlineInfo;

/**
 * 用户管理服务
 * 
 * @author david.wang
 *
 */
public interface ProductLineManageService {
    
    /**
     * 根据用户名、密码检索用户
     * 
     * @param name
     *            用户名
     * @param pwd
     *            密码
     * @return 检索到用户返回用户信息，否则返回null
     */
    public ProductlineInfo queryUser(String name, String pwd);
    
    /**
     * 保存用户信息
     * @param user 用户对象
     * @return
     */
    public boolean saveUser(ProductlineInfo user);
    
    /**
     * 检查用户名是否已经存在
     * @param name
     * @return
     */
    public boolean existsUser(String name);
}
