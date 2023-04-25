
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
 * Class for semt.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "semt00400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.004.001.01")
public class MxSemt00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "semt.004.001.01", required = true)
    protected Semt00400101 semt00400101;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation.class, AdditionalReference2 .class, AggregateBalanceInformation1 .class, AggregateBalancePerSafekeepingPlace1 .class, AlternateSecurityIdentification1 .class, BalanceQuantity1Choice.class, CustodyStatementOfHoldings1 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument4 .class, FinancialInstrumentQuantityChoice.class, ForeignExchangeTerms3 .class, FormOfSecurity1Code.class, Frequency1Code.class, FrequencyCodeAndDSSCodeChoice.class, GenericIdentification1 .class, GenericIdentification5 .class, GenericIdentification6 .class, GenericIdentification7 .class, Intermediary1 .class, LongPostalAddress1Choice.class, MxSemt00400101 .class, NameAndAddress2 .class, Pagination.class, PartyIdentification1Choice.class, PartyIdentification3 .class, PriceInformation1 .class, PriceRateOrAmountOrUnknownChoice.class, PriceSource.class, PriceSource1Code.class, PriceSourceFormatChoice.class, PriceValueType2Code.class, QuantityAndAvailability.class, SafekeepingAccount1 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceType1Choice.class, SecuritiesBalanceType1Code.class, SecuritiesBalanceType2Code.class, SecurityIdentification1Choice.class, Semt00400101 .class, SimpleIdentificationInformation.class, Statement3 .class, StatementBasis1Code.class, StatementBasisCodeAndDSSCodeChoice.class, StatementUpdateTypeCode.class, StatementUpdateTypeCodeAndDSSCodeChoice.class, StructuredLongPostalAddress1 .class, SubAccountIdentification1 .class, SubBalanceInformation1 .class, SubBalanceQuantity1Choice.class, TotalValueInPageAndStatement.class, TypeOfPrice5Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.004.001.01";

    public MxSemt00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00400101(final String xml) {
        this();
        MxSemt00400101 tmp = parse(xml);
        semt00400101 = tmp.getSemt00400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the semt00400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Semt00400101 }
     *     
     */
    public Semt00400101 getSemt00400101() {
        return semt00400101;
    }

    /**
     * Sets the value of the semt00400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Semt00400101 }
     *     
     */
    public MxSemt00400101 setSemt00400101(Semt00400101 value) {
        this.semt00400101 = value;
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
    public static MxSemt00400101 parse(String xml) {
        return ((MxSemt00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00400101) parserImpl.read(MxSemt00400101 .class, xml, _classes));
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
     * Creates an MxSemt00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00400101 message
     * @return
     *     a new instance of MxSemt00400101
     */
    public static final MxSemt00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00400101 .class);
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
