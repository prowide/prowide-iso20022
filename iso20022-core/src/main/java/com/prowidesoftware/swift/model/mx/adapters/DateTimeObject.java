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
public class DateTimeObject {

    public DateTimeObject(Date date, TimeObject time) {
        this.date = date;
        this.time = time;
    }

    private final Date date;
    private final TimeObject time;

    public static class Date {
        private final int day;
        private final int month;
        private final int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
    }

    public static class TimeObject {
        private final int hour;
        private final int minute;
        private final int second;
        private final int nano;

        public TimeObject(int hour, int minute, int second, int nano) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.nano = nano;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public int getNano() {
            return nano;
        }
    }
}
