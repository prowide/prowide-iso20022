
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
 * Class for camt.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.044.001.01")
public class MxCamt04400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.044.001.01", required = true)
    protected Camt04400101 camt04400101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04400101 .class, CashInForecast2 .class, CashOutForecast2 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashForecast1 .class, FundConfirmedCashForecastReport1 .class, GenericIdentification1 .class, MxCamt04400101 .class, NameAndAddress5 .class, NetCashForecast1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.044.001.01";

    public MxCamt04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04400101(final String xml) {
        this();
        MxCamt04400101 tmp = parse(xml);
        camt04400101 = tmp.getCamt04400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04400101 }
     *     
     */
    public Camt04400101 getCamt04400101() {
        return camt04400101;
    }

    /**
     * Sets the value of the camt04400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04400101 }
     *     
     */
    public MxCamt04400101 setCamt04400101(Camt04400101 value) {
        this.camt04400101 = value;
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
    public static MxCamt04400101 parse(String xml) {
        return ((MxCamt04400101) MxReadImpl.parse(MxCamt04400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04400101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04400101) parserImpl.read(MxCamt04400101 .class, xml, _classes));
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
     * Creates an MxCamt04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04400101 message
     * @return
     *     a new instance of MxCamt04400101
     */
    public final static MxCamt04400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04400101 .class);
    }

}
