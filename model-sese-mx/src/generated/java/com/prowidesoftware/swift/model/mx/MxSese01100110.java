
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for sese.011.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.10")
public class MxSese01100110
    extends AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV10 trfInstrStsRpt;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account34 .class, Account36 .class, AccountIdentificationAndName9 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, ApplicableRules1Choice.class, ApplicableRules1Code.class, BeneficiaryDrawdown2 .class, BeneficiaryType1Choice.class, BeneficiaryType1Code.class, BenefitCrystallisationEvent2 .class, BlockChainAddressWallet3 .class, BranchData2 .class, CancellationPendingStatus7Choice.class, CancelledStatus13Choice.class, CancelledStatusReason3Code.class, Capped1 .class, CashAsset3 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType10Choice.class, Cheque12 .class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, ClearingSystemMemberIdentification4Choice.class, ContactIdentification2 .class, Conversion4 .class, CreditTransfer13 .class, DateFormat42Choice.class, DigitalPaymentSettlement3 .class, Drawdown04 .class, Drawdown3 .class, DrawdownType2Choice.class, DrawdownType2Code.class, EmploymentDetails1 .class, Extension1 .class, FailedSettlementStatus2Choice.class, Fee11 .class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification16 .class, FinancialInstitutionIdentification17 .class, FinancialInstrument101Choice.class, FinancialInstrumentIdentification6 .class, FinancialInstrumentIdentification7 .class, FinancialInstrumentIdentificationType1Code.class, FinancialInstrumentQuantity33Choice.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, IdentificationSource1Choice.class, IdentificationSource6Choice.class, InRepairStatus4Choice.class, Intermediary48 .class, InvestmentFundFee3Code.class, InvestmentFundRole8Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100110 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoReasonCode.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, OtherIdentification8 .class, PartyIdentification125Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PaymentInstrument23 .class, PaymentInstrument31Choice.class, PendingSettlementStatus3Choice.class, PendingSettlementStatusReason2Code.class, PersonIdentificationType7Code.class, PostalAddress1 .class, PostalAddress6 .class, PriceMethod1Code.class, PriceValue1 .class, ProprietaryQuantity8 .class, Quantity48Choice.class, References64Choice.class, RejectedReason45Choice.class, RejectedStatusReason13Code.class, RejectionReason56 .class, ReversedStatus2Choice.class, Role8Choice.class, SecurityIdentification46Choice.class, SecurityIdentification50 .class, SubAccount5 .class, Tax35 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxReference2 .class, TaxReferenceType1Choice.class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes44 .class, TransferInstructionStatus5 .class, TransferInstructionStatusReportV10 .class, TransferStatus5Choice.class, TransferStatus6Code.class, TransferStatusAndReason09 .class, TransferStatusType2Code.class, TransferStatusType3Choice.class, TransferUnmatchedReason3Code.class, TransferUnmatchedStatus4Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit14 .class, Unit15 .class, Unit1Choice.class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.10";

    public MxSese01100110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100110(final String xml) {
        this();
        MxSese01100110 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV10 }
     *     
     */
    public TransferInstructionStatusReportV10 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV10 }
     *     
     */
    public MxSese01100110 setTrfInstrStsRpt(TransferInstructionStatusReportV10 value) {
        this.trfInstrStsRpt = value;
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
    public static MxSese01100110 parse(String xml) {
        return ((MxSese01100110) MxReadImpl.parse(MxSese01100110 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01100110 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01100110) MxReadImpl.parse(MxSese01100110 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100110 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100110) parserImpl.read(MxSese01100110 .class, xml, _classes));
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
     * Creates an MxSese01100110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100110 message
     * @return
     *     a new instance of MxSese01100110
     */
    public static final MxSese01100110 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01100110 .class);
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
