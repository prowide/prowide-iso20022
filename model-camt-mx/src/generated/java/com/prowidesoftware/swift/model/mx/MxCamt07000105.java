
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.070.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrStgOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.070.001.05")
public class MxCamt07000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrStgOrdr", required = true)
    protected ReturnStandingOrderV05 rtrStgOrdr;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 70;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DatePeriod3 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, MessageHeader6 .class, MxCamt07000105 .class, OriginalBusinessQuery1 .class, PostalAddress24 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RequestType3Choice.class, ReturnStandingOrderV05 .class, StandingOrder9 .class, StandingOrderIdentification6 .class, StandingOrderOrError7Choice.class, StandingOrderOrError8Choice.class, StandingOrderQueryType1Code.class, StandingOrderReport2 .class, StandingOrderTotalAmount1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalAmountAndCurrency1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.070.001.05";

    public MxCamt07000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt07000105(final String xml) {
        this();
        MxCamt07000105 tmp = parse(xml);
        rtrStgOrdr = tmp.getRtrStgOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt07000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStandingOrderV05 }
     *     
     */
    public ReturnStandingOrderV05 getRtrStgOrdr() {
        return rtrStgOrdr;
    }

    /**
     * Sets the value of the rtrStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStandingOrderV05 }
     *     
     */
    public MxCamt07000105 setRtrStgOrdr(ReturnStandingOrderV05 value) {
        this.rtrStgOrdr = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt07000105 parse(String xml) {
        return ((MxCamt07000105) MxReadImpl.parse(MxCamt07000105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt07000105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt07000105) parserImpl.read(MxCamt07000105 .class, xml, _classes));
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
     * Creates an MxCamt07000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt07000105 message
     * @return
     *     a new instance of MxCamt07000105
     */
    public final static MxCamt07000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt07000105 .class);
    }

}
