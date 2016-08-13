/*
 * Copyright (c) 2016. . The Km2Labs Project
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
 *
 *
 */

package com.km2labs.expenseview.database.repository.device;

import com.km2labs.expenseview.database.entity.DeviceEntity;
import com.km2labs.expenseview.database.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import java.util.List;

/**
 * Created by Subham Tyagi
 * On 6/2/2015.
 * <p>
 * TODO: Add class comments
 */
@Repository
public interface IDeviceRepository extends com.km2labs.expenseview.database.repository.Repository<DeviceEntity, Long> {

    UserEntity getUser(long deviceId);

    DeviceEntity findDeviceByUUID(String deviceUUID);

    List<DeviceEntity> findDevicesByUser(long userId);

    DeviceEntity getDeviceByMemberAndDeviceId(long memberId, String deviceUUID) throws NoResultException, NonUniqueResultException;
}
