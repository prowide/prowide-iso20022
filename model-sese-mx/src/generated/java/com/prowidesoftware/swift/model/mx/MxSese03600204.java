
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
 * Class for sese.036.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.036.002.04")
public class MxSese03600204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgModInstr", required = true)
    protected SecuritiesFinancingModificationInstruction002V04 sctiesFincgModInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AlternatePartyIdentification3 .class, AmountAndDirection11 .class, AmountAndDirection13 .class, AutoBorrowing1Code.class, AutomaticBorrowing4Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashAccountIdentification6Choice.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType5Code.class, DeliveryReceiptType2Code.class, FXStandingInstruction2Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, LegalFramework1Code.class, LegalFramework2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MxSese03600204 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification59Choice.class, PartyIdentificationAndAccount49 .class, PartyTextInformation3 .class, PriorityNumeric2Choice.class, QuantityAndAccount21 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType8Choice.class, RepurchaseType5Code.class, RepurchaseType9Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, RevaluationIndicator2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesFinancingModificationInstruction002V04 .class, SecuritiesFinancingTransactionDetails20 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesRTGS2Choice.class, SecuritiesTradeDetails12 .class, SecurityIdentification15 .class, SettlementDetails78 .class, SettlementParties17 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition8Choice.class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TerminationDate3Choice.class, Tracking2Choice.class, TransactionTypeAndAdditionalParameters8 .class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.036.002.04";

    public MxSese03600204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03600204(final String xml) {
        this();
        MxSese03600204 tmp = parse(xml);
        sctiesFincgModInstr = tmp.getSctiesFincgModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03600204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingModificationInstruction002V04 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V04 getSctiesFincgModInstr() {
        return sctiesFincgModInstr;
    }

    /**
     * Sets the value of the sctiesFincgModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingModificationInstruction002V04 }
     *     
     */
    public MxSese03600204 setSctiesFincgModInstr(SecuritiesFinancingModificationInstruction002V04 value) {
        this.sctiesFincgModInstr = value;
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
    public static MxSese03600204 parse(String xml) {
        return ((MxSese03600204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03600204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03600204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03600204 parse(String xml, MxRead parserImpl) {
        return ((MxSese03600204) parserImpl.read(MxSese03600204 .class, xml, _classes));
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
     * Creates an MxSese03600204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03600204 message
     * @return
     *     a new instance of MxSese03600204
     */
    public static final MxSese03600204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03600204 .class);
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
