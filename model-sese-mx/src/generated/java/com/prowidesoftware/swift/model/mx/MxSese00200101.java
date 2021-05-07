
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
 * Class for sese.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sese00200101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.002.001.01")
public class MxSese00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "sese.002.001.01", required = true)
    protected Sese00200101 sese00200101;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AdditionalReference2 .class, AlternateSecurityIdentification1 .class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliveryParameters2 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument3 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary1 .class, InvestmentAccount10 .class, InvestmentAccount11 .class, LongPostalAddress1Choice.class, MxSese00200101 .class, NameAndAddress1 .class, NameAndAddress2 .class, PartyIdentification1Choice.class, PartyIdentificationAndAccount2 .class, PriceMethod1Code.class, PriceValue1 .class, ReceiveInformation1 .class, ReceivingPartiesAndAccount1 .class, SecurityIdentification1Choice.class, Sese00200101 .class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class, Transfer1 .class, TransferOut2 .class, TypeOfPrice2Code.class, UKTaxGroupUnitCode.class, Unit1 .class, UnitPrice3 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.002.001.01";

    public MxSese00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00200101(final String xml) {
        this();
        MxSese00200101 tmp = parse(xml);
        sese00200101 = tmp.getSese00200101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sese00200101 property.
     * 
     * @return
     *     possible object is
     *     {@link Sese00200101 }
     *     
     */
    public Sese00200101 getSese00200101() {
        return sese00200101;
    }

    /**
     * Sets the value of the sese00200101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sese00200101 }
     *     
     */
    public MxSese00200101 setSese00200101(Sese00200101 value) {
        this.sese00200101 = value;
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
    public static MxSese00200101 parse(String xml) {
        return ((MxSese00200101) MxReadImpl.parse(MxSese00200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00200101 parse(String xml, MxRead parserImpl) {
        return ((MxSese00200101) parserImpl.read(MxSese00200101 .class, xml, _classes));
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
     * Creates an MxSese00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00200101 message
     * @return
     *     a new instance of MxSese00200101
     */
    public final static MxSese00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00200101 .class);
    }

}
