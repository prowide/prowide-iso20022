
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
 * Class for setr.017.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrCxlStsRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.017.001.03")
public class MxSetr01700103
    extends AbstractMX
{

    @XmlElement(name = "OrdrCxlStsRptV03", required = true)
    protected OrderCancellationStatusReportV03 ordrCxlStsRptV03;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument10 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IndividualOrderStatusAndReason4 .class, InvestmentAccount13 .class, MessageIdentification1 .class, MxSetr01700103 .class, NameAndAddress5 .class, OrderCancellationStatus1Code.class, OrderCancellationStatusReportV03 .class, OrderStatusAndReason8 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus7 .class, RejectedStatusReason8Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.017.001.03";

    public MxSetr01700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01700103(final String xml) {
        this();
        MxSetr01700103 tmp = parse(xml);
        ordrCxlStsRptV03 = tmp.getOrdrCxlStsRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrCxlStsRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancellationStatusReportV03 }
     *     
     */
    public OrderCancellationStatusReportV03 getOrdrCxlStsRptV03() {
        return ordrCxlStsRptV03;
    }

    /**
     * Sets the value of the ordrCxlStsRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancellationStatusReportV03 }
     *     
     */
    public MxSetr01700103 setOrdrCxlStsRptV03(OrderCancellationStatusReportV03 value) {
        this.ordrCxlStsRptV03 = value;
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
    public static MxSetr01700103 parse(String xml) {
        return ((MxSetr01700103) MxReadImpl.parse(MxSetr01700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01700103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01700103) parserImpl.read(MxSetr01700103 .class, xml, _classes));
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
     * Creates an MxSetr01700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01700103 message
     * @return
     *     a new instance of MxSetr01700103
     */
    public final static MxSetr01700103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr01700103 .class);
    }

}
