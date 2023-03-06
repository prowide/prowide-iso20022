
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.007.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.007.001.08")
public class MxSese00700108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInConf", required = true)
    protected TransferInConfirmationV08 trfInConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account24 .class, Account25 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference7 .class, AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, ChargeBasis2Choice.class, ChargeBearer1Code.class, ChargeOrCommissionDiscount1 .class, ChargeOrCommissionDiscount2 .class, ChargePaymentMethod1Choice.class, ChargePaymentMethod1Code.class, ChargeType5Choice.class, ChargeType6Choice.class, ContactIdentification2 .class, CopyInformation4 .class, DateAndDateTime2Choice.class, DeliverInformation18 .class, DeliveringPartiesAndAccount17 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, Fee2 .class, Fee4 .class, Fees1 .class, FinancialInstrument63 .class, ForeignExchangeTerms33 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldingsPlanType1Code.class, IdentificationSource1Choice.class, IncomePreference2Code.class, Intermediary41 .class, InvestmentAccount65 .class, InvestmentAccount67 .class, InvestmentFundFee1Code.class, InvestmentFundFee2Code.class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00700108 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, PartyIdentification113 .class, PartyIdentification123 .class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PartyIdentificationAndAccount156 .class, PartyIdentificationAndAccount157 .class, PartyIdentificationAndAccount158 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ReceivingPartiesAndAccount18 .class, Role4Choice.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification25Choice.class, StampDutyType2Code.class, SubAccount5 .class, Tax31 .class, Tax34 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxCalculationInformation11 .class, TaxType16Code.class, TaxType17Code.class, TaxType1Choice.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes40 .class, Transfer35 .class, TransferInConfirmationV08 .class, TransferInFunction2Code.class, TransferReason1Choice.class, TransferReason1Code.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit8 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.007.001.08";

    public MxSese00700108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00700108(final String xml) {
        this();
        MxSese00700108 tmp = parse(xml);
        trfInConf = tmp.getTrfInConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00700108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInConf property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInConfirmationV08 }
     *     
     */
    public TransferInConfirmationV08 getTrfInConf() {
        return trfInConf;
    }

    /**
     * Sets the value of the trfInConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInConfirmationV08 }
     *     
     */
    public MxSese00700108 setTrfInConf(TransferInConfirmationV08 value) {
        this.trfInConf = value;
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
    public static MxSese00700108 parse(String xml) {
        return ((MxSese00700108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00700108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00700108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00700108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00700108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00700108 parse(String xml, MxRead parserImpl) {
        return ((MxSese00700108) parserImpl.read(MxSese00700108 .class, xml, _classes));
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
     * Creates an MxSese00700108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00700108 message
     * @return
     *     a new instance of MxSese00700108
     */
    public final static MxSese00700108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00700108 .class);
    }

}
