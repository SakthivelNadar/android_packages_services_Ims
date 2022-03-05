/*
 * Copyright (C) 2016 The Android Open Source Project
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

package com.android.internal.telephony.metrics;

import com.android.internal.telephony.metrics.TelephonyMetrics;

public class TelephonyMetricsOverride extends TelephonyMetrics {

    /**
     * Write Send SMS event (backwards-compatible method for R and earlier IMS imp>     *
     * @param phoneId Phone id
     * @param rilSerial RIL request serial number
     * @param tech SMS RAT
     * @param format SMS format. Either {@link SmsMessage#FORMAT_3GPP} or
     *         {@link SmsMessage#FORMAT_3GPP2}.
     */
    public void writeRilSendSms(int phoneId, int rilSerial, int tech, int format) {        writeRilSendSms(phoneId, rilSerial, tech, format, 0);
    }
