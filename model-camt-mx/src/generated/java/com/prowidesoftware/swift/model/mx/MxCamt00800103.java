
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
 * Class for camt.008.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00800103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.008.001.03")
public class MxCamt00800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.008.001.03", required = true)
    protected Camt00800103 camt00800103;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt00800103 .class, MessageIdentification.class, MxCamt00800103 .class, PaymentIdentification3Choice.class, PaymentInstructionReferenceDetails2 .class, PaymentInstructionReferenceDetails4 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, QueueTransactionIdentificationDetails.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.008.001.03";

    public MxCamt00800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00800103(final String xml) {
        this();
        MxCamt00800103 tmp = parse(xml);
        camt00800103 = tmp.getCamt00800103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00800103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00800103 }
     *     
     */
    public Camt00800103 getCamt00800103() {
        return camt00800103;
    }

    /**
     * Sets the value of the camt00800103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00800103 }
     *     
     */
    public MxCamt00800103 setCamt00800103(Camt00800103 value) {
        this.camt00800103 = value;
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
    public static MxCamt00800103 parse(String xml) {
        return ((MxCamt00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00800103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00800103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00800103) parserImpl.read(MxCamt00800103 .class, xml, _classes));
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
     * Creates an MxCamt00800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00800103 message
     * @return
     *     a new instance of MxCamt00800103
     */
    public final static MxCamt00800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00800103 .class);
    }

}
