
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
 * Class for camt.026.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.026.001.01")
public class MxCamt02600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.026.001.01", required = true)
    protected Camt02600101 camt02600101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt02600101 .class, Case.class, CaseAssignment.class, CurrencyAndAmount.class, MissingOrIncorrectInformation.class, MxCamt02600101 .class, PaymentInstructionExtract.class, UnableToApplyIncorrectInfo1Code.class, UnableToApplyJustificationChoice.class, UnableToApplyMissingInfo1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.026.001.01";

    public MxCamt02600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02600101(final String xml) {
        this();
        MxCamt02600101 tmp = parse(xml);
        camt02600101 = tmp.getCamt02600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02600101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02600101 }
     *     
     */
    public Camt02600101 getCamt02600101() {
        return camt02600101;
    }

    /**
     * Sets the value of the camt02600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02600101 }
     *     
     */
    public MxCamt02600101 setCamt02600101(Camt02600101 value) {
        this.camt02600101 = value;
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
    public static MxCamt02600101 parse(String xml) {
        return ((MxCamt02600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02600101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02600101) parserImpl.read(MxCamt02600101 .class, xml, _classes));
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
     * Creates an MxCamt02600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02600101 message
     * @return
     *     a new instance of MxCamt02600101
     */
    public final static MxCamt02600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02600101 .class);
    }

}
