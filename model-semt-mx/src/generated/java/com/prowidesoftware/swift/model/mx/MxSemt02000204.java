
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.020.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMsgCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.020.002.04")
public class MxSemt02000204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesMsgCxlAdvc", required = true)
    protected SecuritiesMessageCancellationAdvice002V04 sctiesMsgCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 20;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {DeliveryReceiptType2Code.class, GenericIdentification24 .class, GenericIdentification25 .class, MxSemt02000204 .class, PartyIdentification51Choice.class, ReceiveDelivery1Code.class, References38Choice.class, SecuritiesAccount17 .class, SecuritiesMessageCancellationAdvice002V04 .class, SettlementTypeAndIdentification14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.020.002.04";

    public MxSemt02000204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02000204(final String xml) {
        this();
        MxSemt02000204 tmp = parse(xml);
        sctiesMsgCxlAdvc = tmp.getSctiesMsgCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02000204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMsgCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMessageCancellationAdvice002V04 }
     *     
     */
    public SecuritiesMessageCancellationAdvice002V04 getSctiesMsgCxlAdvc() {
        return sctiesMsgCxlAdvc;
    }

    /**
     * Sets the value of the sctiesMsgCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMessageCancellationAdvice002V04 }
     *     
     */
    public MxSemt02000204 setSctiesMsgCxlAdvc(SecuritiesMessageCancellationAdvice002V04 value) {
        this.sctiesMsgCxlAdvc = value;
        return this;
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
    public static MxSemt02000204 parse(String xml) {
        return ((MxSemt02000204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02000204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02000204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02000204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02000204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02000204 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02000204) parserImpl.read(MxSemt02000204 .class, xml, _classes));
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
     * Creates an MxSemt02000204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02000204 message
     * @return
     *     a new instance of MxSemt02000204
     */
    public static final MxSemt02000204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02000204 .class);
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

}
