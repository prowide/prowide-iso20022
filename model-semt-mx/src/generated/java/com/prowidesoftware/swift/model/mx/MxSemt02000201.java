
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
 * Class for semt.020.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMsgCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.020.002.01")
public class MxSemt02000201
    extends AbstractMX
{

    @XmlElement(name = "SctiesMsgCxlAdvc", required = true)
    protected SecuritiesMessageCancellationAdvice002V01 sctiesMsgCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification16 .class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification24 .class, GenericIdentification25 .class, MxSemt02000201 .class, NameAndAddress12 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, References9Choice.class, SecuritiesAccount17 .class, SecuritiesMessageCancellationAdvice002V01 .class, TransactionDetails19 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.020.002.01";

    public MxSemt02000201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02000201(final String xml) {
        this();
        MxSemt02000201 tmp = parse(xml);
        sctiesMsgCxlAdvc = tmp.getSctiesMsgCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02000201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMsgCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMessageCancellationAdvice002V01 }
     *     
     */
    public SecuritiesMessageCancellationAdvice002V01 getSctiesMsgCxlAdvc() {
        return sctiesMsgCxlAdvc;
    }

    /**
     * Sets the value of the sctiesMsgCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMessageCancellationAdvice002V01 }
     *     
     */
    public MxSemt02000201 setSctiesMsgCxlAdvc(SecuritiesMessageCancellationAdvice002V01 value) {
        this.sctiesMsgCxlAdvc = value;
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
    public static MxSemt02000201 parse(String xml) {
        return ((MxSemt02000201) MxReadImpl.parse(MxSemt02000201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02000201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02000201) parserImpl.read(MxSemt02000201 .class, xml, _classes));
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
     * Creates an MxSemt02000201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02000201 message
     * @return
     *     a new instance of MxSemt02000201
     */
    public final static MxSemt02000201 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt02000201 .class);
    }

}
