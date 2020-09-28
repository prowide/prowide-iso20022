
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
 * Class for camt.023.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02300102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.023.001.02")
public class MxCamt02300102
    extends AbstractMX
{

    @XmlElement(name = "camt.023.001.02", required = true)
    protected Camt02300102 camt02300102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AmountChoice.class, Camt02300102 .class, CashClearingSystem1Code.class, ClearingSystemMemberIdentificationChoice.class, CurrencyAndAmount.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt02300102 .class, PaymentInstructionInformation.class, PaymentType2Choice.class, PaymentType3Code.class, SystemDetails1 .class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.023.001.02";

    public MxCamt02300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02300102(final String xml) {
        this();
        MxCamt02300102 tmp = parse(xml);
        camt02300102 = tmp.getCamt02300102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02300102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02300102 }
     *     
     */
    public Camt02300102 getCamt02300102() {
        return camt02300102;
    }

    /**
     * Sets the value of the camt02300102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02300102 }
     *     
     */
    public MxCamt02300102 setCamt02300102(Camt02300102 value) {
        this.camt02300102 = value;
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
    public static MxCamt02300102 parse(String xml) {
        return ((MxCamt02300102) MxReadImpl.parse(MxCamt02300102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02300102) parserImpl.read(MxCamt02300102 .class, xml, _classes));
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
     * Creates an MxCamt02300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02300102 message
     * @return
     *     a new instance of MxCamt02300102
     */
    public final static MxCamt02300102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02300102 .class);
    }

}
