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
package com.prowidesoftware.swift.model;

/**
 * SWIFT business process classification for MX messages.
 *
 * @since 7.0
 */
public enum MxBusinessProcess {
    acmt("Account Management"),
    admi("Administration"),
    auth("Authorities"),
    caaa("Acceptor to Acquirer Card Transactions"),
    caad("Card Administration"),
    caam("ATM Management"),
    cafc("Fee Collection"),
    cafm("File Management"),
    cafr("Fraud Reporting and Disposition"),
    cain("Acquirer to Issuer Card Transactions"),
    camt("Cash Management"),
    canm("Network Management"),
    casp("Sale to POI Card Transactions"),
    casr("Settlement Reporting"),
    catm("Terminal Management"),
    catp("ATM Card Transactions"),
    cbrf("Clearing Operations and Reporting"),
    colr("Collateral Management"),
    fxtr("Foreign Exchange Trade"),
    head("Business Application Header"),
    pacs("Payments Clearing and Settlement"),
    pain("Payments Initiation"),
    reda("Reference Data"),
    remt("Payments Remittance Advice"),
    secl("Securities Clearing"),
    seev("Securities Events"),
    semt("Securities Management"),
    sese("Securities Settlement"),
    seti("Securities Trade Initiation"),
    setr("Securities Trade"),
    supl("Supplementary Data"),
    trck("Payments Tracker"),
    trea("Treasury"),
    tsin("Trade Services Initiation"),
    tsmt("Trade Services Management"),
    tsrv("Trade Services"),
    xsys("System Message");

    private String description;

    private MxBusinessProcess(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
