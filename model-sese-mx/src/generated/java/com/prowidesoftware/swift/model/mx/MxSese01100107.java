
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
 * Class for sese.011.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.07")
public class MxSese01100107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV07 trfInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentificationAndName6 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, ApplicableRules1Choice.class, ApplicableRules1Code.class, BeneficiaryDrawdown1 .class, BeneficiaryType1Choice.class, BeneficiaryType1Code.class, BenefitCrystallisationEvent1 .class, BranchData2 .class, CancellationPendingStatus7Choice.class, CancelledStatus13Choice.class, CancelledStatusReason3Code.class, Capped1 .class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, Cheque10 .class, ClearingSystemMemberIdentification2Choice.class, ClearingSystemMemberIdentification4Choice.class, CreditTransfer9 .class, Drawdown1 .class, DrawdownAllowanceCheck1 .class, DrawdownEventType1Choice.class, DrawdownEventType1Code.class, DrawdownType1Choice.class, DrawdownType1Code.class, Extension1 .class, FailedSettlementStatus2Choice.class, Fee5 .class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification16 .class, FinancialInstitutionIdentification17 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification36 .class, GenericIdentification47 .class, InRepairStatus4Choice.class, InvestmentFundFee1Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100107 .class, NameAndAddress5 .class, NoReasonCode.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, PartyIdentification125Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PaymentInstrument15 .class, PaymentInstrument23Choice.class, PendingSettlementStatus3Choice.class, PendingSettlementStatusReason2Code.class, PostalAddress1 .class, PostalAddress6 .class, PriceMethod1Code.class, PriceValue1 .class, References64Choice.class, RejectedReason15Choice.class, RejectionReason32 .class, ReversedStatus2Choice.class, Tax35 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes41 .class, TransferInstructionStatus5 .class, TransferInstructionStatusReportV07 .class, TransferRejectedStatusReason2Code.class, TransferStatus3Choice.class, TransferStatus6Code.class, TransferStatusAndReason6 .class, TransferStatusType1Choice.class, TransferStatusType1Code.class, TransferUnmatchedReason2Code.class, TransferUnmatchedStatus3Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit11 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.07";

    public MxSese01100107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100107(final String xml) {
        this();
        MxSese01100107 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV07 }
     *     
     */
    public TransferInstructionStatusReportV07 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV07 }
     *     
     */
    public MxSese01100107 setTrfInstrStsRpt(TransferInstructionStatusReportV07 value) {
        this.trfInstrStsRpt = value;
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
    public static MxSese01100107 parse(String xml) {
        return ((MxSese01100107) MxReadImpl.parse(MxSese01100107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100107 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100107) parserImpl.read(MxSese01100107 .class, xml, _classes));
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
     * Creates an MxSese01100107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100107 message
     * @return
     *     a new instance of MxSese01100107
     */
    public final static MxSese01100107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01100107 .class);
    }

}
