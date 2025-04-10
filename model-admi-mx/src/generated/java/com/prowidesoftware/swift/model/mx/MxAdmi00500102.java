
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
 * Class for admi.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rptQryReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.005.001.02")
public class MxAdmi00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RptQryReq", required = true)
    protected ReportQueryRequestV02 rptQryReq;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AddressType3Choice.class, BalanceCounterparty1Code.class, BalanceType11Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashBalance14 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DateAndDateTimeSearch4Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, DateTimeSearch2Choice.class, EventType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, MessageHeader7 .class, MxAdmi00500102 .class, NameAndAddress5 .class, OriginalBusinessQuery1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, PostalAddress27 .class, ReportQueryCriteria3 .class, ReportQueryRequestV02 .class, ReportQuerySearchCriteria3 .class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:admi.005.001.02";

    public MxAdmi00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00500102(final String xml) {
        this();
        MxAdmi00500102 tmp = parse(xml);
        rptQryReq = tmp.getRptQryReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rptQryReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQueryRequestV02 }
     *     
     */
    public ReportQueryRequestV02 getRptQryReq() {
        return rptQryReq;
    }

    /**
     * Sets the value of the rptQryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQueryRequestV02 }
     *     
     */
    public MxAdmi00500102 setRptQryReq(ReportQueryRequestV02 value) {
        this.rptQryReq = value;
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
    public static MxAdmi00500102 parse(String xml) {
        return ((MxAdmi00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi00500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00500102 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00500102) parserImpl.read(MxAdmi00500102 .class, xml, _classes));
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
     * Creates an MxAdmi00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00500102 message
     * @return
     *     a new instance of MxAdmi00500102
     */
    public final static MxAdmi00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi00500102 .class);
    }

}
