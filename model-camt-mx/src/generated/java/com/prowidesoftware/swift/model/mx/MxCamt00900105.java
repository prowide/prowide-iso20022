
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
 * Class for camt.009.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.009.001.05")
public class MxCamt00900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetLmt", required = true)
    protected GetLimitV05 getLmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AmountRange2Choice.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, CurrencyAndAmountRange2 .class, DateAndPeriod2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FromToAmountRange.class, FromToPercentageRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetLimitV05 .class, ImpliedCurrencyAmountRangeChoice.class, ImpliedCurrencyAndAmountRange.class, LimitCriteria3 .class, LimitCriteria3Choice.class, LimitQuery1 .class, LimitReturnCriteria2 .class, LimitSearchCriteria3 .class, LimitType1Choice.class, LimitType3Code.class, MarketInfrastructureIdentification1Choice.class, MessageHeader2 .class, MxCamt00900105 .class, PercentageRange1Choice.class, PercentageRangeBoundary1 .class, Period2 .class, PostalAddress6 .class, QueryType2Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SystemIdentification2Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.009.001.05";

    public MxCamt00900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00900105(final String xml) {
        this();
        MxCamt00900105 tmp = parse(xml);
        getLmt = tmp.getGetLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getLmt property.
     * 
     * @return
     *     possible object is
     *     {@link GetLimitV05 }
     *     
     */
    public GetLimitV05 getGetLmt() {
        return getLmt;
    }

    /**
     * Sets the value of the getLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLimitV05 }
     *     
     */
    public MxCamt00900105 setGetLmt(GetLimitV05 value) {
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
    public static MxCamt00900105 parse(String xml) {
        return ((MxCamt00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00900105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00900105) parserImpl.read(MxCamt00900105 .class, xml, _classes));
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
     * Creates an MxCamt00900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00900105 message
     * @return
     *     a new instance of MxCamt00900105
     */
    public static final MxCamt00900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00900105 .class);
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
