
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
 * Class for setr.006.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.006.002.01")
public class MxSetr00600201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RedOrdrConf", required = true)
    protected RedemptionOrderConfirmationMinusV01 redOrdrConf;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account8 .class, AccountIdentification1 .class, AccountIdentificationAndName4 .class, AdditionalReference5 .class, AlternateSecurityIdentification4 .class, CashAccountIdentification1 .class, Charge23 .class, ChargeType16Code.class, Commission14 .class, CommissionType6Code.class, CopyInformation3 .class, CreditTransfer7 .class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount6 .class, DeliveryReceiptType2Code.class, EUCapitalGain2Code.class, Extension1 .class, FinancialInstitutionIdentification6Choice.class, FinancialInstrument19 .class, FinancialInstrumentQuantity4 .class, ForeignExchangeTerms10 .class, FormOfSecurity1Code.class, FundSettlementParameters6 .class, GenericIdentification17 .class, IncomePreference1Code.class, Intermediary20 .class, InvestmentAccount32 .class, InvestmentAccount33 .class, InvestmentFundRole5Code.class, MessageIdentification3 .class, MxSetr00600201 .class, NameAndAddress11 .class, PartyIdentification26Choice.class, PartyIdentificationAndAccount13 .class, PaymentInstrument13Choice.class, PaymentTransaction30 .class, PlaceOfTradeIdentification3Choice.class, PostalAddress7 .class, PriceValue6 .class, ReceivingPartiesAndAccount5 .class, RedemptionExecution12 .class, RedemptionMultipleExecution4 .class, RedemptionOrderConfirmationMinusV01 .class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SecurityIdentification7Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation3 .class, Tax20 .class, TaxType14Code.class, TaxableIncomePerShareCalculated2Code.class, TotalCharges5 .class, TotalCommissions4 .class, TotalTaxes5 .class, TypeOfPrice15Code.class, UnitPrice17 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.006.002.01";

    public MxSetr00600201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00600201(final String xml) {
        this();
        MxSetr00600201 tmp = parse(xml);
        redOrdrConf = tmp.getRedOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00600201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderConfirmationMinusV01 }
     *     
     */
    public RedemptionOrderConfirmationMinusV01 getRedOrdrConf() {
        return redOrdrConf;
    }

    /**
     * Sets the value of the redOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderConfirmationMinusV01 }
     *     
     */
    public MxSetr00600201 setRedOrdrConf(RedemptionOrderConfirmationMinusV01 value) {
        this.redOrdrConf = value;
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
    public static MxSetr00600201 parse(String xml) {
        return ((MxSetr00600201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00600201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00600201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00600201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00600201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00600201 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00600201) parserImpl.read(MxSetr00600201 .class, xml, _classes));
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
     * Creates an MxSetr00600201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00600201 message
     * @return
     *     a new instance of MxSetr00600201
     */
    public static final MxSetr00600201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00600201 .class);
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
