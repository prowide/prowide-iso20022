
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
 * Class for setr.057.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrConfStsRptV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.057.001.01")
public class MxSetr05700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrConfStsRptV01", required = true)
    protected OrderConfirmationStatusReportV01 ordrConfStsRptV01;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 57;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, ConfirmationRejectedStatus1 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument10 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IndividualOrderConfirmationStatusAndReason1 .class, InvestmentAccount13 .class, MessageIdentification1 .class, MxSetr05700101 .class, NameAndAddress5 .class, OrderConfirmationStatus1Code.class, OrderConfirmationStatusReportV01 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedConfirmationStatusReason1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.057.001.01";

    public MxSetr05700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05700101(final String xml) {
        this();
        MxSetr05700101 tmp = parse(xml);
        ordrConfStsRptV01 = tmp.getOrdrConfStsRptV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrConfStsRptV01 property.
     * 
     * @return
     *     possible object is
     *     {@link OrderConfirmationStatusReportV01 }
     *     
     */
    public OrderConfirmationStatusReportV01 getOrdrConfStsRptV01() {
        return ordrConfStsRptV01;
    }

    /**
     * Sets the value of the ordrConfStsRptV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderConfirmationStatusReportV01 }
     *     
     */
    public MxSetr05700101 setOrdrConfStsRptV01(OrderConfirmationStatusReportV01 value) {
        this.ordrConfStsRptV01 = value;
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
    public static MxSetr05700101 parse(String xml) {
        return ((MxSetr05700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr05700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr05700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05700101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05700101) parserImpl.read(MxSetr05700101 .class, xml, _classes));
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
     * Creates an MxSetr05700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05700101 message
     * @return
     *     a new instance of MxSetr05700101
     */
    public final static MxSetr05700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05700101 .class);
    }

}
