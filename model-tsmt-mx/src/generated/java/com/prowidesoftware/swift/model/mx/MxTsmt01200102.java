
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
 * Class for tsmt.012.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt01200102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.012.001.02")
public class MxTsmt01200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.012.001.02", required = true)
    protected Tsmt01200102 tsmt01200102;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationAndName2 .class, AccountIdentificationOrNameChoice.class, Adjustment3 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, BICIdentification1 .class, Baseline2 .class, Charge12 .class, ChargeType8Code.class, ChargesDetails1 .class, ContactIdentification1 .class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1 .class, Incoterms1Code.class, LineItem5 .class, LineItemDetails4 .class, MessageIdentification1 .class, MultimodalTransport1 .class, MxTsmt01200102 .class, NameAndAddress6 .class, NamePrefix1Code.class, PartyIdentification9 .class, PaymentPeriod1 .class, PaymentTerms1 .class, PaymentTime1Code.class, PercentageTolerance1 .class, PostalAddress2 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity2 .class, RequiredSubmission1 .class, SettlementTerms1 .class, SimpleIdentificationInformation.class, SingleTransport1 .class, Tax13 .class, TaxType9Code.class, TradeFinanceService2Code.class, TransportByAir1 .class, TransportByRail1 .class, TransportByRoad1 .class, TransportBySea1 .class, TransportMeans1Choice.class, Tsmt01200102 .class, UnitPrice8 .class, UserDefinedInformation1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:tsmt.012.001.02";

    public MxTsmt01200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01200102(final String xml) {
        this();
        MxTsmt01200102 tmp = parse(xml);
        tsmt01200102 = tmp.getTsmt01200102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt01200102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt01200102 }
     *     
     */
    public Tsmt01200102 getTsmt01200102() {
        return tsmt01200102;
    }

    /**
     * Sets the value of the tsmt01200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt01200102 }
     *     
     */
    public MxTsmt01200102 setTsmt01200102(Tsmt01200102 value) {
        this.tsmt01200102 = value;
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
    public static MxTsmt01200102 parse(String xml) {
        return ((MxTsmt01200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01200102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01200102) parserImpl.read(MxTsmt01200102 .class, xml, _classes));
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
     * Creates an MxTsmt01200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01200102 message
     * @return
     *     a new instance of MxTsmt01200102
     */
    public static final MxTsmt01200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01200102 .class);
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
