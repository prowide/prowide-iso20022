
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
 * Class for camt.011.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "modfyLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.011.001.04")
public class MxCamt01100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ModfyLmt", required = true)
    protected ModifyLimitV04 modfyLmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AmountChoice.class, CashClearingSystem1Code.class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, LimitDetails4 .class, LimitDetailsStructure2 .class, LimitIdentificationDetails2 .class, LimitIdentificationDetails3 .class, LimitType2Code.class, MemberIdentificationChoice.class, MessageIdentification.class, ModifyLimitV04 .class, MxCamt01100104 .class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.011.001.04";

    public MxCamt01100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01100104(final String xml) {
        this();
        MxCamt01100104 tmp = parse(xml);
        modfyLmt = tmp.getModfyLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the modfyLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyLimitV04 }
     *     
     */
    public ModifyLimitV04 getModfyLmt() {
        return modfyLmt;
    }

    /**
     * Sets the value of the modfyLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyLimitV04 }
     *     
     */
    public MxCamt01100104 setModfyLmt(ModifyLimitV04 value) {
        this.modfyLmt = value;
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
    public static MxCamt01100104 parse(String xml) {
        return ((MxCamt01100104) MxReadImpl.parse(MxCamt01100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01100104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01100104) parserImpl.read(MxCamt01100104 .class, xml, _classes));
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
     * Creates an MxCamt01100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01100104 message
     * @return
     *     a new instance of MxCamt01100104
     */
    public final static MxCamt01100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01100104 .class);
    }

}
