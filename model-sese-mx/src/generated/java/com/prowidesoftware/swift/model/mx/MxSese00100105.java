
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
 * Class for sese.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.001.001.05")
public class MxSese00100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfOutInstr", required = true)
    protected TransferOutInstructionV05 trfOutInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account14 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Charge20 .class, ChargeBearer1Code.class, ChargePaymentMethod1Choice.class, ChargePaymentMethod1Code.class, ChargeType12Code.class, Commission17 .class, CommissionBasis1Choice.class, CommissionType3Choice.class, CommissionType7Code.class, CommissionWaiver4 .class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification47 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary25 .class, Intermediary26 .class, InvestmentAccount40 .class, InvestmentAccount41 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00100105 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PartyIdentificationAndAccount93 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, Quantity13Choice.class, ReceiveInformation13 .class, ReceivingPartiesAndAccount9 .class, Role4Choice.class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax21 .class, TaxBasis1Choice.class, TaxCalculationInformation8 .class, TaxType16Code.class, TaxType1Choice.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer27 .class, TransferOutInstructionV05 .class, TransferReason1 .class, TransferReason1Code.class, TypeOfPrice12Code.class, UKTaxGroupUnitCode.class, Unit3 .class, UnitPrice12 .class, WaivingInstruction1Choice.class, WaivingInstruction1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.001.001.05";

    public MxSese00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00100105(final String xml) {
        this();
        MxSese00100105 tmp = parse(xml);
        trfOutInstr = tmp.getTrfOutInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfOutInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutInstructionV05 }
     *     
     */
    public TransferOutInstructionV05 getTrfOutInstr() {
        return trfOutInstr;
    }

    /**
     * Sets the value of the trfOutInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutInstructionV05 }
     *     
     */
    public MxSese00100105 setTrfOutInstr(TransferOutInstructionV05 value) {
        this.trfOutInstr = value;
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
    public static MxSese00100105 parse(String xml) {
        return ((MxSese00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00100105 parse(String xml, MxRead parserImpl) {
        return ((MxSese00100105) parserImpl.read(MxSese00100105 .class, xml, _classes));
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
     * Creates an MxSese00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00100105 message
     * @return
     *     a new instance of MxSese00100105
     */
    public static final MxSese00100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00100105 .class);
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
