
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
 * Class for setr.004.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.004.002.01")
public class MxSetr00400201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RedOrdr", required = true)
    protected RedemptionOrderMinusV01 redOrdr;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account8 .class, AccountIdentification1 .class, AccountIdentificationAndName4 .class, AdditionalReference5 .class, AlternateSecurityIdentification4 .class, CashAccountIdentification1 .class, Charge22 .class, ChargeType15Code.class, Commission13 .class, CopyInformation3 .class, CreditTransfer7 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount6 .class, DeliveryReceiptType2Code.class, Extension1 .class, FinancialInstitutionIdentification6Choice.class, FinancialInstrument19 .class, FinancialInstrumentQuantity4 .class, FormOfSecurity1Code.class, FundSettlementParameters7 .class, GenericIdentification17 .class, IncomePreference1Code.class, Intermediary19 .class, InvestmentAccount32 .class, InvestmentAccount33 .class, InvestmentFundRole5Code.class, MessageIdentification3 .class, MxSetr00400201 .class, NameAndAddress11 .class, PartyIdentification26Choice.class, PartyIdentificationAndAccount13 .class, PaymentInstrument13Choice.class, PaymentTransaction30 .class, PlaceOfTradeIdentification3Choice.class, PostalAddress7 .class, RedemptionMultipleOrder5 .class, RedemptionOrder11 .class, RedemptionOrderMinusV01 .class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecurityIdentification7Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation3 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.004.002.01";

    public MxSetr00400201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00400201(final String xml) {
        this();
        MxSetr00400201 tmp = parse(xml);
        redOrdr = tmp.getRedOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00400201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderMinusV01 }
     *     
     */
    public RedemptionOrderMinusV01 getRedOrdr() {
        return redOrdr;
    }

    /**
     * Sets the value of the redOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderMinusV01 }
     *     
     */
    public MxSetr00400201 setRedOrdr(RedemptionOrderMinusV01 value) {
        this.redOrdr = value;
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
    public static MxSetr00400201 parse(String xml) {
        return ((MxSetr00400201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00400201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00400201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00400201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00400201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00400201 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00400201) parserImpl.read(MxSetr00400201 .class, xml, _classes));
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
     * Creates an MxSetr00400201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00400201 message
     * @return
     *     a new instance of MxSetr00400201
     */
    public static final MxSetr00400201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00400201 .class);
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
