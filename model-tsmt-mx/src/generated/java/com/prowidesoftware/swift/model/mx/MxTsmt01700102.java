
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
 * Class for tsmt.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt01700102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.017.001.02")
public class MxTsmt01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.017.001.02", required = true)
    protected Tsmt01700102 tsmt01700102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationAndName2 .class, AccountIdentificationOrNameChoice.class, Action1Code.class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, BICIdentification1 .class, BaselineStatus1Code.class, Charge13 .class, ChargeType8Code.class, ChargesDetails2 .class, CommercialDataSet2 .class, CurrencyAndAmount.class, DataSetSubmissionReferences1 .class, DocumentIdentification1 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1Code.class, Incoterms2 .class, LineItem4 .class, LineItemDetails6 .class, MessageIdentification1 .class, MultimodalTransport2 .class, MxTsmt01700102 .class, NameAndAddress6 .class, PartyIdentification9 .class, PaymentPeriod1 .class, PaymentTerms1 .class, PaymentTime1Code.class, PendingActivity1 .class, PostalAddress2 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity2 .class, SettlementTerms1 .class, SimpleIdentificationInformation.class, SingleTransport2 .class, Tax12 .class, TaxType9Code.class, TransactionStatus1 .class, TransportByAir2 .class, TransportByRail2 .class, TransportByRoad2 .class, TransportBySea2 .class, TransportDataSet2 .class, TransportDetails1 .class, TransportMeans2Choice.class, TransportedGoods1 .class, Tsmt01700102 .class, UnitPrice8 .class, UserDefinedInformation1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.017.001.02";

    public MxTsmt01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01700102(final String xml) {
        this();
        MxTsmt01700102 tmp = parse(xml);
        tsmt01700102 = tmp.getTsmt01700102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt01700102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt01700102 }
     *     
     */
    public Tsmt01700102 getTsmt01700102() {
        return tsmt01700102;
    }

    /**
     * Sets the value of the tsmt01700102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt01700102 }
     *     
     */
    public MxTsmt01700102 setTsmt01700102(Tsmt01700102 value) {
        this.tsmt01700102 = value;
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
    public static MxTsmt01700102 parse(String xml) {
        return ((MxTsmt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01700102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01700102) parserImpl.read(MxTsmt01700102 .class, xml, _classes));
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
     * Creates an MxTsmt01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01700102 message
     * @return
     *     a new instance of MxTsmt01700102
     */
    public final static MxTsmt01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01700102 .class);
    }

}
