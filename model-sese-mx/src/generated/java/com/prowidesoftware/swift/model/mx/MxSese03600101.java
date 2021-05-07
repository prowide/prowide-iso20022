
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
 * Class for sese.036.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.01")
public class MxSese03600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgModInstr", required = true)
    protected SecuritiesFinancingModificationInstructionV01 sctiesFincgModInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountAndDirection10 .class, AmountAndDirection4 .class, AutoBorrowing1Code.class, AutomaticBorrowing1Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashAccountIdentification5Choice.class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentIdentification11 .class, Extension2 .class, ExtensionEnvelope1 .class, FXStandingInstruction1Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MxSese03600101 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, OwnershipLegalRestrictions1Code.class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification2 .class, PartyIdentificationAndAccount1 .class, PartyTextInformation1 .class, PostalAddress1 .class, PriorityNumeric1Choice.class, QuantityAndAccount7 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, RepurchaseType2Choice.class, RepurchaseType4Code.class, Restriction1Choice.class, RevaluationIndicator1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesFinancingModificationInstructionV01 .class, SecuritiesFinancingTransactionDetails1 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesRTGS1Choice.class, SecuritiesTradeDetails5 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDetails3 .class, SettlementParties5 .class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition1Choice.class, SettlementTransactionCondition2Code.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, Tracking1Choice.class, TransactionTypeAndAdditionalParameters2 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.036.001.01";

    public MxSese03600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03600101(final String xml) {
        this();
        MxSese03600101 tmp = parse(xml);
        sctiesFincgModInstr = tmp.getSctiesFincgModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingModificationInstructionV01 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 getSctiesFincgModInstr() {
        return sctiesFincgModInstr;
    }

    /**
     * Sets the value of the sctiesFincgModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingModificationInstructionV01 }
     *     
     */
    public MxSese03600101 setSctiesFincgModInstr(SecuritiesFinancingModificationInstructionV01 value) {
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
    public static MxSese03600101 parse(String xml) {
        return ((MxSese03600101) MxReadImpl.parse(MxSese03600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03600101 parse(String xml, MxRead parserImpl) {
        return ((MxSese03600101) parserImpl.read(MxSese03600101 .class, xml, _classes));
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
     * Creates an MxSese03600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03600101 message
     * @return
     *     a new instance of MxSese03600101
     */
    public final static MxSese03600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03600101 .class);
    }

}
