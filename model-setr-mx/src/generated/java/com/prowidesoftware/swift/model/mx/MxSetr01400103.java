
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
 * Class for setr.014.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "swtchOrdrCxlReqV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.014.001.03")
public class MxSetr01400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SwtchOrdrCxlReqV03", required = true)
    protected SwitchOrderCancellationRequestV03 swtchOrdrCxlReqV03;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BranchData.class, CancellationRight1Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, CashInOrOut5Choice.class, Charge17 .class, ChargeType11Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission10 .class, CommissionType6Code.class, CommissionWaiver3 .class, CopyInformation2 .class, CreditTransfer6 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, Equalisation1 .class, Extension1 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity5Choice.class, FinancialInstrumentQuantity6Choice.class, ForeignExchangeTerms6 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundSettlementParameters3 .class, FundSettlementParameters4 .class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary8 .class, InvestmentAccount20 .class, InvestmentAccount21 .class, InvestmentFundOrder1 .class, InvestmentFundOrder5 .class, InvestmentFundRole2Code.class, MessageIdentification1 .class, MxSetr01400103 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument11Choice.class, PaymentInstrument12Choice.class, PaymentTransaction25 .class, PostalAddress1 .class, ReceivingPartiesAndAccount3 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SwitchOrder3 .class, SwitchOrderCancellationRequestV03 .class, SwitchOrderInstruction2 .class, SwitchRedemptionLegOrder3 .class, SwitchSubscriptionLegOrder3 .class, Tax16 .class, TaxCalculationInformation5 .class, TaxType10Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, UKTaxGroupUnitCode.class, WaivingInstruction1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.014.001.03";

    public MxSetr01400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01400103(final String xml) {
        this();
        MxSetr01400103 tmp = parse(xml);
        swtchOrdrCxlReqV03 = tmp.getSwtchOrdrCxlReqV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the swtchOrdrCxlReqV03 property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderCancellationRequestV03 }
     *     
     */
    public SwitchOrderCancellationRequestV03 getSwtchOrdrCxlReqV03() {
        return swtchOrdrCxlReqV03;
    }

    /**
     * Sets the value of the swtchOrdrCxlReqV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderCancellationRequestV03 }
     *     
     */
    public MxSetr01400103 setSwtchOrdrCxlReqV03(SwitchOrderCancellationRequestV03 value) {
        this.swtchOrdrCxlReqV03 = value;
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
    public static MxSetr01400103 parse(String xml) {
        return ((MxSetr01400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01400103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01400103) parserImpl.read(MxSetr01400103 .class, xml, _classes));
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
     * Creates an MxSetr01400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01400103 message
     * @return
     *     a new instance of MxSetr01400103
     */
    public static final MxSetr01400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01400103 .class);
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
