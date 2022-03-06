
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.060.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctRptgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.04")
public class MxCamt06000104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctRptgReq", required = true)
    protected AccountReportingRequestV04 acctRptgReq;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 60;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountReportingRequestV04 .class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BalanceSubType1Choice.class, BalanceType10Choice.class, BalanceType13 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndPlaceOfBirth1 .class, DatePeriodDetails1 .class, EntryStatus1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FloorLimitType1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader76 .class, Limit2 .class, MxCamt06000104 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party34Choice.class, Party35Choice.class, PartyIdentification125 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, QueryType3Code.class, ReportingPeriod2 .class, ReportingRequest4 .class, SequenceRange1 .class, SequenceRange1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimePeriodDetails1 .class, TransactionType2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.04";

    public MxCamt06000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06000104(final String xml) {
        this();
        MxCamt06000104 tmp = parse(xml);
        acctRptgReq = tmp.getAcctRptgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctRptgReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReportingRequestV04 }
     *     
     */
    public AccountReportingRequestV04 getAcctRptgReq() {
        return acctRptgReq;
    }

    /**
     * Sets the value of the acctRptgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReportingRequestV04 }
     *     
     */
    public MxCamt06000104 setAcctRptgReq(AccountReportingRequestV04 value) {
        this.acctRptgReq = value;
        return this;
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
    public static MxCamt06000104 parse(String xml) {
        return ((MxCamt06000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06000104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06000104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06000104) parserImpl.read(MxCamt06000104 .class, xml, _classes));
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
     * Creates an MxCamt06000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06000104 message
     * @return
     *     a new instance of MxCamt06000104
     */
    public final static MxCamt06000104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06000104 .class);
    }

}
