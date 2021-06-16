
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
 * Class for camt.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01100102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.011.001.02")
public class MxCamt01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.011.001.02", required = true)
    protected Camt01100102 camt01100102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AmountChoice.class, Camt01100102 .class, CashClearingSystem1Code.class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, LimitDetails4 .class, LimitIdentificationDetails1 .class, LimitType1Code.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt01100102 .class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.011.001.02";

    public MxCamt01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01100102(final String xml) {
        this();
        MxCamt01100102 tmp = parse(xml);
        camt01100102 = tmp.getCamt01100102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01100102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01100102 }
     *     
     */
    public Camt01100102 getCamt01100102() {
        return camt01100102;
    }

    /**
     * Sets the value of the camt01100102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01100102 }
     *     
     */
    public MxCamt01100102 setCamt01100102(Camt01100102 value) {
        this.camt01100102 = value;
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
    public static MxCamt01100102 parse(String xml) {
        return ((MxCamt01100102) MxReadImpl.parse(MxCamt01100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01100102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01100102) parserImpl.read(MxCamt01100102 .class, xml, _classes));
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
     * Creates an MxCamt01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01100102 message
     * @return
     *     a new instance of MxCamt01100102
     */
    public final static MxCamt01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01100102 .class);
    }

}
