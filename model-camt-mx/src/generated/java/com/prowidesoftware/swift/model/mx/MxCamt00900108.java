
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
 * Class for camt.009.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.009.001.08")
public class MxCamt00900108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetLmt", required = true)
    protected GetLimitV08 getLmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveAmountRange3Choice.class, ActiveCurrencyAndAmountRange3 .class, AddressType2Code.class, AddressType3Choice.class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DateAndPeriod2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FromToAmountRange1 .class, FromToPercentageRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GetLimitV08 .class, ImpliedCurrencyAmountRange1Choice.class, ImpliedCurrencyAndAmountRange1 .class, LimitCriteria7 .class, LimitCriteria7Choice.class, LimitQuery5 .class, LimitReturnCriteria2 .class, LimitSearchCriteria7 .class, LimitType1Choice.class, LimitType3Code.class, MarketInfrastructureIdentification1Choice.class, MessageHeader9 .class, MxCamt00900108 .class, PercentageRange1Choice.class, PercentageRangeBoundary1 .class, Period2 .class, PostalAddress27 .class, QueryType2Code.class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.009.001.08";

    public MxCamt00900108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00900108(final String xml) {
        this();
        MxCamt00900108 tmp = parse(xml);
        getLmt = tmp.getGetLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00900108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getLmt property.
     * 
     * @return
     *     possible object is
     *     {@link GetLimitV08 }
     *     
     */
    public GetLimitV08 getGetLmt() {
        return getLmt;
    }

    /**
     * Sets the value of the getLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLimitV08 }
     *     
     */
    public MxCamt00900108 setGetLmt(GetLimitV08 value) {
        this.getLmt = value;
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
    public static MxCamt00900108 parse(String xml) {
        return ((MxCamt00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00900108 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00900108 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00900108) parserImpl.read(MxCamt00900108 .class, xml, _classes));
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
     * Creates an MxCamt00900108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00900108 message
     * @return
     *     a new instance of MxCamt00900108
     */
    public final static MxCamt00900108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00900108 .class);
    }

}
