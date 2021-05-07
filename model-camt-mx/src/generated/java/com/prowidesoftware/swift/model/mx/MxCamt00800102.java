
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
 * Class for camt.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00800102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.008.001.02")
public class MxCamt00800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.008.001.02", required = true)
    protected Camt00800102 camt00800102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt00800102 .class, MessageIdentification.class, MxCamt00800102 .class, PaymentIdentification2Choice.class, PaymentInstructionReferenceDetails2 .class, PaymentInstructionReferenceDetails3 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, QueueTransactionIdentificationDetails.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.008.001.02";

    public MxCamt00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00800102(final String xml) {
        this();
        MxCamt00800102 tmp = parse(xml);
        camt00800102 = tmp.getCamt00800102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00800102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00800102 }
     *     
     */
    public Camt00800102 getCamt00800102() {
        return camt00800102;
    }

    /**
     * Sets the value of the camt00800102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00800102 }
     *     
     */
    public MxCamt00800102 setCamt00800102(Camt00800102 value) {
        this.camt00800102 = value;
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
    public static MxCamt00800102 parse(String xml) {
        return ((MxCamt00800102) MxReadImpl.parse(MxCamt00800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00800102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00800102) parserImpl.read(MxCamt00800102 .class, xml, _classes));
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
     * Creates an MxCamt00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00800102 message
     * @return
     *     a new instance of MxCamt00800102
     */
    public final static MxCamt00800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00800102 .class);
    }

}
