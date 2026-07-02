
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.011.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.09")
public class MxSese01100109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV09 trfInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account33 .class, Account34 .class, AccountIdentificationAndName6 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, ApplicableRules1Choice.class, ApplicableRules1Code.class, BeneficiaryDrawdown1 .class, BeneficiaryType1Choice.class, BeneficiaryType1Code.class, BenefitCrystallisationEvent2 .class, BranchData2 .class, CancellationPendingStatus7Choice.class, CancelledStatus13Choice.class, CancelledStatusReason3Code.class, Capped1 .class, CashAsset3 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, Cheque12 .class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, ClearingSystemMemberIdentification4Choice.class, ContactIdentification2 .class, Conversion2 .class, CreditTransfer9 .class, DateFormat42Choice.class, Drawdown2 .class, Drawdown3 .class, DrawdownType2Choice.class, DrawdownType2Code.class, EmploymentDetails1 .class, Extension1 .class, FailedSettlementStatus2Choice.class, Fee5 .class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification16 .class, FinancialInstitutionIdentification17 .class, FinancialInstrument63Choice.class, FinancialInstrumentIdentification1 .class, FinancialInstrumentIdentification2 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, IdentificationSource1Choice.class, InRepairStatus4Choice.class, Intermediary48 .class, InvestmentFundFee1Code.class, InvestmentFundRole8Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100109 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoReasonCode.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, PartyIdentification125Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PaymentInstrument18 .class, PaymentInstrument25Choice.class, PendingSettlementStatus3Choice.class, PendingSettlementStatusReason2Code.class, PersonIdentificationType7Code.class, PostalAddress1 .class, PostalAddress6 .class, PriceMethod1Code.class, PriceValue1 .class, References64Choice.class, RejectedReason45Choice.class, RejectedStatusReason13Code.class, RejectionReason56 .class, ReversedStatus2Choice.class, Role8Choice.class, SecurityIdentification25Choice.class, SubAccount5 .class, Tax35 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxReference2 .class, TaxReferenceType1Choice.class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes41 .class, TransferInstructionStatus5 .class, TransferInstructionStatusReportV09 .class, TransferStatus5Choice.class, TransferStatus6Code.class, TransferStatusAndReason8 .class, TransferStatusType2Code.class, TransferStatusType3Choice.class, TransferUnmatchedReason3Code.class, TransferUnmatchedStatus4Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit11 .class, Unit13 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.09";

    public MxSese01100109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100109(final String xml) {
        this();
        MxSese01100109 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV09 }
     *     
     */
    public TransferInstructionStatusReportV09 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV09 }
     *     
     */
    public MxSese01100109 setTrfInstrStsRpt(TransferInstructionStatusReportV09 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese01100109 parse(String xml) {
        return ((MxSese01100109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01100109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01100109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01100109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01100109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100109 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100109) parserImpl.read(MxSese01100109 .class, xml, _classes));
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
     * Creates an MxSese01100109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100109 message
     * @return
     *     a new instance of MxSese01100109
     */
    public final static MxSese01100109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01100109 .class);
    }

}
