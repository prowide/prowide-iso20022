
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
 * Class for sese.008.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslOfTrfInConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.008.001.06")
public class MxSese00800106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RvslOfTrfInConf", required = true)
    protected ReversalOfTransferInConfirmationV06 rvslOfTrfInConf;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account14 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Charge27 .class, ChargeBasisType1Choice.class, ChargeBearer1Code.class, ChargePaymentMethod1Choice.class, ChargePaymentMethod1Code.class, ChargeType12Code.class, ChargeType4Choice.class, Commission22 .class, CommissionBasis1Choice.class, CommissionType3Choice.class, CommissionType7Code.class, CommissionWaiver4 .class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DeliverInformation14 .class, DeliveringPartiesAndAccount9 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification47 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary25 .class, Intermediary26 .class, InvestmentAccount40 .class, InvestmentAccount41 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00800106 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PartyIdentificationAndAccount93 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, References15 .class, Reversal6Choice.class, ReversalOfTransferInConfirmationV06 .class, Role4Choice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax25 .class, TaxBasis1Choice.class, TaxCalculationInformation8 .class, TaxType16Code.class, TaxType1Choice.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer29 .class, TransferIn12 .class, TransferReason1 .class, TransferReason1Code.class, TransferReference6 .class, TypeOfPrice12Code.class, UKTaxGroupUnitCode.class, Unit3 .class, UnitPrice12 .class, WaivingInstruction1Choice.class, WaivingInstruction1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.008.001.06";

    public MxSese00800106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00800106(final String xml) {
        this();
        MxSese00800106 tmp = parse(xml);
        rvslOfTrfInConf = tmp.getRvslOfTrfInConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00800106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslOfTrfInConf property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalOfTransferInConfirmationV06 }
     *     
     */
    public ReversalOfTransferInConfirmationV06 getRvslOfTrfInConf() {
        return rvslOfTrfInConf;
    }

    /**
     * Sets the value of the rvslOfTrfInConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalOfTransferInConfirmationV06 }
     *     
     */
    public MxSese00800106 setRvslOfTrfInConf(ReversalOfTransferInConfirmationV06 value) {
        this.rvslOfTrfInConf = value;
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
    public static MxSese00800106 parse(String xml) {
        return ((MxSese00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00800106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00800106 parse(String xml, MxRead parserImpl) {
        return ((MxSese00800106) parserImpl.read(MxSese00800106 .class, xml, _classes));
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
     * Creates an MxSese00800106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00800106 message
     * @return
     *     a new instance of MxSese00800106
     */
    public static final MxSese00800106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00800106 .class);
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
