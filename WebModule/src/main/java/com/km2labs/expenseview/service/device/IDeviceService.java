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

package com.km2labs.expenseview.service.device;

import com.km2labs.expenseview.rest.model.Device;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by STyagi on 7/27/2015.
 */
@Service
@Transactional
public interface IDeviceService {

    String updateGCMToken(String gcmToken, long memberId, String deviceUUId);

    Device updateDevice(Device device, String emailId);

    String deleteDevice(String details, String emailId);

    Device addDevice(long memberID, Device device);

    Device getDeviceByMemberKey(long memberKey);
}
