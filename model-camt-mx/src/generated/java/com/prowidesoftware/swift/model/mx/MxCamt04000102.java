
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.040.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04000102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.040.001.02")
public class MxCamt04000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.040.001.02", required = true)
    protected Camt04000102 camt04000102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04000102 .class, CashInForecast2 .class, CashOutForecast2 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EstimatedFundCashForecast1 .class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, GenericIdentification1 .class, MxCamt04000102 .class, NameAndAddress5 .class, NetCashForecast1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.040.001.02";

    public MxCamt04000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04000102(final String xml) {
        this();
        MxCamt04000102 tmp = parse(xml);
        camt04000102 = tmp.getCamt04000102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04000102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04000102 }
     *     
     */
    public Camt04000102 getCamt04000102() {
        return camt04000102;
    }

    /**
     * Sets the value of the camt04000102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04000102 }
     *     
     */
    public MxCamt04000102 setCamt04000102(Camt04000102 value) {
        this.camt04000102 = value;
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
    public static MxCamt04000102 parse(String xml) {
        return ((MxCamt04000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04000102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04000102) parserImpl.read(MxCamt04000102 .class, xml, _classes));
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
     * Creates an MxCamt04000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04000102 message
     * @return
     *     a new instance of MxCamt04000102
     */
    public final static MxCamt04000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04000102 .class);
    }

}
