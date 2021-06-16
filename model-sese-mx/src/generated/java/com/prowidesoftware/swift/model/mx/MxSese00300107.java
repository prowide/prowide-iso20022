
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
 * Class for sese.003.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.003.001.07")
public class MxSese00300107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfOutConf", required = true)
    protected TransferOutConfirmationV07 trfOutConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account19 .class, Account20 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Charge29 .class, ChargeBasisType1Choice.class, ChargeBearer1Code.class, ChargePaymentMethod1Choice.class, ChargePaymentMethod1Code.class, ChargeType12Code.class, ChargeType4Choice.class, Commission23 .class, CommissionBasis1Choice.class, CommissionType3Choice.class, CommissionType7Code.class, CommissionWaiver4 .class, ContactIdentification2 .class, CopyInformation4 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount14 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, FinancialInstrument49 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms26 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldingsPlanType1Code.class, IdentificationSource1Choice.class, IncomePreference2Code.class, Intermediary34 .class, InvestmentAccount54 .class, InvestmentAccount55 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00300107 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification97 .class, PartyIdentification97Choice.class, PartyIdentificationAndAccount123 .class, PartyIdentificationAndAccount124 .class, PartyIdentificationAndAccount125 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ReceiveInformation17 .class, ReceivingPartiesAndAccount13 .class, Role4Choice.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification23Choice.class, StampDutyType2Code.class, SubAccount5 .class, Tax28 .class, TaxBasis1Choice.class, TaxCalculationInformation8 .class, TaxType16Code.class, TaxType1Choice.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer31 .class, TransferOutConfirmationV07 .class, TransferReason1 .class, TransferReason1Code.class, TypeOfPrice12Code.class, TypeOfPrice31Choice.class, UKTaxGroupUnitCode.class, Unit6 .class, UnitPrice21 .class, WaivingInstruction1Choice.class, WaivingInstruction1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.003.001.07";

    public MxSese00300107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00300107(final String xml) {
        this();
        MxSese00300107 tmp = parse(xml);
        trfOutConf = tmp.getTrfOutConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00300107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfOutConf property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutConfirmationV07 }
     *     
     */
    public TransferOutConfirmationV07 getTrfOutConf() {
        return trfOutConf;
    }

    /**
     * Sets the value of the trfOutConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutConfirmationV07 }
     *     
     */
    public MxSese00300107 setTrfOutConf(TransferOutConfirmationV07 value) {
        this.trfOutConf = value;
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
    public static MxSese00300107 parse(String xml) {
        return ((MxSese00300107) MxReadImpl.parse(MxSese00300107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00300107 parse(String xml, MxRead parserImpl) {
        return ((MxSese00300107) parserImpl.read(MxSese00300107 .class, xml, _classes));
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
     * Creates an MxSese00300107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00300107 message
     * @return
     *     a new instance of MxSese00300107
     */
    public final static MxSese00300107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00300107 .class);
    }

}
