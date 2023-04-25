
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
 * Class for camt.009.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.009.001.06")
public class MxCamt00900106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetLmt", required = true)
    protected GetLimitV06 getLmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveAmountRange3Choice.class, ActiveCurrencyAndAmountRange3 .class, AddressType2Code.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DateAndPeriod2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FromToAmountRange1 .class, FromToPercentageRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetLimitV06 .class, ImpliedCurrencyAmountRange1Choice.class, ImpliedCurrencyAndAmountRange1 .class, LimitCriteria5 .class, LimitCriteria5Choice.class, LimitQuery3 .class, LimitReturnCriteria2 .class, LimitSearchCriteria5 .class, LimitType1Choice.class, LimitType3Code.class, MarketInfrastructureIdentification1Choice.class, MessageHeader9 .class, MxCamt00900106 .class, PercentageRange1Choice.class, PercentageRangeBoundary1 .class, Period2 .class, PostalAddress6 .class, QueryType2Code.class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.009.001.06";

    public MxCamt00900106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00900106(final String xml) {
        this();
        MxCamt00900106 tmp = parse(xml);
        getLmt = tmp.getGetLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00900106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getLmt property.
     * 
     * @return
     *     possible object is
     *     {@link GetLimitV06 }
     *     
     */
    public GetLimitV06 getGetLmt() {
        return getLmt;
    }

    /**
     * Sets the value of the getLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLimitV06 }
     *     
     */
    public MxCamt00900106 setGetLmt(GetLimitV06 value) {
        this.getLmt = value;
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
    public static MxCamt00900106 parse(String xml) {
        return ((MxCamt00900106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00900106 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00900106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00900106 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00900106) parserImpl.read(MxCamt00900106 .class, xml, _classes));
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
     * Creates an MxCamt00900106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00900106 message
     * @return
     *     a new instance of MxCamt00900106
     */
    public static final MxCamt00900106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00900106 .class);
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
