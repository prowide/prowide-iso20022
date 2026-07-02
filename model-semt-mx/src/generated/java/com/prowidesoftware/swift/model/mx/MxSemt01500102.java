
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
 * Class for semt.015.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.015.001.02")
public class MxSemt01500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntConf", required = true)
    protected IntraPositionMovementConfirmationV02 intraPosMvmntConf;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters8 .class, AmountAndDirection9 .class, ClassificationType2Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, EventFrequency3Code.class, FinancialInstrumentAttributes21 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, IntraPositionDetails12 .class, IntraPositionMovementConfirmationV02 .class, MarketIdentification1Choice.class, MarketIdentification5 .class, MarketType2Choice.class, MarketType5Code.class, MxSemt01500102 .class, Number2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherIdentification1 .class, PartialSettlement1Code.class, PartyIdentification36Choice.class, PaymentDirection2Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, QuantityBreakdown5 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType3Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.015.001.02";

    public MxSemt01500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01500102(final String xml) {
        this();
        MxSemt01500102 tmp = parse(xml);
        intraPosMvmntConf = tmp.getIntraPosMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementConfirmationV02 }
     *     
     */
    public IntraPositionMovementConfirmationV02 getIntraPosMvmntConf() {
        return intraPosMvmntConf;
    }

    /**
     * Sets the value of the intraPosMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementConfirmationV02 }
     *     
     */
    public MxSemt01500102 setIntraPosMvmntConf(IntraPositionMovementConfirmationV02 value) {
        this.intraPosMvmntConf = value;
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
    public static MxSemt01500102 parse(String xml) {
        return ((MxSemt01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01500102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01500102) parserImpl.read(MxSemt01500102 .class, xml, _classes));
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
     * Creates an MxSemt01500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01500102 message
     * @return
     *     a new instance of MxSemt01500102
     */
    public final static MxSemt01500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01500102 .class);
    }

}
