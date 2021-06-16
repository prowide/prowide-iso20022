
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
 * Class for setr.060.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "altrntvFndsRedOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.060.001.01")
public class MxSetr06000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AltrntvFndsRedOrdr", required = true)
    protected AlternativeFundsRedemptionOrderV01 altrntvFndsRedOrdr;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 60;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalInformation2 .class, AdditionalReference4 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AlternativeFundsRedemptionOrderV01 .class, AmountRate1Choice.class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, Charge21 .class, ChargeType13Code.class, ChargeType1Choice.class, ContactInformation1 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, EUCapitalGain2Code.class, EUCapitalGainType1Choice.class, EUDividendStatus1Code.class, EUDividendStatusType1Choice.class, ExemptionReasonType1Choice.class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity10Choice.class, GenericIdentification1 .class, GenericIdentification12 .class, GenericIdentification13 .class, HedgeFundOrderType1Code.class, IdentificationType1Choice.class, IndividualPerson15 .class, Intermediary16 .class, IntermediaryRoleChoice1 .class, InvestmentAccount30 .class, InvestmentFundRole4Code.class, LotDetails1 .class, MessageIdentification1 .class, MxSetr06000101 .class, NameAndAddress5 .class, OrderWaiverReason1Choice.class, OrderWaiverReason1Code.class, PartyIdentification2Choice.class, PersonIdentificationType2Code.class, PostalAddress1 .class, RedemptionOrder9 .class, ResidentialStatus1Code.class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SidePocketInformation1 .class, SidePocketQuantityAndAmount1 .class, SidePocketUnitsOrAmountOrRate1Choice.class, SimpleIdentificationInformation.class, SubAccount3 .class, Tax19 .class, TaxDetailsType1Choice.class, TaxType11Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.060.001.01";

    public MxSetr06000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr06000101(final String xml) {
        this();
        MxSetr06000101 tmp = parse(xml);
        altrntvFndsRedOrdr = tmp.getAltrntvFndsRedOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr06000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the altrntvFndsRedOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeFundsRedemptionOrderV01 }
     *     
     */
    public AlternativeFundsRedemptionOrderV01 getAltrntvFndsRedOrdr() {
        return altrntvFndsRedOrdr;
    }

    /**
     * Sets the value of the altrntvFndsRedOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeFundsRedemptionOrderV01 }
     *     
     */
    public MxSetr06000101 setAltrntvFndsRedOrdr(AlternativeFundsRedemptionOrderV01 value) {
        this.altrntvFndsRedOrdr = value;
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
    public static MxSetr06000101 parse(String xml) {
        return ((MxSetr06000101) MxReadImpl.parse(MxSetr06000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr06000101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr06000101) parserImpl.read(MxSetr06000101 .class, xml, _classes));
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
     * Creates an MxSetr06000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr06000101 message
     * @return
     *     a new instance of MxSetr06000101
     */
    public final static MxSetr06000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr06000101 .class);
    }

}
