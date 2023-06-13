/*
 * Copyright 2006-2023 Prowide
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
package com.prowidesoftware.swift.model.mx.adapters;

/**
 * @since 10.0.1
 */
class DateTimeObject {

    Date date;
    TimeObject time;

    DateTimeObject(Date date, TimeObject time) {
        this.date = date;
        this.time = time;
    }

    static class Date {
        int year;
        int month;
        int day;

        Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    static class TimeObject {
       int hour;
       int minute;
       int second;
       Integer nano;

        TimeObject(int hour, int minute, int second, int nano) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.nano = nano;
        }

    }
}
