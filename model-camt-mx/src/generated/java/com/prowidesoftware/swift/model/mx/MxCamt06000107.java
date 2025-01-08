
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.060.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctRptgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.07")
public class MxCamt06000107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctRptgReq", required = true)
    protected AccountReportingRequestV07 acctRptgReq;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 60;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountReportingRequestV07 .class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BalanceSubType1Choice.class, BalanceType10Choice.class, BalanceType13 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, EntryStatus1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FloorLimitType1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader117 .class, Limit2 .class, MxCamt06000107 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QueryType3Code.class, ReportingPeriod5 .class, ReportingRequest7 .class, SequenceRange1 .class, SequenceRange1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimePeriodDetails1 .class, TransactionType2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.07";

    public MxCamt06000107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06000107(final String xml) {
        this();
        MxCamt06000107 tmp = parse(xml);
        acctRptgReq = tmp.getAcctRptgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06000107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctRptgReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReportingRequestV07 }
     *     
     */
    public AccountReportingRequestV07 getAcctRptgReq() {
        return acctRptgReq;
    }

    /**
     * Sets the value of the acctRptgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReportingRequestV07 }
     *     
     */
    public MxCamt06000107 setAcctRptgReq(AccountReportingRequestV07 value) {
        this.acctRptgReq = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt06000107 parse(String xml) {
        return ((MxCamt06000107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06000107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06000107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06000107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06000107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06000107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06000107) parserImpl.read(MxCamt06000107 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt06000107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06000107 message
     * @return
     *     a new instance of MxCamt06000107
     */
    public static final MxCamt06000107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06000107 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
