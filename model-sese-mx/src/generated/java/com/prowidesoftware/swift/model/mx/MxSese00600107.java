
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
 * Class for sese.006.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.006.001.07")
public class MxSese00600107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInCxlReq", required = true)
    protected TransferInCancellationRequestV07 trfInCxlReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account19 .class, Account20 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Cancellation10Choice.class, Charge29 .class, ChargeBasisType1Choice.class, ChargeBearer1Code.class, ChargeType12Code.class, ChargeType4Choice.class, Commission23 .class, CommissionBasis1Choice.class, CommissionType3Choice.class, CommissionType7Code.class, CommissionWaiver4 .class, ContactIdentification2 .class, CopyInformation4 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliverInformation16 .class, DeliveringPartiesAndAccount13 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, FinancialInstrument49 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms26 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldingsPlanType1Code.class, IdentificationSource1Choice.class, IncomePreference2Code.class, Intermediary34 .class, InvestmentAccount55 .class, InvestmentAccount56 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00600107 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification97 .class, PartyIdentification97Choice.class, PartyIdentificationAndAccount123 .class, PartyIdentificationAndAccount124 .class, PartyIdentificationAndAccount125 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, ReceivingPartiesAndAccount14 .class, References20 .class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification23Choice.class, SettlementDate1Code.class, StampDutyType2Code.class, SubAccount5 .class, Tax28 .class, TaxBasis1Choice.class, TaxCalculationInformation8 .class, TaxType16Code.class, TaxType1Choice.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer32 .class, TransferIn15 .class, TransferIn16 .class, TransferInCancellationRequestV07 .class, TransferInFunction1Code.class, TransferReason1 .class, TransferReason1Code.class, TransferReference9 .class, WaivingInstruction1Choice.class, WaivingInstruction1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.006.001.07";

    public MxSese00600107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00600107(final String xml) {
        this();
        MxSese00600107 tmp = parse(xml);
        trfInCxlReq = tmp.getTrfInCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00600107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInCancellationRequestV07 }
     *     
     */
    public TransferInCancellationRequestV07 getTrfInCxlReq() {
        return trfInCxlReq;
    }

    /**
     * Sets the value of the trfInCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInCancellationRequestV07 }
     *     
     */
    public MxSese00600107 setTrfInCxlReq(TransferInCancellationRequestV07 value) {
        this.trfInCxlReq = value;
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
    public static MxSese00600107 parse(String xml) {
        return ((MxSese00600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00600107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00600107 parse(String xml, MxRead parserImpl) {
        return ((MxSese00600107) parserImpl.read(MxSese00600107 .class, xml, _classes));
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
     * Creates an MxSese00600107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00600107 message
     * @return
     *     a new instance of MxSese00600107
     */
    public static final MxSese00600107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00600107 .class);
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
