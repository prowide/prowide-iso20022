
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
 * Class for sese.036.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.07")
public class MxSese03600107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgModInstr", required = true)
    protected SecuritiesFinancingModificationInstructionV07 sctiesFincgModInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection49 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode18Choice.class, DateType5Code.class, DeliveryReceiptType2Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, LegalFramework1Code.class, LegalFramework3Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MxSese03600107 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentificationAndAccount169 .class, PartyTextInformation1 .class, PostalAddress1 .class, PriorityNumeric4Choice.class, QuantityAndAccount78 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, RepurchaseType21Choice.class, RepurchaseType8Code.class, Restriction5Choice.class, RevaluationIndicator3Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount22 .class, SecuritiesFinancingModificationInstructionV07 .class, SecuritiesFinancingTransactionDetails42 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails100 .class, SecurityIdentification19 .class, SettlementDetails148 .class, SettlementParties77 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate6Choice.class, Tracking4Choice.class, TransactionTypeAndAdditionalParameters17 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.07";

    public MxSese03600107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03600107(final String xml) {
        this();
        MxSese03600107 tmp = parse(xml);
        sctiesFincgModInstr = tmp.getSctiesFincgModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03600107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingModificationInstructionV07 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV07 getSctiesFincgModInstr() {
        return sctiesFincgModInstr;
    }

    /**
     * Sets the value of the sctiesFincgModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingModificationInstructionV07 }
     *     
     */
    public MxSese03600107 setSctiesFincgModInstr(SecuritiesFinancingModificationInstructionV07 value) {
        this.sctiesFincgModInstr = value;
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
    public static MxSese03600107 parse(String xml) {
        return ((MxSese03600107) MxReadImpl.parse(MxSese03600107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03600107 parse(String xml, MxRead parserImpl) {
        return ((MxSese03600107) parserImpl.read(MxSese03600107 .class, xml, _classes));
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
     * Creates an MxSese03600107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03600107 message
     * @return
     *     a new instance of MxSese03600107
     */
    public final static MxSese03600107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03600107 .class);
    }

}
