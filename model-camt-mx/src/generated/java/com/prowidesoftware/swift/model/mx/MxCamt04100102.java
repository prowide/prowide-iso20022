
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.041.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04100102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.041.001.02")
public class MxCamt04100102
    extends AbstractMX
{

    @XmlElement(name = "camt.041.001.02", required = true)
    protected Camt04100102 camt04100102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04100102 .class, CashInForecast2 .class, CashOutForecast2 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashForecast1 .class, GenericIdentification1 .class, MxCamt04100102 .class, NameAndAddress5 .class, NetCashForecast1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.041.001.02";

    public MxCamt04100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04100102(final String xml) {
        this();
        MxCamt04100102 tmp = parse(xml);
        camt04100102 = tmp.getCamt04100102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04100102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04100102 }
     *     
     */
    public Camt04100102 getCamt04100102() {
        return camt04100102;
    }

    /**
     * Sets the value of the camt04100102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04100102 }
     *     
     */
    public MxCamt04100102 setCamt04100102(Camt04100102 value) {
        this.camt04100102 = value;
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
    public static MxCamt04100102 parse(String xml) {
        return ((MxCamt04100102) MxReadImpl.parse(MxCamt04100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04100102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04100102) parserImpl.read(MxCamt04100102 .class, xml, _classes));
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
     * Creates an MxCamt04100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04100102 message
     * @return
     *     a new instance of MxCamt04100102
     */
    public final static MxCamt04100102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt04100102 .class);
    }

}
