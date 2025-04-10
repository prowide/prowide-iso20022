
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
 * Class for sese.036.002.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.002.08")
public class MxSese03600208
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgModInstr", required = true)
    protected SecuritiesFinancingModificationInstruction002V08 sctiesFincgModInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AlternatePartyIdentification9 .class, AmountAndDirection59 .class, AmountAndDirection66 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockChainAddressWallet7 .class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode32Choice.class, DateType5Code.class, DeliveryReceiptType2Code.class, FXStandingInstruction5Choice.class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms27 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, LegalFramework1Code.class, LegalFramework4Choice.class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MxSese03600208 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification162 .class, PartyIdentificationAndAccount213 .class, PartyTextInformation3 .class, PriorityNumeric5Choice.class, QuantityAndAccount105 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType67Choice.class, RepurchaseType31Choice.class, RepurchaseType8Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, RevaluationIndicator4Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesAccount37 .class, SecuritiesFinancingModificationInstruction002V08 .class, SecuritiesFinancingTransactionDetails48 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails103 .class, SecurityIdentification20 .class, SettlementDetails172 .class, SettlementParties107 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition22Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TerminationDate7Choice.class, Tracking5Choice.class, TransactionTypeAndAdditionalParameters20 .class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.036.002.08";

    public MxSese03600208() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03600208(final String xml) {
        this();
        MxSese03600208 tmp = parse(xml);
        sctiesFincgModInstr = tmp.getSctiesFincgModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03600208(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingModificationInstruction002V08 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V08 getSctiesFincgModInstr() {
        return sctiesFincgModInstr;
    }

    /**
     * Sets the value of the sctiesFincgModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingModificationInstruction002V08 }
     *     
     */
    public MxSese03600208 setSctiesFincgModInstr(SecuritiesFinancingModificationInstruction002V08 value) {
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
    public static MxSese03600208 parse(String xml) {
        return ((MxSese03600208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03600208 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03600208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03600208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03600208 parse(String xml, MxRead parserImpl) {
        return ((MxSese03600208) parserImpl.read(MxSese03600208 .class, xml, _classes));
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
     * Creates an MxSese03600208 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03600208 message
     * @return
     *     a new instance of MxSese03600208
     */
    public static final MxSese03600208 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03600208 .class);
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
