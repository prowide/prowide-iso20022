
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
 * Class for sese.036.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.06")
public class MxSese03600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgModInstr", required = true)
    protected SecuritiesFinancingModificationInstructionV06 sctiesFincgModInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection49 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode18Choice.class, DateType5Code.class, DeliveryReceiptType2Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, LegalFramework1Code.class, LegalFramework3Choice.class, MarketClientSide4Choice.class, MarketClientSideCode.class, MxSese03600106 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification75 .class, PartyIdentification92Choice.class, PartyIdentification98 .class, PartyIdentificationAndAccount106 .class, PartyTextInformation1 .class, PostalAddress1 .class, PriorityNumeric4Choice.class, QuantityAndAccount38 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, RepurchaseType21Choice.class, RepurchaseType8Code.class, Restriction5Choice.class, RevaluationIndicator3Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount24 .class, SecuritiesFinancingModificationInstructionV06 .class, SecuritiesFinancingTransactionDetails27 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails5 .class, SecurityIdentification19 .class, SettlementDetails97 .class, SettlementParties36 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate4Choice.class, Tracking4Choice.class, TransactionTypeAndAdditionalParameters17 .class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.06";

    public MxSese03600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03600106(final String xml) {
        this();
        MxSese03600106 tmp = parse(xml);
        sctiesFincgModInstr = tmp.getSctiesFincgModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingModificationInstructionV06 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV06 getSctiesFincgModInstr() {
        return sctiesFincgModInstr;
    }

    /**
     * Sets the value of the sctiesFincgModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingModificationInstructionV06 }
     *     
     */
    public MxSese03600106 setSctiesFincgModInstr(SecuritiesFinancingModificationInstructionV06 value) {
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
    public static MxSese03600106 parse(String xml) {
        return ((MxSese03600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03600106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03600106 parse(String xml, MxRead parserImpl) {
        return ((MxSese03600106) parserImpl.read(MxSese03600106 .class, xml, _classes));
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
     * Creates an MxSese03600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03600106 message
     * @return
     *     a new instance of MxSese03600106
     */
    public static final MxSese03600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03600106 .class);
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
