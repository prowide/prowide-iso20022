
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
 * Class for camt.026.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02600102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.026.001.02")
public class MxCamt02600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.026.001.02", required = true)
    protected Camt02600102 camt02600102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt02600102 .class, Case.class, CaseAssignment.class, CurrencyAndAmount.class, MissingOrIncorrectInformation1 .class, MxCamt02600102 .class, PaymentInstructionExtract2 .class, UnableToApplyIncorrectInfo2Code.class, UnableToApplyJustification1Choice.class, UnableToApplyMissingInfo1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.026.001.02";

    public MxCamt02600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02600102(final String xml) {
        this();
        MxCamt02600102 tmp = parse(xml);
        camt02600102 = tmp.getCamt02600102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02600102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02600102 }
     *     
     */
    public Camt02600102 getCamt02600102() {
        return camt02600102;
    }

    /**
     * Sets the value of the camt02600102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02600102 }
     *     
     */
    public MxCamt02600102 setCamt02600102(Camt02600102 value) {
        this.camt02600102 = value;
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
    public static MxCamt02600102 parse(String xml) {
        return ((MxCamt02600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02600102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02600102) parserImpl.read(MxCamt02600102 .class, xml, _classes));
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
     * Creates an MxCamt02600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02600102 message
     * @return
     *     a new instance of MxCamt02600102
     */
    public final static MxCamt02600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02600102 .class);
    }

}
