
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
 * Class for semt.020.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMsgCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.020.002.05")
public class MxSemt02000205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesMsgCxlAdvc", required = true)
    protected SecuritiesMessageCancellationAdvice002V05 sctiesMsgCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DeliveryReceiptType2Code.class, GenericIdentification47 .class, GenericIdentification84 .class, MxSemt02000205 .class, PartyIdentification109 .class, PartyIdentification114Choice.class, ReceiveDelivery1Code.class, References53Choice.class, SecuritiesAccount27 .class, SecuritiesMessageCancellationAdvice002V05 .class, SettlementTypeAndIdentification22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.020.002.05";

    public MxSemt02000205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02000205(final String xml) {
        this();
        MxSemt02000205 tmp = parse(xml);
        sctiesMsgCxlAdvc = tmp.getSctiesMsgCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02000205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMsgCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMessageCancellationAdvice002V05 }
     *     
     */
    public SecuritiesMessageCancellationAdvice002V05 getSctiesMsgCxlAdvc() {
        return sctiesMsgCxlAdvc;
    }

    /**
     * Sets the value of the sctiesMsgCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMessageCancellationAdvice002V05 }
     *     
     */
    public MxSemt02000205 setSctiesMsgCxlAdvc(SecuritiesMessageCancellationAdvice002V05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt02000205 parse(String xml) {
        return ((MxSemt02000205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02000205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02000205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02000205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02000205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02000205 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02000205) parserImpl.read(MxSemt02000205 .class, xml, _classes));
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
     * Creates an MxSemt02000205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02000205 message
     * @return
     *     a new instance of MxSemt02000205
     */
    public final static MxSemt02000205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02000205 .class);
    }

}
